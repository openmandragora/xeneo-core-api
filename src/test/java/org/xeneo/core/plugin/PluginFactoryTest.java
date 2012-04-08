/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.junit.*;

/**
 *
 * @author Stefan Huber
 */
public class PluginFactoryTest {

    PluginFactory pf;
    Logger logger = Logger.getLogger(PluginFactoryTest.class);
    
    public PluginFactoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        pf = new TestPluginFactory();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPluginLoading() {
        
        pf.setPluginDirectory("target/test-classes");
        
        try {
            pf.loadPluginConfigurations();
        } catch (IOException ex) {
            logger.error(ex.getMessage());
        } catch (PluginException ex) {
            logger.error(ex.getMessage());
        }
        
    }
    
    @Test
    public void testLoadingPluginInstances() {
        
        pf.setPluginDirectory("target/test-classes");
        try {
            List<Plugin> plugins = new ArrayList<Plugin>();
            
            for(int i = 0; i < 200; i++) {
                logger.info(i + "RSS-Plugin loaded!");
                if (i< 100)
                    plugins.add(pf.loadPluginInstance("http://stefanhuber.at/rss-plugin"));      
                if (i >= 100)
                    plugins.add(pf.loadPluginInstance("http://stefanhuber.at/rsii-plugin"));
            }
            
            for(int i = 0; i < 200; i++) {   
                logger.info(i + "RSS-Plugin run!");
                plugins.get(i).run();    
            }
            
        } catch (PluginException ex) {
            java.util.logging.Logger.getLogger(PluginFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
