/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.services;

import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public interface PluginServices {
    
    // public TODO: get available Plugins
    public void addPlugin(String pluginURI,String title,String description, String pluginClass);
    
    public void updatePlugin(String pluginURI,String title,String description, String pluginClass);
    
    public void configurePluginInstance(int id, Properties properties);
    
    public void addPluginInstance(String pluginURI, Properties properties);
    
    public void removePluginInstance(int id);
    
}
