/*
 * Copyright 2012 XENEO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xeneo.core.activity;

/**
 *
 * @author Markus Meingassner
 */
public class ActivityProvider {
    private String activityProviderType;
    private String activityProviderName;
    private String activityProviderURI;

    public ActivityProvider(String activityProviderURI, String activityProviderName, String activityProviderType) {
        this.activityProviderType = activityProviderType;
        this.activityProviderName = activityProviderName;
        this.activityProviderURI = activityProviderURI;
    }   
    
    public ActivityProvider() {}

    public String getActivityProviderName() {
        return activityProviderName;
    }

    public void setActivityProviderName(String activityProviderName) {
        this.activityProviderName = activityProviderName;
    }

    public String getActivityProviderType() {
        return activityProviderType;
    }

    public void setActivityProviderType(String activityProviderType) {
        this.activityProviderType = activityProviderType;
    }

    public String getActivityProviderURI() {
        return activityProviderURI;
    }

    public void setActivityProviderURI(String activityProviderURI) {
        this.activityProviderURI = activityProviderURI;
    }
    
}
