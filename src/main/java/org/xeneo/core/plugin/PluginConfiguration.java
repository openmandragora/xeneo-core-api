package org.xeneo.core.plugin;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Stefan Huber
 */
public class PluginConfiguration implements PluginConfigurator, PluginDescriptor {

    private String pluginURI;
    private String title;
    private String description;
    private String ownerURI;
    private PluginType pluginType;
    private Long id;
    private String pluginClass;
    
    private Collection<PluginProperty> properties = new HashSet<PluginProperty>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerURI() {
        return ownerURI;
    }

    public void setOwnerURI(String ownerURI) {
        this.ownerURI = ownerURI;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.pluginURI != null ? this.pluginURI.hashCode() : 0);
        hash = 79 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 79 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 79 * hash + (this.ownerURI != null ? this.ownerURI.hashCode() : 0);
        hash = 79 * hash + (this.properties != null ? this.properties.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PluginConfiguration) {
            PluginConfiguration check = (PluginConfiguration) o;

            if (check.title.equalsIgnoreCase(title) && check.pluginURI.equalsIgnoreCase(pluginURI) && check.properties.size() == properties.size()) {
                return true;
            }
        }

        return false;
    }

    public void addProperty(PluginProperty pp) {
        properties.add(pp);
    }

    public PluginProperty[] getProperties() {
        return properties.toArray(new PluginProperty[properties.size()]);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public String getPluginClass() {
        return this.pluginClass;
    }

    public void setPluginClass(String pluginClass) {
        this.pluginClass = pluginClass;
    }

    public void setPluginType(PluginType pluginType) {
        this.pluginType = pluginType;
    }

    public PluginType getPluginType() {
        return this.pluginType;
    }
}
