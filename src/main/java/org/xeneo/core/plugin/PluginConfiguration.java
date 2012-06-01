/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.util.ArrayList;
import java.util.List;
import org.xeneo.core.plugin.PluginProperty;

/**
 *
 * @author Stefan Huber
 */
public class PluginConfiguration {
    
    private String pluginURI;
    private String title;
    private String description;
    private String ownerURI;
    
    private List<PluginProperty> pps;

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

    public List<PluginProperty> getPluginProperties() {
        return pps;
    }

    public void setPluginProperties(List<PluginProperty> pps) {
        this.pps = pps;
    }
    
    public void addPluginProperty(PluginProperty p) {
        if (pps == null) {
            pps = new ArrayList<PluginProperty>();
        }
        
        pps.add(p);
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
        hash = 79 * hash + (this.pps != null ? this.pps.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof PluginConfiguration) {
            PluginConfiguration check = (PluginConfiguration) o;
            
            if (check.title.equalsIgnoreCase(title) && check.pluginURI.equalsIgnoreCase(pluginURI) && check.pps.size() == pps.size())
                return true;
        }        
        
        return false;        
    }
    
    
}
