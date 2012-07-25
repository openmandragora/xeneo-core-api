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
package org.xeneo.core.security;

import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public class Oauth2Provider implements SecurityProvider {

    private Properties props;
    private String identifier;
    
    public boolean isAuthenticated() {
        return !props.getProperty("token").isEmpty();
    }

    public AuthType getAuthType() {
        return AuthType.OAuth2;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public Properties getProperties() {
        return this.props;
    }
    
    public Oauth2Provider(String token, String identifier) {
        props = new Properties();
        props.put("token", token);
        
        this.identifier = identifier;
    }
    
}
