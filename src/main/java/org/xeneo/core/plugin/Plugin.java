/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public interface Plugin {   
    
    public void setId(int id);
    public int getId();
    
    public void setProperties(Properties properties);
    public Properties getProperties();
    
    public void init();
    
}
