/***********************************
CLASS: Phonebook.java
CSC212 Data structures - Project phase II
Winter 2023
EDIT DATE:
28-11-2023
TEAM:
MMA
AUTHORS:
Muhammed Alhithlool, 443101218, Abdullah Alsalman, 443105689
***********************************/
package project; 
import java.sql.Time;
import java.util.LinkedList;
import java.util.Scanner;

public class Phonebook {

	static ContactBST<Contact>all_contacts_BST;
	static LinkedList<Event> all_events;
	static LinkedList<Contact> all_contacts;
	public Phonebook() {
		all_events = new LinkedList<Event>();
		all_contacts_BST = new ContactBST<Contact>();
		all_events = new LinkedList<Event>();
	}
	/******
	public Phonebook(LinkedList<Event> all_events) {
		this.all_events = all_events;}
****/
	
	public Phonebook(LinkedList<Contact> all_contacts) {
		this.all_contacts = all_contacts;

	}
	/********
	public void Add_Sorted_User(Contact d) {
		
		if (all_contacts_BST.empty()) {
			
			all_contacts_BST.addAll(d);
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
************/
	public Contact search__by_Phone(String ph) {
		if (all_contacts_BST.empty())
			return null;
		all_contacts_BST.findRoot();
		while (!all_contacts_BST.empty()) {
			if (all_contacts_BST.retrieve().getNumber().equals(ph))
				return all_contacts_BST.retrieve();
			all_contacts_BST.findNext();
		}
		if (all_contacts_BST.retrieve().getNumber().equals(ph))
			return all_contacts_BST.retrieve();
		return null;
	}


	public void Add_Sorted_User(Contact d) {
		
		if (all_contacts.isEmpty()) {
			
		all_contacts.add(d);
		return;
	}
	else {
		all_contacts.getFirst();
		if(d.compareTo(all_contacts.remove().getName())<0){//1
			Contact c = new Contact(all_contacts.remove());
			
			all_contacts.add(c);
			return;
		}
		
		else {
			while(!(all_contacts.remove().compareTo(d.getName())<=0)) {
				///all_contacts.findNext();
			}
		}
		
		if(all_contacts.remove().compareTo(d.getName())>0) {
			Contact c = new Contact(all_contacts.remove());
		////	all_contacts.update(d);
			all_contacts.add(c);
		}
		else {
			
			d.display_contact();
			all_contacts.add(d);//2
			
			}
	}
	}

		public void add_contact(Contact c) {
			boolean name_inserted=false;
			boolean phoneExist=all_contacts_BST.check_phone_Exist(c.getNumber());
			if(phoneExist)
			System.out.println("the give contact has phone Exist before cannot add"+ c.getName());
			else {
				name_inserted = all_contacts_BST.insert(c.getName(), c);
				if(!name_inserted)
					System.out.println("the given contact has name Exist before add "+ c.getName());
		}
		}
		
		//this method searches for the contact using the name of it
		
		public Contact search__by_name(String n) {
			if (all_contacts_BST.empty())
				return null;
			boolean found = all_contacts_BST.findkey(n);
			if(found)
				return all_contacts_BST.retrieve();
			return null;
		}
		
		//this method searches for the contact using first name only
		
		public LinkedList<Contact> search__by_First_name(String n){
			return all_contacts_BST.search_by_first_name(n);
	}
		
		public static void print_all_contacts() {
			all_contacts_BST.inOrder();
		}
		
		public static void print_all_contacts_preorder() {
			all_contacts_BST.preOrder();
		}
		
		public static void print_Linked_List_of_all_contacts(LinkedList<Contact>L) {
			if(L.isEmpty())
				System.out.println("empty list");
			else {
				L.getFirst();
				while(L.getLast()!=null) {
					L.remove().display_contact();
					System.out.println("");
				L.findNext();
				}
				L.remove().display_contact();
				System.out.println("");
			}
		}

