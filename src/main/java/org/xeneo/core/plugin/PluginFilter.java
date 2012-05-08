/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

/**
 *
 * @author Stefan Huber
 */
public class PluginFilter implements FileFilter {

    private List<String> extensions;

    public PluginFilter(String[] ext) {
        this();
        extensions.addAll(Arrays.asList(ext));
    }
    
    public PluginFilter() {
        extensions = new ArrayList<String>();        
        extensions.add("jar");
    }

    public boolean accept(File pathname) {

        Iterator<String> it = extensions.iterator();
        while (it.hasNext()) {
            if (pathname.getName().toLowerCase().endsWith(it.next())) {
                return true;
            }
        }
        
        return false;
    }
}
