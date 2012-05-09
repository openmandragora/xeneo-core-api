/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.task;

/**
 *
 * @author Stefan Huber
 */
public interface CaseType {
    
    public String getCaseTypeURI();
    public String getTitle();
    public String getDescription();
    
    public void updateTitle(String title);
    public void updateDescription(String description);
}
