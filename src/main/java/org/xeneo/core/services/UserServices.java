
package org.xeneo.core.services;

import org.xeneo.core.security.User;

/**
 *
 * @author Stefan Huber
 */
public interface UserServices {

    public User getCurrentUser();

    public String getCurrentUserURI();
}
