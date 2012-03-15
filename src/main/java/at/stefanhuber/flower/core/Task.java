/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.stefanhuber.flower.core;

import at.stefanhuber.flower.core.security.User;
import at.stefanhuber.flower.core.Activity;
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
