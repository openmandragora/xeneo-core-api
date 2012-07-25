package org.xeneo.core.activity;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    
    private final Expression filterExpression;
    private final int lowerLimit;
    private final int upperLimit;
    
    // TODO: ORDER BY
    public Filter(Expression expression) { 
        filterExpression = expression;
        this.lowerLimit = 0;
        this.upperLimit = 100;
    }
    
    public Filter(Expression expression, int lowerLimit, int upperLimit) { 
        filterExpression = expression;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    
    public Filter(Expression expression, int upperLimit) { 
        filterExpression = expression;
        this.lowerLimit = 0;
        this.upperLimit = upperLimit;
    }
    
    public static enum Term {
        Task ("taskURI"),
        Case ("caseURI"),
        Actor ("actorURI"),
        Action ("actionURI"),
        Object ("objectURI"),
        ObjectType ("objectTypeURI"),
        Target ("targetURI"),
        TargetType ("targetTypeURI");
        
        private final String p;
        
        public String getParameter() {
            return p;
        }
        
        Term (String param) {
            p = param;
        }       
    }
    
    public static class Expression {       
    }
    
    public static final class RelationalExpression extends Expression {        
        private List<Expression> expr = null;
        private String relation;
        
        private RelationalExpression(String relation, Expression[] exps) {
            setRelation(relation);
            for (Expression e : exps) {
                addExpression(e);
            }
        }
        
        public List<Expression> getExpressions() {
            return expr;
        }
        
        public void addExpression(Expression exp) {
            if (expr == null)
                expr = new ArrayList<Expression>();
                
            expr.add(exp);
        }
        
        public void setRelation(String relation) {
            this.relation = relation;
        }
        
        public String getRelation() {
            return relation;
        }
    }
    
    public static final class ComparatorExpression extends Expression {          
        private String compare;
        private String a;
        private String b;
        
        private ComparatorExpression(String compare, Term a, String b) {
            setCompare(compare);
            this.a = a.getParameter();
            this.b = b;
        }
        
        public void setCompare(String c) {
            this.compare = c;
        }
    }
    
    public static Expression AND(Expression... exps) {        
        return new RelationalExpression("AND",exps);       
    }	
    
    public static Expression OR(Expression... exps) {        
        return new RelationalExpression("OR",exps);
    }
    
    public static Expression EQ(Term a, String b) {
        return new ComparatorExpression("=",a,b);        
    }
    
    public static Expression UQ(Term a, String b) {
        return new ComparatorExpression("<>",a,b);
    }
    
    // TODO: use StringBuilder  for Performance Reasons rahter than + String Concatenation...
    public String generateSQL() {
        return "WHERE " + generateSqlWhereClaus(filterExpression) + " ORDER BY CreationDate " + "LIMIT " + lowerLimit + ", " + upperLimit;
    }	
    
    private String generateSqlWhereClaus(Expression e) {
        String out = "";
        
        if (e instanceof RelationalExpression) {
            RelationalExpression ex = (RelationalExpression) e;
            
            List<Expression> list = ex.getExpressions();
            for (int i = 0; i < list.size(); i++) {
                out += (i==0 ? "( " : "") + generateSqlWhereClaus(list.get(i)) + " " + (list.size()-1 == i ? ")" : ex.getRelation() + " ");
            }
        } else if (e instanceof ComparatorExpression) {
            ComparatorExpression cx = (ComparatorExpression) e;
            out += cx.a + " " + cx.compare + " '" + cx.b + "' ";
        }
        
        return out;
    }
}
