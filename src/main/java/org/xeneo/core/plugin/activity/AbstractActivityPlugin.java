/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin.activity;

import java.util.Iterator;
import java.util.List;
import org.xeneo.core.activity.Activity;
import org.xeneo.core.activity.ActivityRepository;
import org.xeneo.core.plugin.PluginConfiguration;
import org.xeneo.core.plugin.PluginProperty;

/**
 *
 * @author Stefan Huber
 */
public abstract class AbstractActivityPlugin implements ActivityPlugin {

    private int pluginInstanceID;
    private PluginConfiguration pc;
    private ActivityRepository am;

    public PluginConfiguration getPluginConfiguration() {
        return pc;
    }
    
    public PluginProperty[] getPluginProperties() {
        return getPluginConfiguration().getProperties();
    }

    public void setPluginConfiguration(PluginConfiguration pc) {
        this.pc = pc;
    }    

    public void setActivityRepository(ActivityRepository am) {
        this.am = am;
    }

    public void setId(int id) {
        this.pluginInstanceID = id;
    }

    public int getId() {
        return this.pluginInstanceID;
    }

    public String getOwnerURI() {
        return pc.getOwnerURI();
    }

    protected void addActivity(Activity activity) {
        am.addActivity(activity);
    }

    protected boolean isExistingActivity(String uri) {
        return am.isExistingActivity(uri);
    }

    public void run() {
        Iterator<Activity> it = getActivities().iterator();
        Activity a;
        while (it.hasNext()) {
            a = it.next();
            if (!isExistingActivity(a.getActivityURI())) {
                addActivity(a);
            }
        }
    }

    public abstract List<Activity> getActivities();
}