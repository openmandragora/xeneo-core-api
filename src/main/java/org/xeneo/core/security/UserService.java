
package org.xeneo.core.security;

/**
 *
 * @author Stefan Huber
 */
public interface UserService {

    public User getCurrentUser();

    public String getCurrentUserURI();   
    
}
