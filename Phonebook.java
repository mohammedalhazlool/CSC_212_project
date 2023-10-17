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

public void Add_Sorted_User(Contact d) {
	
	if (all_contacts.empty()) {
		
	all_contacts.add(d);
	return;
}
else {
	all_contacts.findFirst();
	if(d.compareTo.retrieve().getName()<0){//1
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
		Contacts.insert(d);//2
		
		}
}
}

public static void print_Linked_List_Events(LinkedList<Event>A){
	if(!A.empty()){
		A.findFirst();
		while(!A.isLast()){
			System.out.println(A.retrieve()+" linked with contacts: ");
			print_contacts_byname(A.retrieve().contact_event);
			A.findNext();	
		}
		System.out.println(A.retrieve()+" linked with contacts: ");
		print_contacts_byname(A.retrieve().contact_event);
	}
	else
		System.out.println("is empty");
}
public void add_Event(Event e) {
	Event f = search_event_title(e.getEvent_title());
	if(f==null) {
		Events.Add_sorted_Event(e);
	}
	
}

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

	public void add_contact(Contact c) {
		boolean found = search(c);
		if (!found) {
			all_contacts.Add_sorted1(c);//3

		}

	}

	public LinkedList<Contact> search__by_First_name(String n){
		LinkedList<Contact>res = new LinkedList<Contact>();
		if(all_contacts.empty())
			return res;
		all_contacts.findFirst();
		while(!all_contacts.retrieve()){
			
	String cur_Full_Name=all_contacts.retrieve().getName();
	String First_name=cur_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
	if(First_name.equals(n))
		res.insert(all_contacts.retrieve());
	
	all_contacts.findNext();
}
		String cur_Full_Name=all_contacts.retrieve().getName();
		String First_name=cur_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
		if(First_name.equals(n))
			res.insert(all_contacts.retrieve());
		return res;
	}//all contacts , all events
	
