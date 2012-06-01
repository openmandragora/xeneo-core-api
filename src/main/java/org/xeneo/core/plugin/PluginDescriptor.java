
package org.xeneo.core.plugin;

/**
 *
 * @author Stefan Huber
 */
public interface PluginDescriptor {
    
    public static final String PLUGIN_URI = "Plugin-URI";    
    public static final String PLUGIN_CLASSNAME = "Plugin-Classname";
    public static final String PLUGIN_TYPE = "Plugin-Type";
   
    public PluginProperty[] getProperties();
    
    public void addProperty(PluginProperty property);

    public Long getId();

    public void setId(Long Id);

    public PluginType getPluginType();

    public void setPluginType(PluginType pluginType);
      
    public String getDescription();

    public void setDescription(String description);

    public String getPluginClass();

    public void setPluginClass(String pluginClass);

    public String getPluginURI();

    public void setPluginURI(String pluginURI);

    public String getTitle();

    public void setTitle(String title);  
}
