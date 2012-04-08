/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.activity;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This interface represents an Activity.
 * <p>
 * The activity construct represents an action undertaken by an performer/actor/user on or with a certain object. Additionally also a target object can be involved.
 * <p>
 * Thus, the constitutive parts of an activity are:
 * <ul>
 * <li>User {@link #getUserURI()}</li>
 * <li>Creation date {@link #getCreationDate()}</li>
 * <li>Action {@link #getActionURI()}</li>
 * <li>Object {@link #getObjectURI()}</li>
 * <li>Target {@link #getTargetURI()}</li>
 * </ul>
 * 
 * @author Stefan Huber
 */
public interface OldActivity {
    
    /*
     * @return returns the URI of the Activity. The URI represents the unique identifier of this Activity.
     */
    public String getActivityURI();      
    
     /*
     * @return returns the URI of the performer/actor/user of the activity.
     */
    public String getUserURI();
    
    /*
    * @return returns the date when the activity occurred, not necessary similar to the publishing date of the activity.
    */
    public Date getCreationDate();
    
    /*
    * @return returns an URI of an activities action.
    */
    public String getActionURI();
        
    /*
    * @return returns the involved direct object.
    */
    public Object getObject();
    
    /*
    * @return returns the name of the involved indirect object or target.
    */
    public Object getTarget();
    
    /*
    * @return returns the URI of the involved indirect object or target.
    */
    public String getTargetURI();
    
    /*
    * @return returns the URI of the activity provider.
    */
    public String getProviderURI();
    
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
