/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core;

import org.xeneo.core.security.User;
import org.xeneo.core.Activity;
import java.util.List;

/**
 *
 * @author Stefan Huber
 */
public interface Task {
    public String getTaskURI();
    
    public String getTitle();
    public String getDescription();
    
    public void updateTitle(String title);
    public void updateDescription(String description);
    
    public List<User> getParticipants();
    
    public List<Activity> getRecentActivities(int number);
    // public List<Activity> getActivities(Filter filter);
}
