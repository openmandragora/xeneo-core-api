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
    
    
    // TODO:
    /*
    User mappings:
    public User getUserMapping(PluginContext pc, String externalUsername)
    
     
    
     
     */
    
}
