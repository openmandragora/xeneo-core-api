package org.xeneo.core.task;

import java.util.Collection;
import org.xeneo.core.security.User;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Stefan Huber
 */
public interface Case {
    public String getCaseURI();    
    public String getCaseTypeURI();
    
    public String getTitle();
    public String getDescription();
    public Date getCreationDate();
    
    public void update(String title, String description);
    
    public List<User> getParticipants();
    public void addParticipants(Collection<String> participants);
    
    public List<Task> getPreviousTasks();
    public List<Task> getRecommendedTasks();
    public Task getCurrentTask();
}