public Contact search__by_name(String n) {
if(all_contacts.empty()) 
	return null;
	all_contacts.findFirst();
	while(!all_contacts.isLast()) {
		if(all_contacts.retrieve(getName().equals(n))
			return all_contacts.retrieve();
		all_contacts.findNext();
	}
	if(all_contacts.retrieve(getName().equals(n))//
			return all_contacts.retrieve();
	return null;
}//all contacts , all events

	public LinkedList<Contact> search__by_Phone(String ph) {
		LinkedList<Contact> res = new LinkedList<Contact>();
		if (all_contacts.empty())
			return res;
		all_contacts.findFirst();
		while (!all_contacts.isLast()) {
			if (all_contacts.retrieve().getNumber().equals(ph))
				res.add(all_contacts.retrieve());
			all_contacts.findNext();
		}
		if (all_contacts.retrieve().getNumber().equals(ph))
			res.add(all_contacts.retrieve());
		return res;
	}

public LinkedList<Contact> search_email(String e){
	LinkedList<Contact> res=new LinkedList<Contact>();
	if(all_contacts.empty())
		return res;
	all_contacts.findFirst();
	do {
		if(all_contacts.retrieve().getEmail().equals(e).res.insert(all_contacts.retrieve()){
		all_contacts.findNext();
		}
		
	}while(!all_contacts.isLast());
	if(all_contacts.retrieve().getEmail().equals(e).res.insert(all_contacts.retrieve())
	return res;
	}//4


public LinkedList<Contact> search_address(String a){
	LinkedList<Contact> res =new LinkedList<Contact>();
	if(all_contacts.empty())
		return res;
	all_contacts.findFirst();
	while(!all_contacts.List) {
		if(all_contacts.retrieve().getAddress().equals(a)res.insert(all_contacts.retrieve());
		all_contacts.findNext();
		all_contacts.findFirst();	
		}//method list, insert

	if(all_contacts.retrieve().getAddress().equals(a)res.insert(all_contacts.retrieve())
			return res;
	}

	public LinkedList<Contact> search_birth(String b){
	LinkedList<Contact> res=new LinkedList<Contact>();
	if(all_contacts.empty())
		return res;
	all_contacts.findFirst();
	while(!all_contacts.List) {
		if(all_contacts.retrieve().getBirthday().equals(b)res.insert(all_contacts.retrieve()){
		all_contacts.findNext();
		all_contacts.findFirst();
		}
	
	if(all_contacts.retrieve().getBirthday().equals(b)res.insert(all_contacts.retrieve())
			return res;

	}

public static void print_contacts(Phonebook p1){
	if(!p1.all_contacts.empty()){
	p1.all_contacts.findFirst();
	while(!p1.all_contacts.isLast()){
	p1.all_contacts.retrieve().display_contact();
	p1.all_contacts.findNext();	
	}
        p1.all_contacts.retrieve().display_contact();
}else
System.out.println("is empty");
}

public static void print_contacts_by_name(LinkedList<Contact>A){
	if(!A.empty()){
	A.findFirst();
	while(!A.isLast()){
	System.out.println(A.retrieve().getName());
	A.findNext();	
	}
	System.out.println(A.retrieve().getName());
}else
System.out.println("is empty");
}

public static void print_List_Events(LinkedList<Event>A){
	if(!A.empty()){
	A.findFirst();
	while(!A.isLast()){
	System.out.println(A.retrieve()+" linked with contacts: ");
	print_contacts_by_name(A.retrieve().contact__event);
	A.findNext();	
	}
	System.out.println(A.retrieve()+" linked with contacts: ");
	print_contacts_by_name(A.retrieve().contact__event);
}else
System.out.println("is empty");
}
	
	public boolean is_conflict(Event e,Contact c) {
		if(contacts_event.empty()) {//class contact events
			return false;
		}
		contacts_event.findFirst();
		while(!contacts_event.last()) {
			if(e.getEvent_date().equals(contacts_event.retrieve().getEvent_date())&&e.getEvent_time().equals(contacts_event.retrieve().getEvent_time()))
				return true;
			contacts_event.findNext();
		}
		if(e.getEvent_date().equals(contacts_event.retrieve().getEvent_date())&&e.getEvent_time().equals(contact_events.retrieve().getEvent_time()))
			return true;
		else
			return false;
			}
	public void schedule_event(Event e String contact_name) {
		if(this_contact==null) {
			System.out.println("can not schedule this event because this contact does not exist"+contact_name);
			return;
		}
	
		boolean is_conflict=is_conflict(e,this_contact);
		if(this_contact!=null&&!is_conflict) {
			System.out.println("schedlulling contact"+this_contact.getContact_name()+"'"+1.getEvent_title());
			
			this_contact.contact_events.Add_Sorted_Events(e);
			e.contacts_with_events.Add_Sorted1(this_contact);
			add_Event(e);
			
			this_contact.Events_in_contact=e;
			this_contact.Evnets_in_contact.events_in_event.Add_Sorted_Event(e);
		}
	}
	}
	
	public void delete_contact(String s) {
		if(all_contacts.empty()) 
			System.out.println(" list is empty ");
		all_contacts.findFirst();
			while(!all_contacts.last()) {//last
				if(all_contacts.retrieve().getName().equals(s)) {
					LinkedList<Event> A=getEvents_contact(s);
					delete_events_with_contacts(s,A);
					System.out.println(" contact has been removed ");
					all_contacts.remove();  }
				all_contacts.findNext();
				}
			if(all_contacts.retrieve().getName().equals(s)) {
				LinkedList<Event>A=getEvents_contact(s);
				delete_events_with_contacts(s,A);
				System.out.println(" contact has been removed ");
				all_contacts.remove();}

		}
	}

public static void menu() {
	System.out.println("Welcome to the Lonked Tree Phonebook!");
	System.out.println("Please chose an option");
	System.out.println("1. Adda contact");
	System.out.println("2. Search for a contact");
	System.out.println("3. Delete a contact");
	System.out.println("4. schedule an event");
	System.out.println("5. Print event details");
	System.out.println("6. Print event details");
	System.out.println("7. Print all events alphabetically");
	System.out.println("8. Print all events for some contact");
	System.out.println("9. print all contacts for some event");
	System.out.println("12. Exit");
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
		delete_event(E_title, s);
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
		return this_contact.getContact_event();
	return new LinkedList<Event>();
}
public LinkedList<Contact> getContact_event(String n){
	Event this_event = search_event_title(n);
	if(this_event!= null)
		return this_event.getEvent_contact();//getEvent_contact
	return new LinkedList<Contact>();
}

public static void main(String[]args) {
	Phonebook ph1 = new Phonebook();
	Scanner read = new Scanner(System.in);
	int ch =-1,search_option=-1;
	
	do {
		menu();
		ch=read.nextInt();
		case 1:
			test_Add(ph1);//al7l
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
			//test_schedule_Event6_(ph1);
			break;
			
		case 5:
			read.nextLine();
			search_crateria_for_printing_event_details();
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
			
			print_contacts(ph1);
			//print by all contacts 
			break;
			
		case 7:
			ph1.Linked_List_of_Events(all_events);
			break;
			
		case 8:
			read.nextLine();
			System.out.println("Enter contact name: ");
			LinkedList<Event>L1=ph1.getEvent_contact(read.nextLine());
			ph1.Linked_List_of_Events(L1);
			break;
			
		case 9:
			read.nextLine();
			System.out.println("Enter contact name: ");
			LinkedList<Contact>L2=ph1.getContact_event(read.nextLine());
			print_Linked_List_of_all_contacts(L2);
			break;
			
		case 12:
			System.out.println("\nGoodBye!");
			break;
}

}

}





















