/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Stefan Huber
 */
public interface Session {
    
    public Case getCaseByURI(String URI);
   
    public Case createCase(String caseTypeURI, String title);
    
    public Case createCase(String caseTypeURI, String title, String description);
   
    public Task createTask(String title);
    
    public Task createTask(String title, String description);
    
    public CaseType createCaseType(String title);
    
    public CaseType createCaseType(String title, String description);
    
    public Activity createActivity(String title, String userURI);
    
    public Activity createActivity(String title, Date creationDate);
    
    public Activity createActivity(String title, String userURI, Date creationDate);
    
    public Activity createActivity(String title, String caseURI, Collection<String> taskURIs);
    
    public Activity createActivity(String title, Map<String,Collection<String>> caseTaskURIs);
    
    public Activity createActivity(String title, String userURI, Date creationDate, String caseURI, Collection<String> taskURIs);
       
    public Activity createActivity(String title, String UserURI, Date creationDate, Map<String,Collection<String>> caseTaskURIs);
}
