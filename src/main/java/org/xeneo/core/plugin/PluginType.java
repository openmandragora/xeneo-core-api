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
package org.xeneo.core.plugin;

/**
 *
 * @author Stefan Huber
 */
public enum PluginType {
    
    ACTIVITY_PLUGIN ("http://xeneo.org/plugin/type/activity-plugin"),
    ACTIVITY_LISTENER_PLUGIN("http://xeneo.org/plugin/type/activity-listener-plugin");
    
    private final String typeURI;
    
    PluginType(String typeURI) {
        this.typeURI = typeURI;
    }
    
    public String typeURI() {
        return this.typeURI;
    }
    
}
