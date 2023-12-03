/***********************************
CLASS: Event.java
CSC212 Data structures - Project phase I
Winter 2023
EDIT DATE:
28-11-2023
TEAM:
MMA
AUTHORS:
Muhammed Alhithlool, 443101218
***********************************/
package project;

import java.util.LinkedList;
import java.sql.Time;
public class Event {
	private String Contact_name;
	private String Event_title;
	private String Event_Location;
	private String Event_name;
	private String Event_date;
	private String Event_time;	
	private Time st,ed;
	private String start,end;
	private boolean isEvent=true;
	public LinkedList<Contact>contact_with_event=new LinkedList<Contact>();

	public Event(){
	}
		
	public Event(String Contact_name, String Event_title, String Event_Location,String Event_name, String Event_date, String Event_time) {
		this.Event_title=Event_title;
		this.Event_name=Event_name;
		this.Event_Location=Event_Location;
		this.Event_name=Event_name;
		this.Event_date=Event_date;
		this.Contact_name=Contact_name;
	}
	public String getStart() {
		return start;
	}


	public String getEend() {
		return end;
	}
public void setStart(String start) {
		this.start = start;
	}

	public void setEnd(String end) {
		this.end = end;
	}

public String getContact_name() {
	return Contact_name;
}
public void setContact_name(String Contact_name) {
	this.Contact_name = Contact_name;
}
	public String getEvent_title() {
		return Event_title;
	}

	public void setEvent_title(String event_title) {
		Event_title = event_title;
	}

	public String getEvent_Location() {
		return Event_Location;
	}

	public void setEvent_Location(String event_Location) {
		Event_Location = event_Location;
	}

	public String getEvent_name() {
		return Event_name;
	}

	public void setEvent_name(String event_name) {
		Event_name = event_name;
	}

	public String getEvent_date() {
		return Event_date;
	}

	public void setEvent_date(String event_date) {
		Event_date = event_date;
	}

	public String getEvent_time() {
		return Event_time;
	}

	public void setEvent_time(String event_time) {
		Event_time = event_time;
	}

	@Override
	public String toString() {
		return "Event [Event_title=" + Event_title + ", Event_Location=" + Event_Location + ", Event_name=" + Event_name
				+ ", Event_date=" + Event_date + ", Event_time=" + Event_time + "]";
	}

	public LinkedList<Contact>contact_with_event() {
		return contact_with_event();
	
	}
	}
