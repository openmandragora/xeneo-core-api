/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin.activity;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.xeneo.core.security.User;
import org.xeneo.core.activity.Activity;
import org.xeneo.core.activity.ActivityManager;

/**
 *
 * @author Stefan
 */
public abstract class AbstractActivityPlugin implements ActivityPlugin {

    private int pluginInstanceID;
    private Properties properties;
    private ActivityManager am;

    public void setActivityManager(ActivityManager am) {
        this.am = am;
    }

    public void setId(int id) {
        this.pluginInstanceID = id;
    }

    public int getId() {
        return this.pluginInstanceID;
    }

    protected String getOwnerURI() {
        return properties.getProperty("ownerURI");
    }

    public void setProperties(Properties props) {
        this.properties = props;
    }

    public Properties getProperties() {
        return this.properties;
    }

    protected User getUserMapping(String sourceUserString) {
        return null;
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