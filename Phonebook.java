/***********************************
CLASS: Phonebook.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
14-10-2023
TEAM:
MMA
AUTHORS:
Muhammed Alhithlool, 443101218, Abdullah Alsalman, 443105689
***********************************/
package project;

import java.util.Scanner;

public class Phonebook {
	static LinkedList<Contact> all_contacts;
	static LinkedList<Event> all_events;

	public Phonebook() {
		all_events = new LinkedList<Event>();
		all_contacts = new LinkedList<Contact>();

	}

	public Phonebook(LinkedList<Contact> contacts) {
		this.all_contacts = all_contacts;

	}
	
//this method add us in order
	
public void Add_Sorted_User(Contact d) {
	
	if (all_contacts.empty()) {
		
	all_contacts.add(d);
	return;
}
else {
	all_contacts.findFirst();
	if(d.compareTo(all_contacts.retrieve().getName())<0){//1
		Contact c = new Contact(all_contacts.retrieve());
		all_contacts.update(d);
		all_contacts.add(c);
		return;
	}
	
	else {
		while(!(all_contacts.retrieve().compareTo(d.getName())<=0)) {
			all_contacts.findNext();
		}
	}
	
	if(all_contacts.retrieve().compareTo(d.getName())>0) {
		Contact c = new Contact(all_contacts.retrieve());
		all_contacts.update(d);
		all_contacts.add(c);
	}
	else {
		
		d.display_contact();
		all_contacts.add(d);//2
		
		}
}
}

//this method searches for your contract

	public boolean search(Contact c) {
		if (all_contacts.empty())
			return false;
		all_contacts.findFirst();
		while (!all_contacts.isLast()) {
			if (all_contacts.retrieve().getName().equals(c.getName())
					|| all_contacts.retrieve().getNumber().equals(c.getNumber()))
				return true;
			all_contacts.findNext();
		}
		if (all_contacts.retrieve().getName().equals(c.getName())
				|| all_contacts.retrieve().getNumber().equals(c.getNumber()))
			return true;
		else
			return false;
	}
	
//this method adds contract
	
	public void add_contact(Contact c) {
		boolean found = search(c);
		if (!found) {
			all_contacts.addInOrder(c);//3

		}

	}
	
//this method searches for the contact using first name only
	
	public LinkedList<Contact> search__by_First_name(String n){
		LinkedList<Contact>res = new LinkedList<Contact>();
		if(all_contacts.empty())
			return res;
		all_contacts.findFirst();
		while(!all_contacts.isLast()){
	String cur_Full_Name=all_contacts.retrieve().getName();
	String First_name=cur_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
	if(First_name.equals(n))
		res.add(all_contacts.retrieve());
	
	all_contacts.findNext();
}
		String cur_Full_Name=all_contacts.retrieve().getName();
		String First_name=cur_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
		if(First_name.equals(n))
			res.add(all_contacts.retrieve());
		return res;
	}
	
	//this method searches for the contact using the name of it
	
	public Contact search__by_name(String n) {
		if (all_contacts.empty())
			return null;
		all_contacts.findFirst();
		while (!all_contacts.isLast()) {
			if (!all_contacts.retrieve().getName().equals(n))
				return all_contacts.retrieve();
			all_contacts.findNext();
		}
		if (all_contacts.retrieve().getName().equals(n))
			return all_contacts.retrieve();
		return null;
	}

//this method searches for the contact using the number of the phone

	public Contact search__by_Phone(String ph) {
		if (all_contacts.empty())
			return null;
		all_contacts.findFirst();
		while (!all_contacts.isLast()) {
			if (all_contacts.retrieve().getNumber().equals(ph))
				return all_contacts.retrieve();
			all_contacts.findNext();
		}
		if (all_contacts.retrieve().getNumber().equals(ph))
			return all_contacts.retrieve();
		return null;
	}

	//this method searches using emails
	