		public static void print_LinkedList_by_name(LinkedList<Contact>L) {
			if(L.isEmpty())
				System.out.println("empty list");
			else {
				L.getFirst();
				while(L.getLast()!=null) {
					System.out.println(L.remove().getName());
					System.out.println("");
					///L.findNext();
				}
				System.out.println(L.remove().getName());
				System.out.println("");
			}
		}
		public void schudle_event(Event e,String contact_name) {
				Contact this_contact= search__by_name(contact_name);
				if(this_contact==null) {
					System.out.println("can not schedule this event because this contact does not exist" + contact_name);
					return;
				}
				
				boolean is_conflict=is_conflict=is_conflict1(e,this_contact);
				if(this_contact!=null&&!is_conflict) {
					System.out.println("schedulling contact: "+ this_contact.getName()+"'"+e.getEvent_time());//
					
					//this_contact.contact_events_BST.add_Sorted_Event(e);
					e.contact_with_event.add(this_contact);
					add_Event(e);
					
				}
				
				else {
					if(this_contact==null)
						System.out.println("contact in this event does not exist //kml");
					if(is_conflict)
						System.out.println("there is conflict event title="+ e.getEvent_title());
				}
				}
		
		private boolean is_conflict1(Event e, Contact this_contact) {
			// TODO Auto-generated method stub
			return false;
		}

		public Event search_Event_by_Title(String n) {
			if(all_events.isEmpty())
				return null;
			all_events.getFirst();
			while(all_events.getLast() != null) {
				if(all_events.remove().getEvent_title().equals(n))
					return all_events.remove();
				
				all_events.getFirst();
			}
			if(all_events.remove().getEvent_title().equals(n))
				return all_events.remove();
			return null;
		}
		
/****************
		

		if(!contacts_with_cur_event.empty()&&contacts_with_cur_event.retrieve().getName().equals(n))
			contacts_with_cur_event.delete();

		if(!contacts_with_cur_event.empty())
			return;
		all_events_BST.findFirst();
		while(!all_events_BST.isLast()) {
			if(all_events.remove().getEvent_title().equals(tit)) { 
				all_events.delete();
			System.out.println(tit + "event deleted");
			return;
		}
		all_events.findNext();
		}

		if(all_events_BST.retrieve().getEvent_title().equals(tit)) {
			all_events.delete();
			System.out.println(tit+" events deleted");
			return;
		}
		else
			System.out.println("event can not be deleted because it does not exist");
		
	 ************/
		
		public void delete_contact(String n) {
			if(all_contacts_BST.empty()) {
				System.out.println("can not delete");
			return;
			}
			boolean removed=all_contacts_BST.remove_key(n);
			if(removed) 
				System.out.println(n+" contact deleted");
			else
				System.out.println("contact doesn't exist");
		}
		
		public void delete_all_events_with_contact1(String n, LinkedList<Event>L) {
			while(!L.isEmpty()) {
				String cur_event_title = L.remove().getEvent_title();
				delete_event(cur_event_title, n);
				
			}
		}


		public void delete_event(String tit, String n){ 
			System.out.println("delelting event " +tit +"with contact "+n);
		LinkedList<Contact>contacts_with_cur_event= getContacts_in_Event(tit);
			contacts_with_cur_event.getFirst();
		while(!contacts_with_cur_event.isEmpty()&&contacts_with_cur_event.getLast()!=null) {
			if(contacts_with_cur_event.remove().getName().equals(n)) {
				contacts_with_cur_event.remove();
				break;
		}
		///	contacts_with_cur_event.findNext();
		}
		if(!contacts_with_cur_event.isEmpty()&&contacts_with_cur_event.remove().getName().equals(n))
			contacts_with_cur_event.remove();
		
		if(!contacts_with_cur_event.isEmpty())
			return;
		if(all_events.isEmpty())
			return;
		all_events.getFirst();
		while(all_events.getLast()!=null) {
			if(all_events.remove().getEvent_title().equals(tit)) { 
				all_events.remove();
			System.out.println(tit + "event deleted");
			return;
		}
		///all_events.findNext();
		}

		if(all_events.remove().getEvent_title().equals(tit)) {
			all_events.remove();
			System.out.println(tit+" events deleted");
			return;
		}
		else
			System.out.println("event can not be deleted because it does not exist");
		}
		
