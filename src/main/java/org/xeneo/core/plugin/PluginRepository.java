
package org.xeneo.core.plugin;

import java.util.List;

/**
 *
 * @author Stefan Huber
 */
public interface PluginRepository {
    
    public void addPlugin(PluginConfiguration pc);
    
    public void configurePlugin(PluginConfiguration pc);
    
    public List<PluginConfiguration> listAvailablePlugins(String userURI, PluginType[] pts);
    
}
