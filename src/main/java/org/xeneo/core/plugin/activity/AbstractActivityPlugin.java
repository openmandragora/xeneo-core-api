/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin.activity;

import org.xeneo.core.security.User;
import org.xeneo.core.activity.Activity;
import org.xeneo.core.plugin.PluginConfiguration;
import org.xeneo.core.activity.ActivityManager;

/**
 *
 * @author Stefan
 */
public abstract class AbstractActivityPlugin implements ActivityPlugin  {    
       
    private int pluginInstanceID;
    private PluginConfiguration configuration;
    
    private ActivityManager am;
    
    public void setActivityManager(ActivityManager am) {
        this.am = am;
    }
    
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
    
    protected String getOwnerURI() {
        return this.getPluginConfiguration().getOwnerURI();
    }
    
    protected User getUserMapping(String sourceUserString) {
        return null;
    }
    
    protected void addActivity(Activity activity) {
        am.addActivity(activity, getPluginConfiguration().getTaskContext());
    }
    
    protected boolean isExistingActivity(String uri) {
        return am.isExistingActivity(uri);
    }    
}