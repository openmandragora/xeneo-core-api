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
 * @author Stefan Huber
 */
public class PluginProperty {

    private String name;
    private String value;    
    private PluginPropertyType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(PluginPropertyType type) {
        this.type = type;
    }
    
    public void setType(String propertyType) {
        type = PluginPropertyType.valueOf(propertyType);
    }

    public PluginPropertyType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PluginProperty{" + "name=" + name + ", value=" + value + ", type=" + type.name() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PluginProperty) {
            PluginProperty pp = (PluginProperty) o;
            if (pp.getName().equalsIgnoreCase(getName()) && pp.getType().equals(getType())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + (this.value != null ? this.value.hashCode() : 0);
        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;
    }
}
