/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.util.Properties;

/**
 *
 * @author Stefan Huber
 */
public interface Plugin extends Runnable {
    
    public static String CONFIG_URI = "uri";
    public static String CONFIG_FILENAME = "filename";
    public static String CONFIG_CLASSNAME = "classname";
    public static String CONFIG_TITLE = "title";
    public static String CONFIG_DESCRIPTION = "description";
    
    public int getUpdateInterval();
    
    public void setProperties(Properties properties);
    
    public void init();
    
}
