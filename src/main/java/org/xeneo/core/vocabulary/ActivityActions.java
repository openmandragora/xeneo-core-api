package org.xeneo.core.vocabulary;

/*
 * This Vocabulary should give the IRIs for the verbs or actions of activities, as specified in http://activitystrea.ms/head/activity-schema.html
 */

public class ActivityActions {
	
	private final static String baseIRI = "http://activitystrea.ms/schema/1.0/";
	
	public final static String ADD = baseIRI + "add";
	public final static String REMOVE = baseIRI + "remove";
	public final static String UPDATE = baseIRI + "update";
	
	public final static String SAVE = baseIRI + "save";
	public final static String DELETE = baseIRI + "delete";
	
}
