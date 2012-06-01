
package org.xeneo.core.plugin;

/**
 *
 * @author Stefan Huber
 */
public interface Plugin {

    public void setId(int id);

    public int getId();

    public void setPluginConfiguration(PluginConfiguration pc);

    public void init();
}
