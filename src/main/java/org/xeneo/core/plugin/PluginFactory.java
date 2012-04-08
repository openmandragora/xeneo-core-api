/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.xeustechnologies.jcl.JarClassLoader;
import org.xeustechnologies.jcl.JclObjectFactory;

/**
 *
 * @author Stefan Huber
 */
public abstract class PluginFactory {
    
    private static Logger logger = Logger.getLogger(PluginFactory.class);
    
    protected static Map<String,Map<String,String>> plugins = null;
       
    protected String pluginDirectory = "";
    
    public void setPluginDirectory(String dir) {
        pluginDirectory = dir;
    }
    
    /*
     * load the plugin configurations from plugin directory
     */
    public void loadPluginConfigurations() throws IOException, PluginException {
        
        if (plugins == null) {
            plugins = new HashMap<String,Map<String,String>>();
        }
        
        File ext = new File(pluginDirectory);
        if (ext.exists() && ext.canRead() && ext.isDirectory()) {
            File[] ps = ext.listFiles(new PluginFilter());
            
            Map<String,String> config;
            for(int i=0;i<ps.length;i++) {            
                logger.info("Try to load configurations of: " + pluginDirectory + "/" + ps[i].getName());
                
                JarClassLoader jcl = new JarClassLoader();       
                jcl.add(pluginDirectory + "/" + ps[i].getName());    
                InputStream is = jcl.getResourceAsStream("config/plugin.properties");    
                                
                Properties p = new Properties();
                p.load(is);
                
                String uri = "";
                if(p.containsKey(Plugin.CONFIG_URI)) {
                    uri = p.getProperty(Plugin.CONFIG_URI);
                    
                    if (!plugins.containsKey(uri)) {
                        plugins.put(uri, new HashMap<String,String>());
                    }
                } else {
                    throw new PluginException("The URI of the Plugin ("+ps[i].getName().toLowerCase()+") wasn't set in the configuriation properties! Please set an " + Plugin.CONFIG_URI + " parameter within the plugin.properties file.");
                }
                
                if(p.containsKey(Plugin.CONFIG_CLASSNAME)) {
                    config = plugins.get(uri);
                    config.put(Plugin.CONFIG_CLASSNAME, p.getProperty(Plugin.CONFIG_CLASSNAME));
                    
                    // also add the filename of the plugin
                    config.put(Plugin.CONFIG_FILENAME, ps[i].getName().toLowerCase());
                } else {
                    throw new PluginException("The Classname of the Plugin ("+ps[i].getName().toLowerCase()+") wasn't set in the configuriation properties! Please set an " + Plugin.CONFIG_CLASSNAME + " parameter within the plugin.properties file.");
                }              
                    
                if(p.containsKey(Plugin.CONFIG_TITLE)) {
                    config = plugins.get(uri);
                    config.put(Plugin.CONFIG_TITLE, p.getProperty(Plugin.CONFIG_TITLE));
                } else {
                    config = plugins.get(uri);
                    config.put(Plugin.CONFIG_TITLE, "Default Title");
                }       
                
                if(p.containsKey(Plugin.CONFIG_DESCRIPTION)) {
                    config = plugins.get(uri);
                    config.put(Plugin.CONFIG_DESCRIPTION, p.getProperty(Plugin.CONFIG_DESCRIPTION));
                } else {
                    config = plugins.get(uri);
                    config.put(Plugin.CONFIG_DESCRIPTION, "Default Description");
                }                  
            }           
        } else {
            throw new IOException("The specified Plugin Directory (" + pluginDirectory + ") doesn't exist, or is not readable!");
        }       
    }
    
    
    
    protected void initializePlugins() throws IOException, PluginException {
        loadPluginConfigurations();
        
        Iterator<String> it = plugins.keySet().iterator();
        while (it.hasNext()) {
            String uri = it.next();
            Map<String,String> configs = plugins.get(uri);
            
            if (pluginExists(uri)) {
                updatePlugin(configs);
            } else {
                addPlugin(configs);
            }                 
        }        
    }
    
    public abstract Plugin createPluginInstance(String uri, Properties props);
    public abstract boolean pluginExists(String uri);
    public abstract void updatePlugin(Map<String,String> configs);
    public abstract void addPlugin(Map<String,String> configs);        
     
    public Plugin loadPluginInstance(String uri) throws PluginException {
        logger.info("Try loading Plugin " + uri);
        Map<String,String> cfs;
        if (plugins.containsKey(uri)) {        
            cfs = plugins.get(uri);
        } else {
            throw new PluginException("There is no Pluing for the URI: " +uri+ " specified! Please reject your URI!");
        }            
               
        JarClassLoader jcl = new JarClassLoader();       
        jcl.add(pluginDirectory + "/" + cfs.get(Plugin.CONFIG_FILENAME));                
        JclObjectFactory factory = JclObjectFactory.getInstance();      
        
        logger.info("Try to create an instance of Plugin with URI: " + uri);
        return (Plugin) factory.create(jcl, cfs.get(Plugin.CONFIG_CLASSNAME));
    }
}