		public void delete_all_events_with_contact(String n, LinkedList<Event>L) {
			while(!L.isEmpty()) {
				String cur_event_title = L.remove().getEvent_title();
				delete_event(cur_event_title, n);
				L.remove();
			}
			}
		public LinkedList<Event>getEvents_in_contact(String n){
			Contact this_contact=search__by_name(n);
			if(this_contact!=null) {
				return this_contact.getContact_event();}
			return new LinkedList<Event>();

		}
		public LinkedList<Contact> getContacts_in_Event(String n){
			Event this_Event=search_Event_by_Title(n);
			if(this_Event!=null) {
		///		return this_Event.contact_with_event();
			}	return new LinkedList<Contact>();

		}
		
		
		public void add_Event(Event e) {
			Event found = search_Event_by_Title(e.getEvent_title());
			if(found==null)
 			all_events.add(e);
		}
		private static void menu() {
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
				LinkedList<Contact>res = new LinkedList<Contact>();
				switch(search_option) {
				case 1:
					System.out.println("Enter the contact's name: ");
					Contact c1;
					try{
					c1 = ph1.search__by_name(read.nextLine());
					c1.display_contact();
					}catch(NullPointerException n){
						c1 = ph1.search__by_name(read.nextLine());
					}
					c1.display_contact();
					break;
					
				case 2:		
				System.out.println("Enter the contact's Phone: ");
				Contact c2;
				try{
				c2 = ph1.search__by_Phone(read.nextLine());
				c2.display_contact();
				}catch(NullPointerException e){
				c2 = ph1.search__by_Phone(read.nextLine());
				}
				c2.display_contact();
				break;
				
				case 3:
				System.out.println("Enter the contact's Email: ");
				String em;
				try{
				em = read.nextLine();
		///		res = ph1.search_email(em);
				}catch(NullPointerException e){
					em = read.nextLine();
				}
		///		res = ph1.search_email(em);
				if(!res.isEmpty()) {
					System.out.println("contact Found!");
					print_Linked_List_of_all_contacts(res);
				}
				else
					System.out.println("contact not Found!");
				break;
				
				case 4:
					System.out.println("Enter the contact's Address: ");
				///	res= ph1.search_address(read.nextLine());
					if(!res.isEmpty()) {
						System.out.println("contact Found!");
					///	print_contacts_by_name(res);
					}
				break;
				
				case 5:
					System.out.println("Enter the contact's Birthday: ");
			///	res= ph1.search_birth(read.nextLine());
					if(!res.isEmpty()) {
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
					ph1.schudle_event(e,read.nextLine());
					break;
					
				case 5:
					read.nextLine();
					search_criteria_for_searching();
					int choose = read.nextInt();
					
					if(choose ==1) {
						read.nextLine();
						System.out.println("Enter the contact name ");
						LinkedList<Event>L1=ph1.getEvents_in_contact(read.nextLine());
			///			ph1.Linked_List_of_Events(L1);
					}
					else if(choose==2) {
					read.nextLine();
					System.out.println("Enter the event title ");
		            Event ev = ph1.search_Event_by_Title(read.nextLine());
		            if(ev!=null) {
		            	System.out.println("Event Found\n");
		            	System.out.println(ev);
		            }
		            else
		            	System.out.println("Event not Found");
		}
					break;
					
				case 6:
					
				///	print_LinkedList_by_name(ContactBST<Contact>all_contacts_BST);

					break;
					
				case 7:
		///			ph1.Linked_List_of_Events(all_events);
					break;
					
				case 8:
					System.out.println("\nGoodBye!");
					break;
				
				}
			}
			while(ch!=8);
			}
		private static void search_criteria_for_searching() {
			// TODO Auto-generated method stub
			
		}

	

		
}
