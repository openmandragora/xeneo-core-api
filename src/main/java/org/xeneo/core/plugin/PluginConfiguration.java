/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public class PluginConfiguration {
    
    private final int pluginConfigurationID;  
    private String ownerURI;
    private String pluginURI;

    public String getPluginURI() {
        return pluginURI;
    }

    public void setPluginURI(String pluginURI) {
        this.pluginURI = pluginURI;
    }
    
    private Properties properties;
    private Map<String,Collection<String>> taskContext;
        
    public PluginConfiguration(int id) {
        this.pluginConfigurationID = id;        
    }
    
    public PluginConfiguration() {
        this.pluginConfigurationID = -1;
    }
    
    public int getID() {
        return this.pluginConfigurationID;
    }
       
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getOwnerURI() {
        return ownerURI;
    }

    public void setOwnerURI(String ownerURI) {
        this.ownerURI = ownerURI;
    }

    public Map<String, Collection<String>> getTaskContext() {
        return taskContext;
    }

    public void setTaskContext(Map<String, Collection<String>> taskContext) {
        this.taskContext = taskContext;
    }       
}
