/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.stefanhuber.flower.core;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Stefan Huber
 */
public interface Activity {
    
    public String getActivityURI();    
    public String getUserURI();
    public Date getCreationDate();
    
    public String getTitle();    
    
    public void addTaskContexts(String caseURI, Collection<String> taskURIs);
    public void addTaskContexts(Map<String,Collection<String>> caseTaskURIs);
    public void removeTaskContexts(String caseURI, Collection<String> taskURIs);
    public void removeTaskContexts(Map<String,Collection<String>> caseTaskURIs);
    
    public List<String> getTaskURIs();    
    public List<String> getCaseURIs();
    
    
}
