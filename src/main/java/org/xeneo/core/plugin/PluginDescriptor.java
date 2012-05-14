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
public class PluginDescriptor {
    
    public static final String PLUGIN_URI = "Plugin-URI";    
    public static final String PLUGIN_CLASSNAME = "Plugin-Classname";
    public static final String PLUGIN_TYPE = "Plugin-Type";
    
    public static final String ACTIVITY_PLUGIN_TYPE = "http://xeneo.org/plugin/type/activity-plugin";
    public static final String ACTIVITY_LISTENER_PLUGIN_TYPE = "http://xeneo.org/plugin/type/activity-listener-plugin";
    
    private String pluginURI;
    private String pluginClass;
    private String pluginType;
    private String title;
    private String description;
    private Long ID;
    
    private List<PluginProperty> instanceProperties;
    
    public List<PluginProperty> getInstanceProperties() {
        return instanceProperties;
    }
    
    public void addPluginInstanceProperty(PluginProperty pi) {
        // TODO check if already exists, than update otherwise add...
        instanceProperties.add(pi);
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }
      
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPluginClass() {
        return pluginClass;
    }

    public void setPluginClass(String pluginClass) {
        this.pluginClass = pluginClass;
    }

    public String getPluginURI() {
        return pluginURI;
    }

    public void setPluginURI(String pluginURI) {
        this.pluginURI = pluginURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {        
        this.title = title;
    }
  
}
