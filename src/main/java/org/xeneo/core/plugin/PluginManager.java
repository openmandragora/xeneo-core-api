/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.util.List;

/**
 *
 * @author Stefan Huber
 */
public interface PluginManager {
    
    /*
     * Adds a new Plugin based on the given PluginDescriptor, if a plugin with the given PluginURI doesn't already exists. Otherwise the plugin is updated.
     */
    public void addPlugin(PluginDescriptor descriptor);
    
    public void deactivatePlugin(String pluginURI);
    
    // public List<PluginDescriptor> listAvailablePlugins(String[] types);
    
    // public PluginDescriptor getPluginDescriptor(String pluginURI);
    
}
