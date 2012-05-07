/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.services;

import org.xeneo.core.security.User;

/**
 *
 * @author Stefan Huber
 */
public interface UserServices {
    
    public User getCurrentUser();
    
    public String getCurrentUserURI();
    
    public String getCurrentUsername();        
    
    public User getUserMapping(String externalUsername, String pluginURI);       
    
}
