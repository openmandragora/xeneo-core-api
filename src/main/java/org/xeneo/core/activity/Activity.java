package org.xeneo.core.activity;

import java.util.Date;

/**
 * This class represents an Activity. <p> The activity construct represents an
 * action undertaken by an performer/actor/user on or with a certain object.
 * Additionally also a target object can be involved. <p> Thus, the constitutive
 * parts of an activity are: <ul> <li>User {@link #getUserURI()}</li>
 * <li>Creation date {@link #getCreationDate()}</li> <li>Action {@link #getActionURI()}</li>
 * <li>Object {@link #getObjectURI()}</li> <li>Target {@link #getTargetURI()}</li>
 * </ul>
 *
 * @author Stefan Huber
 */
public class Activity {
    
    public static class Builder {
        private String activityURI;
        private Date creationDate;
        private Actor actor;
        private String actionURI;
        private Object object;
        private Object target;
        private String summary;
        private String description;
        private ActivityProvider activityProvider;
        
        public Builder() {}

        public Builder setActionURI(String actionURI) {
            this.actionURI = actionURI; return this;
        }

        public Builder setActivityProvider(String activityProviderURI, String activityProviderName, String activityProviderType) {
            ActivityProvider ap = new ActivityProvider(activityProviderURI,activityProviderName,activityProviderType);            
            this.activityProvider = ap; return this;
        }
        
        public Builder setActivityProvider(ActivityProvider ap) {                        
            this.activityProvider = ap; return this;
        }

        public Builder setActivityURI(String activityURI) {
            this.activityURI = activityURI; return this;
        }

        public Builder setActor(String actorURI, String actorName, String activityProviderURI) {
            Actor a = new Actor(actorURI, actorName, activityProviderURI);
            this.actor = a; return this;
        }
        
        public Builder setActor(Actor a) {            
            this.actor = a; return this;
        }

        public Builder setCreationDate(Date creationDate) {
            this.creationDate = creationDate; return this;
        }

        public Builder setDescription(String description) {
            this.description = description; return this;
        }

        public Builder setObject(String objectURI, String objectName, String objectTypeURI) {
            Object o = new Object(objectURI, objectName, objectTypeURI);
            this.object = o; return this;
        }
        
        public Builder setObject(Object o) {            
            this.object = o; return this;
        }

        public Builder setSummary(String summary) {
            this.summary = summary; return this;
        }

        public Builder setTarget(String targetURI, String targetName, String targetTypeURI) {
            Object o = new Object(targetURI, targetName, targetTypeURI);
            this.target = o; return this;
        }
        
        public Builder setTarget(Object o) {            
            this.target = o; return this;
        }
        
        public Activity build() {        
            
            return new Activity(this);
        }       
    }
    
    private Activity (Builder builder) {
        
        // mandatory activity parts
        assert builder.actionURI != null:"An Action URI has to be supplied!";
        actionURI = builder.actionURI;
        
        assert builder.activityURI != null:"An Activity URI has to be supplied!";
        activityURI = builder.activityURI;
        
        assert builder.creationDate != null:"A creation date of the activity has to be supplied!";
        creationDate = builder.creationDate;
        
        assert builder.actor != null:"An actor has to be supplied!";
        actor = builder.actor;
        
        assert builder.object != null:"An activity object has to be supplied!";
        object = builder.object;
        
        assert builder.activityProvider != null:"An activity provider has to be supplied!";
        activityProvider = builder.activityProvider;
        
        // optional activity parts
        target = builder.target;
        summary = builder.summary;
        description = builder.description;        
    }

    /*
     * This URI represents the unique identifier of this Activity.
     */
    private final String activityURI;
    private final Date creationDate;
    private final Actor actor;
    private final String actionURI;
    private final Object object;
    private final Object target;
    private final String summary;
    private final String description;
    private final ActivityProvider activityProvider;

    public String getActivityURI() {
        return activityURI;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Actor getActor() {
        return actor;
    }    

    public String getActionURI() {
        return actionURI;
    }
    
    public Object getObject() {
        return object;
    }
    
    public Object getTarget() {
        return target;
    }
   
    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }
    
    public ActivityProvider getActivityProvider() {
        return activityProvider;
    }
    
    @Override
    public String toString() {
        return "Activity with URI: " + activityURI;
    }
    /*
     * Mainly only the activityURI is telling equality.
     */
    @Override
    public boolean equals(java.lang.Object o) {
        if (o instanceof Activity) {
            Activity other = (Activity) o;
            return other.activityURI.equals(activityURI);
        }        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.activityURI != null ? this.activityURI.hashCode() : 0);
        hash = 23 * hash + (this.creationDate != null ? this.creationDate.hashCode() : 0);
        hash = 23 * hash + (this.actor != null ? this.actor.hashCode() : 0);
        hash = 23 * hash + (this.actionURI != null ? this.actionURI.hashCode() : 0);
        hash = 23 * hash + (this.object != null ? this.object.hashCode() : 0);
        hash = 23 * hash + (this.target != null ? this.target.hashCode() : 0);
        return hash;
    }
    
}
