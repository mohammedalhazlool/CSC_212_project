/***********************************
CLASS: Event.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
14-10-2023
TEAM:
MMA
AUTHORS:
Muhammed Alhithlool, 443101218
***********************************/
package Project1;

public class Event {
private String Event_title;
private String Event_Location;
private String Event_name;
private String Event_date;
private String Event_time;	
public LinkedListADT<Contact>contact__event=new LinkedListADT<Contact>();

public Event(){
}
	
public Event(String Event_title, String Event_Location,String Event_name, String Event_date, String Event_time) {
	this.Event_title=Event_title;
	this.Event_name=Event_name;
	this.Event_Location=Event_Location;
	this.Event_name=Event_name;
	this.Event_date=Event_date;
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

public LinkedListADT<Contact> contact__event() {
	return contact__event;
}

}
