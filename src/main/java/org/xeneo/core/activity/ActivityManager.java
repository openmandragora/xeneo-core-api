package org.xeneo.core.activity;

import java.util.Collection;
import java.util.Map;

public interface ActivityManager {

	public void addActivity(Activity activity);
	public void addActivity(Activity activity, String caseURI, Collection<String> taskURIs);
	public void addActivity(Activity activity, Map<String,Collection<String>> caseTaskURIs);
	
    /*
     * Add a task context to the Activity for a specific case.
     * 
     * @param activityURI The URI of an activity
     * @param caseURI The URI of a case
     * @param taskURIs a Collection of task URIs
     */
    public void addTaskContexts(String activityURI, String caseURI, Collection<String> taskURIs);
    public void addTaskContexts(String activityURI, Map<String,Collection<String>> caseTaskURIs);
    public void removeTaskContexts(String activityURI, String caseURI, Collection<String> taskURIs);
    public void removeTaskContexts(String activityURI, Map<String,Collection<String>> caseTaskURIs);
    
    public Map<String,Collection<String>> getTaskContexts(String activityURI); 
	
	
}
