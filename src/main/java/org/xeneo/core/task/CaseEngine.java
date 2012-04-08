/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.task;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.xeneo.core.activity.OldActivity;

/**
 *
 * @author Stefan Huber
 */
public interface CaseEngine {
    
    public Case getCaseByURI(String URI);
   
    public Case createCase(String caseTypeURI, String title);
    
    public Case createCase(String caseTypeURI, String title, String description);
   
    public Task createTask(String title);
    
    public Task createTask(String title, String description);
    
    public CaseType createCaseType(String title);
    
    public CaseType createCaseType(String title, String description);
 }
