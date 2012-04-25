package org.xeneo.core.plugin;

/**
 *
 * @author Stefan Huber
 */
public interface PluginInstanceManager {
    
    public int createPluginInstance(String pluginURI, String ownerURI);
    
    public void addPluginConfiguration(int id, PluginConfiguration pc);
    
    public void removePluginInstance(int id);    
}
