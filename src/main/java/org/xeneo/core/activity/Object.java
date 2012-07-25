package org.xeneo.core.activity;

public class Object {

	private String objectURI;
	private String objectTypeURI;
	private String objectName;

        public Object(String objectURI, String objectName, String objectTypeURI) {
            this.objectURI = objectURI;
            this.objectTypeURI = objectTypeURI;
            this.objectName = objectName;
        }       
        
        public Object() {}

	public String getObjectURI() {
		return objectURI;
	}
	public void setObjectURI(String objectURI) {
		this.objectURI = objectURI;
	}
	public String getObjectTypeURI() {
		return objectTypeURI;
	}
	public void setObjectTypeURI(String objectTypeURI) {
		this.objectTypeURI = objectTypeURI;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}	
}
