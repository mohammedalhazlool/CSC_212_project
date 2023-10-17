/***********************************
CLASS: Phonebook.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
13-10-2023
TEAM:
MMA
AUTHORS:
Abdullah Alsalman 443105689 , Mohammed Alhithlool 443101218
***********************************/

import java.util.Scanner;

public class Phonebook {
	static LinkedListADT<Contact>contacts;
        static LinkedListADT<Event>Events;

        
	public Phonebook() {
                Events = new LinkedListADT<Events>();
		contacts = new LinkedListADT<Contact>();
		
	}


	public Phonebook(LinkedListADT<Contact> contacts) {
		this.contacts = contacts;

	}

public void Add_Sorted_User(Contact d) {
	
	if (contacts.empty()) {
		
	contacts.add(d);
	return;
}
else {
	contacts.findFirst();
	if(d.compare.retrieve().getContact_name())<0){
		Contact c = new Contact(contacts.retrieve());
		contacts.update(d);
		contacts.add(c);
		return;
	}
	
	else {
		while(!contacts.retrieve().compareTo(d.getName())<=0) {
			contacts.findNext();
		}
	}
	
	if(contacts.retrieve().compareTo(d.getName())>0) {
		Contact c = new Contact(contacts.retrieve());
		contacts.update(d);
		contacts.add(c);
	}
	else {
		
		d.display_contact();
		contacts.add(d);
		
		}
}
}

}

	public boolean search(Contact c) {
		if (contacts.empty())
			return false;
		contacts.findFirst();
		while (!contacts.isLast()) {
			if (contacts.retrieve().getName().equals(c.getName())
					|| contacts.retrieve().getNumber().equals(c.getNumber()))
				return true;
			contacts.findNext();
		}
		if (contacts.retrieve.getContact_name().equals(c.getContact_name())
				|| contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
			return true;
		else
			return false;
	}

	public void add_contact(Contacts c) {
		boolean found = search(c);
		if (!found) {
			contacts.addInOrder(c);

		}

	}

public void delete_contact(String n) {
	if (contacts.empty()) {
		System.out.print("empty List can not delete");
		return;
	}
	contacts.findFirst();
	while(!contacts.isLast()) {
		if(contacts.retrieve.getContact_name().equals(n)) {
			contact.delete();
			System.out.println(n+"contact deleted");
		}
		else System.out.println("can not be deleted because it does not exist");
	}

	public LinkedListADT<Contact> search__by_First_name(String n){
		LinkedListADT<Contact>res = new LinkedListADT<Contact>();
		if(all_contact.empty())
			return res;
		all_contacts.findFirst();
		while(!all_contacts.retrieve()){
			
	String cur_Full_Name=all_contacts.retrieve().getContact_name();
	String First_name=curr_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
	if(First_name.equals(n))
		res.add(all_contacts.retrieve());
	
	all_contacts.findNext();
}
		String cur_Full_Name=all_contacts.retrieve().getContact_name();
		String First_name=curr_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
		if(First_name.equals(n))
			res.add(all_contacts.retrieve());
		return res;
}
public Contact search__by_name(String n) {
if(all_contacts.empty()) 
	return null;
	all_contacts.findFirst();
	while(!all_contacts.isLast()) {
		if(all_contacts.retrieve(getContact_name().equals(n))
			return all_contacts.retrieve();
		all_contacts_findNext();
	}
	if(all_contacts.retrieve(getContact_name().equals(n))
			return all_contacts.retrieve();
	return null;
}

	public Contact search__by_Phone(String ph) {
		LinkedListADT<Contact> res = new LinkedListADT<Contact>();
		if (contacts.empty())
			return res;
		contacts.findFirst();
		while (!contacts.isLast()) {
			if (contacts.retrieve().getNumber().equals(ph))
				res.add(contacts.retrieve());
			contacts.findNext();
		}
		if (contacts.retrieve().getNumber().equals(ph))
			res.add(contacts.retrieve());
		return res;
	}
public LinkedListADT<Contact> search_email(string e){
	LinkedListADT<Contact> res = new LinkedListADT<Contact>();
	if(contacts.empty())
		return res;
	contacts.findFirst();
	do {
		if(contacts.retrieve().getEmail().equals(e)){
		res.add(contacts.retrieve());
		contacts.findNext();}
		
	}while(!contacts.isLast());
	if(contacts.retrieve().getEmail().equals(e))
		res.add(contacts.retrieve();
	return r;}

public LinkedListADT<Contact> search_address(string a){
	LinkedListADT<Contact> r=new LinkedListADT<Contact>();
	if(contacts.empty())
		return r;
	contacts.findFirst();
	while(!contacts.isLast()) {
		if(contacts.retrieve().getAddress().equals(a)res.add(contacts.retrieve());
		contacts.findNext(){
		contacts.findFirst();	}
		
		if(contacts.retrieve().getAddress().equals(a)res.add(contacts.retrieve())
				return r;}
	public LinkedListADT<Contact> search_birth(string b)
	LinkedListADT<Contact> r=new LinkedListADT<Contact>();
	if(contacts.empty())
		return r;
	contacts.findFirst();
	while(!contacts.List) {
		if(contacts.retrieve().getBirthday().equals(b)res.add(contacts.retrieve());
		contacts.findnext(){
		contacts.findFirst();
		}
		
		if(contacts.retrieve().getBirthday().equals(b)res.add(contacts.retrieve())
				return r; }
public static void print_contacts(Phonebook p1){
	if(!p1.contacts.empty()){
	p1.contacts>.findFirst();
	while(!p1.contacts.isLast()){
	p1.contacts.retrieve().display_contact();
	p1.contacts.findNext();	
	}
        p1.contacts.retrieve().display_contact();
}else
System.out.println("is empty");
}
public static void print_contacts_byname(LinkedListADT<Contact>A){
	if(!A.empty()){
	A.findFirst();
	while(!A.isLast()){
	System.out.println(A.retrieve().get_Name());
	A.findNext();	
	}
	System.out.println(A.retrieve().get_Name());
}else
System.out.println("is empty");
}

public static void print_List_Events(LinkedListADT<Event>A){
	if(!A.empty()){
	A.findFirst();
	while(!A.isLast()){
	System.out.println(A.retrieve()+" linked with contacts: ");
	print_contacts_byname(A.retrieve().contact_event);
	A.findNext();	
	}
	System.out.println(A.retrieve()+" linked with contacts: ");
	print_contacts_byname(A.retrieve().contact_event);
}else
System.out.println("is empty");
}
public void add_Event(Event e) {
	Event f = search_event_title(e.getEvent_title());
	if(f==null) {
		Events.Add_sorted_Event(e);
	}
	
}
public LinkedListADT<Contact> contacts_in_event(String a){
	Event f = search_event_title(a);
	if(f!=null) 
		return f.getcontact__event;
	return new LinkedListADT<Contact>();
	
}
public LinkedListADT<Event> events_in_contact(String c){
	Contact c = search__by_name(c);
	if(c!=null) 
		return c.getevent_contact;
	return new LinkedListADT<Event>();
	
}
Public void delete_events_with_contacts(String s, LinkedList<Event>A){
System.out.print(" ");
While(!A.isEmpty()){
String E_title= A.retrieve().getEvent_title();
delete_event(E_title, s);
A.remove();  }
}
public void delete_contact(String s) {
	if(Contacts.isEmpty()) 
		System.out.println(" list is empty ");
	Contacts.findFirst(){
		while(!Contacts.last()) {
			if(Contacts.retrieve().getname().equals(s)) {
				LinkedList<Event>A=getEvents_contact(s);
				delete_events_with_contacts(s,A);
				System.out.println(" contact has been removed ");
				Contacts.remove();  }
			Contacts.findNext();
			}
		if(Contacts.retrieve().getname().equals(s)) {
			LinkedList<Event>A=getEvents_contact(s);
			delete_events_with_contacts(s,A);
			System.out.println(" contact has been removed ");
			Contacts.remove();}

	}























}
