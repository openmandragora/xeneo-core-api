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
package org.xeneo.core.vocabulary;

/**
 *
 * @author Stefan Huber
 */
public enum Actions {
    
    add("http://activitystrea.ms/schema/1.0/add"),
    remove("http://activitystrea.ms/schema/1.0/remove"),
    update("http://activitystrea.ms/schema/1.0/update"),
    save("http://activitystrea.ms/schema/1.0/save"),
    delete("http://activitystrea.ms/schema/1.0/delete");
    
    public final String URI;
    
    Actions(String uri) {
        URI = uri;
    }        
    
}
