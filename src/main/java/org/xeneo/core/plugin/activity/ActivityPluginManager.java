/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin.activity;

import org.xeneo.core.plugin.PluginConfiguration;

/**
 *
 * @author Stefan Huber
 */
public interface ActivityPluginManager {
    
    public void startActivityPlugin(String pluginURI, String ownerURI, PluginConfiguration pc);
    
    public void stopActivityPlugin(String pluginURI, String ownerURI);
    
    public void removeActivityPluginConfiguration();
}
