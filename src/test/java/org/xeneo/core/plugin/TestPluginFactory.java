/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public class TestPluginFactory extends PluginFactory {

    @Override
    public Plugin createPluginInstance(String uri, Properties props) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean pluginExists(String uri) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updatePlugin(Map<String, String> configs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addPlugin(Map<String, String> configs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