	public LinkedList<Contact> search_email(String e) {
		LinkedList<Contact> res = new LinkedList<Contact>();
		if (all_contacts.empty())
			return res;
		all_contacts.findFirst();
		do {
			if (all_contacts.retrieve().getEmail().equals(e)) {
				res.add(all_contacts.retrieve());
				all_contacts.findNext();
			}
		} while (!all_contacts.isLast());
		if (all_contacts.retrieve().getEmail().equals(e))
			res.add(all_contacts.retrieve());
		return res;
	}

//this method searches using address

	public LinkedList<Contact> search_address(String a) {
		LinkedList<Contact> res = new LinkedList<Contact>();
		if (all_contacts.empty())
			return res;
		all_contacts.findFirst();
		while (!all_contacts.isLast()) {
			if (all_contacts.retrieve().getAddress().equals(a))
				;
			res.add(all_contacts.retrieve());
			all_contacts.findNext();
		}
		if (all_contacts.retrieve().getAddress().equals(a))
			;
		res.add(all_contacts.retrieve());
		return res;
	}
	
//this method searches using day you were born

	public LinkedList<Contact> search_birth(String b){
	LinkedList<Contact> res=new LinkedList<Contact>();
	if(all_contacts.empty())
		return res;
	all_contacts.findFirst();
	while(!all_contacts.isLast()) {
		if(all_contacts.retrieve().getBirthday().equals(b))
		res.add(all_contacts.retrieve());
		
		all_contacts.findNext();
	}
	if(all_contacts.retrieve().getBirthday().equals(b))
		res.add(all_contacts.retrieve());
			return res;

	}
	
//	this method print the contacts

	public static void print_contacts(Phonebook p1) {
		if (!p1.all_contacts.empty()) {
			p1.all_contacts.findFirst();
			while (!p1.all_contacts.isLast()) {
				p1.all_contacts.retrieve().display_contact();
				p1.all_contacts.findNext();
			}
			p1.all_contacts.retrieve().display_contact();
		} else
			System.out.println("is empty");
	}

	//this method shows the name of the conatct
	
	public static void print_contacts_by_name(LinkedList<Contact> A) {
		if (!A.empty()) {
			A.findFirst();
			while (!A.isLast()) {
				System.out.println(A.retrieve().getName());
				A.findNext();
			}
			System.out.println(A.retrieve().getName());
		} else
			System.out.println("is empty");
	}

	//this method shows the lists of the all events
	
	public static void print_List_Events(LinkedList<Event> A) {
		if (!A.empty()) {
			A.findFirst();
			while (!A.isLast()) {
				System.out.println(A.retrieve() + " linked with contacts: ");
				print_contacts_by_name(A.retrieve().contact__event);
				A.findNext();
			}
			System.out.println(A.retrieve() + " linked with contacts: ");
			print_contacts_by_name(A.retrieve().contact__event);
		} else
			System.out.println("is empty");
	}

//this method adds another event

