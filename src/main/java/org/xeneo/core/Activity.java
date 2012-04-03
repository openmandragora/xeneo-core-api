/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This interface represents an Activity.
 * 
 * An Activity is something a specific User has done, within the context of tasks and also cases. The activity has one date.
 * Test
 * @author Stefan Huber
 */
public interface Activity {
    
    /*
     * @return returns the URI of the Activity.
     */
    public String getActivityURI();  
    
     /*
     * @return returns the URI of the Activity.
     */
    public String getUserURI();
    public Date getCreationDate();
    
    public String getTitle();    
    
    /*
     * Add a task context to the Activity for a specific case.
     * 
     * @param caseURI The URI of a case
     * @param taskURIs a Collection of task URIs
     */
    public void addTaskContexts(String caseURI, Collection<String> taskURIs);
    public void addTaskContexts(Map<String,Collection<String>> caseTaskURIs);
    public void removeTaskContexts(String caseURI, Collection<String> taskURIs);
    public void removeTaskContexts(Map<String,Collection<String>> caseTaskURIs);
    
    public Collection<String> getTaskContextsByCaseURI(String caseURI);
    public Map<String,Collection<String>> getTaskContexts();
    
    
}
