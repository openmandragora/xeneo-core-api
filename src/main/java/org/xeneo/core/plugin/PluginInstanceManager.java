package org.xeneo.core.plugin;

import java.util.List;
import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public interface PluginInstanceManager {
    
    public void createPluginInstance(String pluginURI, String ownerURI);
    
    public void removePluginInstance(String pluginURI, String ownerURI);
    
    public void addPluginInstanceProperties(Properties properties);
    
    public void addPluginConfiguration(PluginConfiguration pc);
    
    public void removePluginConfiguration(int configuratinId);    
    
    public List<PluginConfiguration> listPluginConfigurations(String pluginURI, String ownerURI);
}
