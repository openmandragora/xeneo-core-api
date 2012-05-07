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
 * @author Stefan Huber
 */
public class Actor {
    
    private String actorURI;
    private String actorName;
    private Object ActivityProvider;

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorURI() {
        return actorURI;
    }

    public void setActorURI(String actorURI) {
        this.actorURI = actorURI;
    }

    public Object getActivityProvider() {
        return ActivityProvider;
    }

    public void setActivityProvider(Object ActivityProvider) {
        this.ActivityProvider = ActivityProvider;
    }
    
}
