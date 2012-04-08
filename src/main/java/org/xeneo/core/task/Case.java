package org.xeneo.core.task;

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
    
    public void updateTitle(String title);
    public void updateDescription(String description);
    
    public List<User> getParticipants();
    
    public List<Task> getPreviousTasks();
    public List<Task> getRecommendedTasks();
    public Task getCurrentTask();
}
