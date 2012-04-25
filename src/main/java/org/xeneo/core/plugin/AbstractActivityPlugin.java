/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

/**
 *
 * @author Stefan
 */
public abstract class AbstractActivityPlugin implements ActivityPlugin  {    
       
    private int pluginInstanceID;
    private PluginConfiguration configuration;
    
    public void setID(int id) {
        this.pluginInstanceID = id;
    }
    
    public int getID() {
        return this.pluginInstanceID;
    }
    
    public void setPluginConfiguration(PluginConfiguration pc) {
        configuration = pc;
    }
    
    public PluginConfiguration getPluginConfiguration() {
        return this.configuration;
    }
    
    
}
