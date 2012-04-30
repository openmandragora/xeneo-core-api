package org.xeneo.core.plugin;

import java.util.List;

/**
 *
 * @author Stefan Huber
 */
public interface PluginInstanceManager {
    
    public void createPluginInstance(String pluginURI, String ownerURI);
    
    public void removePluginInstance(String pluginURI, String ownerURI);
    
    public void addPluginConfiguration(String pluginURI, String ownerURI, PluginConfiguration pc);
    
    public void removePluginConfiguration(String pluginURI, String ownerURI, int configuratinId);    
    
    public List<PluginConfiguration> listPluginConfigurations(String pluginURI, String ownerURI);
}
