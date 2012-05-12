package org.xeneo.core.plugin;

import java.util.List;

/**
 *
 * @author Stefan Huber
 */
public interface PluginInstanceManager {
    
    public void createPluginInstance(String pluginURI, String ownerURI);
    
    public void removePluginInstance(String pluginURI, String ownerURI);
    
    public void addPluginInstanceProperties(PluginConfiguration pc);
    
    public void addPluginConfiguration(PluginConfiguration pc);
    
    public void removePluginConfiguration(int configuratinId);    
    
    public List<PluginConfiguration> listPluginConfigurations(String pluginURI, String ownerURI);
}
