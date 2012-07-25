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
package org.xeneo.core.activity;

import org.junit.*;
import static org.junit.Assert.*;
import static org.xeneo.core.activity.Filter.*;
import static org.xeneo.core.activity.Filter.Term.*;

/**
 *
 * @author Stefan
 */
public class FilterTest {   
    
    public FilterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testVariousFilters() {
    
        Filter f = new Filter(AND(EQ(Action,"bb"),OR(EQ(Object,"aa"),EQ(ObjectType,"yy"))),100);       
        
        System.out.println(f.generateSQL());
    }
}
