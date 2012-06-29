/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.task;

import org.xeneo.core.XeneoException;

/**
 *
 * @author Stefan Huber
 */
public interface CaseEngine {
    
    public Case getCaseByURI(String URI) throws XeneoException;
   
    public Case createCase(String caseTypeURI, String title);
    
    public Case createCase(String caseTypeURI, String title, String description);
   
    public Task createTask(String title);
    
    public Task createTask(String title, String description);
    
    public CaseType createCaseType(String title);
    
    public CaseType createCaseType(String title, String description);
 }
