/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.task;

import java.util.List;

import org.xeneo.core.security.User;

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
}
