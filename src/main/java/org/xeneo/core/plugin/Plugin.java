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
    
    public void setID(int id);
    public int getID();
    
    public void setPluginConfiguration(PluginConfiguration pc);
    public PluginConfiguration getPluginConfiguration();
    
    public void init();
    
}