	public void add_Event(Event e) {
		Event found = search_event_title(e.getEvent_title());
		if (found == null) {
		}
	}
//this method makes sure there is no conflict
	public boolean is_conflict(Event e,Contact c) {
		LinkedList<Event>contacts_event=c.contact_event;
		if(contacts_event.empty()) 
			return false;
		
		contacts_event.findFirst();
		while(!contacts_event.isLast()) {
			if(e.getEvent_date().equals(contacts_event.retrieve().getEvent_date())&&e.getEvent_time().equals(contacts_event.retrieve().getEvent_time()))
				return true;
			contacts_event.findNext();
		}
		if(e.getEvent_date().equals(contacts_event.retrieve().getEvent_date())&&e.getEvent_time().equals(contacts_event.retrieve().getEvent_time()))
			return true;
		else
			return false;
			}
	//this method schedules event
	public void schedule_event(Event e, String contact_name) {
		Contact this_contact = search__by_name(contact_name);
		if(this_contact==null) {
			System.out.println("can not schedule this event because this contact does not exist"+contact_name);
			return;
		}
	
		boolean is_conflict=is_conflict(e,this_contact);
		if(this_contact!=null&&!is_conflict) {
			System.out.println("schedlulling contact"+this_contact.getName()+"'"+e.getEvent_title());
			
			this_contact.contact_event.add(e);//
			e.contact__event.add(this_contact);
			add_Event(e);//add
			
			this_contact.event_in_contact=e;
			this_contact.event_in_contact.contact__event.add(this_contact);//e in e
		}
	}
	
	
	public void delete_contact(String s) {
		if(all_contacts.empty()) 
			System.out.println(" list is empty ");
		all_contacts.findFirst();
			while(!all_contacts.isLast()) {//last
				if(all_contacts.retrieve().getName().equals(s)) {
					LinkedList<Event> A=getEvent_contact(s);
					delete_events_with_contacts(s,A);
					System.out.println(" contact has been removed ");
					all_contacts.delete();  }
				all_contacts.findNext();
				}
			if(all_contacts.retrieve().getName().equals(s)) {
				LinkedList<Event>A=getEvent_contact(s);
				delete_events_with_contacts(s,A);
				System.out.println(" contact has been removed ");
				all_contacts.delete();}
	}
		
	

public static void menu() {
	System.out.println("Welcome to the Lonked Tree Phonebook!");
	System.out.println("Please chose an option");
	System.out.println("1. Add a contact");
	System.out.println("2. Search for a contact");
	System.out.println("3. Delete a contact");
	System.out.println("4. schedule an event");
	System.out.println("5. Print event details");
	System.out.println("6. Print contacts by first name");
	System.out.println("7. Print all events alphabetically");
	System.out.println("8. Exit");
	System.out.println("\nEnter your choice: ");
}

public LinkedList<Event> events_contact(String c){
	Contact g = search__by_name(c);
	if(c!=null) 
		return g.contact_event;
	return new LinkedList<Event>();
	
}

public LinkedList<Contact> contacts_event(String a){
	Event f = search_event_title(a);
	if(f!=null) 
		return f.contact__event();
	return new LinkedList<Contact>();
	
}
public void delete_events_with_contacts(String s, LinkedList<Event>A){
	System.out.print(" ");
	while(!A.empty()){
		String E_title= A.retrieve().getEvent_title();
		delete_event(E_title, s);//delete
		A.delete();  
	}
}

public static void search_criteria_for_searching() {
	System.out.println("Enter  search criteria:\n"+ "1. Name\n" + "2. Phone Number\n" + "3. Email Address\n" + "4. Address\n" + "Birthday");
}

public static void print_Linked_List_of_all_contacts(LinkedList<Contact>L) {
	if(L.empty())
		System.out.println("empty list");
	else {
		L.findFirst();
		while(!L.isLast()) {
			L.retrieve().display_contact();
			System.out.println("");
			L.findNext();
		}
		L.retrieve().display_contact();
		System.out.println("");
	}
}


public void Linked_List_of_Events(LinkedList<Event>L) {
	if(L.empty())
		System.out.println("empty list");
	else {
		L.findFirst();
		while(!L.isLast()) {
			System.out.println(L.retrieve());
			System.out.println("this event has the following contacts");
			print_contacts_by_name(L.retrieve().contact__event);
			System.out.println("");
			L.findNext();
		}
	}
}

public Event search_event_title(String s) {
	if(all_events.empty())
		return null;
	all_events.findFirst();
	while(!all_events.isLast()) {
		if(all_events.retrieve().getEvent_title().equals(s))
			return all_events.retrieve();
		all_events.findFirst();
		}
	if(all_events.retrieve().getEvent_title().equals(s))
		return all_events.retrieve();
	return null;
}

public LinkedList<Event> getEvent_contact(String n){
	Contact this_contact = search__by_name(n);
	if(this_contact!= null)
		return this_contact.getContact_event();//
	return new LinkedList<Event>();
}
public LinkedList<Contact> getContact_event(String n){
	Event this_event = search_event_title(n);
	if(this_event!= null)
		return this_event.contact__event();//
	return new LinkedList<Contact>();
}

public void delete_event(String tit, String n){ 
	LinkedList<Contact>contacts_with_cur_event=getContact_event(tit);
	print_contacts_by_name(contacts_with_cur_event);
	contacts_with_cur_event.findFirst();
	while(!contacts_with_cur_event.empty()&&!contacts_with_cur_event.isLast()){
		if(contacts_with_cur_event.retrieve().getName().equals(n)){
			contacts_with_cur_event.delete();
			break;
		}
		contacts_with_cur_event.findNext();
	}
	if(contacts_with_cur_event.retrieve().getName().equals(n)){
		contacts_with_cur_event.delete();;
	}
}

public static void main(String[]args) {
	Phonebook ph1 = new Phonebook();
	Scanner read = new Scanner(System.in);
	int ch =-1,search_option=-1;
	do {
		menu();
		ch=read.nextInt();
		switch(ch) {
		case 1:
			Contact c = new Contact();
			c.read_contact();
			ph1.add_contact(c);
			break;
			
		case 2:
		search_criteria_for_searching();
		search_option=read.nextInt();
		read.nextInt();
		LinkedList<Contact>res = new LinkedList<Contact>();
		switch(search_option) {
		case 1:
			System.out.println("Enter the contact's name: ");
			Contact c1 = ph1.search__by_name(read.nextLine());
			c1.display_contact();
			break;
			
		case 2:		
		System.out.println("Enter the contact's Phone: ");
		Contact c2 = ph1.search__by_Phone(read.nextLine());
		c2.display_contact();
		break;
		
		case 3:
		System.out.println("Enter the contact's Email: ");
		res= ph1.search_email(read.nextLine());
		if(!res.empty()) {
			System.out.println("contact Found!");
			print_Linked_List_of_all_contacts(res);
		}
		else
			System.out.println("contact not Found!");
		break;
		
		case 4:
			System.out.println("Enter the contact's Address: ");
			res= ph1.search_address(read.nextLine());
			if(!res.empty()) {
				System.out.println("contact Found!");
				print_contacts_by_name(res);
			}
		break;
		
		case 5:
			System.out.println("Enter the contact's Birthday: ");
			res= ph1.search_birth(read.nextLine());
			if(!res.empty()) {
				System.out.println("contact Found!");
				print_Linked_List_of_all_contacts(res);
			}
				else
					System.out.println("contact not Found!");
				break;
		
		}
		break;
	
		case 3:
			read.nextLine();
			System.out.println("Enter the contact's name: ");
			ph1.delete_contact(read.nextLine());
			break;
			
		case 4:
			Event e = new Event();
			ph1.add_Event(e);
			ph1.schedule_event(e,read.nextLine());
			break;
			
		case 5:
			read.nextLine();
			search_criteria_for_searching();
			int choose = read.nextInt();
			
			if(choose ==1) {
				read.nextLine();
				System.out.println("Enter the contact name ");
				LinkedList<Event>L1=ph1.getEvent_contact(read.nextLine());
				ph1.Linked_List_of_Events(L1);
			}
			else if(choose==2) {
			read.nextLine();
			System.out.println("Enter the event title ");
            Event ev = ph1.search_event_title(read.nextLine());
            if(ev!=null) {
            	System.out.println("Event Found\n");
            	System.out.println(ev);
            }
            else
            	System.out.println("Event not Found");
}
			break;
			
		case 6:
			
			print_contacts_by_name(all_contacts);

			break;
			
		case 7:
			ph1.Linked_List_of_Events(all_events);
			break;
			
		case 8:
			System.out.println("\nGoodBye!");
			break;
		
		}
	}
	while(ch!=8);
	}
}




















