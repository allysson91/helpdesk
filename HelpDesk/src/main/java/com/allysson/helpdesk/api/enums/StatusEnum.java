package com.allysson.helpdesk.api.enums;

public enum StatusEnum {

	New,
	Assigned,
	Resolved,
	Approved,
	Disaproved,
	CLosed;
	
	
	public static StatusEnum getStatus(String status) {
		
		switch(status) {
		case "New" : return New;
		case "Assigned" : return Assigned;
		case "Resolved" : return Resolved;
		case "Approved" : return Approved;
		case "Disaproved" : return Disaproved;
		case "CLosed" : return CLosed;
		default : return New;
		
		}
	}
}
