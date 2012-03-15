/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.stefanhuber.flower.core.security;

/**
 *
 * @author Stefan Huber
 */
public interface UserServices {
    
    public User getCurrentUser();
    
    public String getCurrentUserURI();
    
    public String getCurrentUsername();    
    
}
