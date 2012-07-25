
package org.xeneo.core.security;

/**
 *
 * @author Stefan Huber
 */
public class User {
    
    private String userURI;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(String userURI, String firstName, String lastName, String email, String password) {
        this.userURI = userURI;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserURI() {
        return userURI;
    }

    public String getUsername() {        
        return userURI.substring(userURI.lastIndexOf("#")+1,userURI.length());
    }
    
}
