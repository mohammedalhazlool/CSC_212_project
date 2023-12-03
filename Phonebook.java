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
import java.util.Scanner;

public class Phonebook {
	static BST<Contacts>all_contacts_BST;
	static LinkedListADT<Event> all_events;

	public Phonebook() {
		all_events = new LinkedListADT<Event>();
		all_contacts_BST = new BST<Contacts>();

	}
	
		public void add_contact(Contacts c) {
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
		
		public Contacts search__by_name(String n) {
			if (all_contacts_BST.empty())
				return null;
			boolean found = all_contacts_BST.findKey(n);
			if(found)
				return all_contacts_BST.retrieve();
			return null
		}
		
		//this method searches for the contact using first name only
		
		public LinkedListADT<Contacts> search__by_First_name(String n){
			return all_contacts_BST.search_by_First_name(n);
	}
		
		public static void print_all_contacts() {
			all_contacts_BST.inOrder();
		}
		
		public static void print_all_contacts_preorder() {
			all_contacts_BST.preOrder();
		}
		
		public static void print_Linked_List_of_all_contacts(LinkedListADT<Contacts>L) {
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

		public static void print_LinkedList_by_name(LinkedListADT<Contacts>L) {
			if(L.empty())
				System.out.println("empty list");
			else {
				L.findFirst();
				while(!L.isLast()) {
					System.out.println(L.retrieve().getName());
					System.out.println("");
					L.findNext();
				}
				System.out.println(L.retrieve().getName());
				System.out.println("");
			}
		}
		public void schudle_event(Event e,String contact_name) {
				Contacts this_contact= search__by_name(contact_name);
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
		
		public Event search_Event_by_Title(String n) {
			if(all_events.empty())
				return null;
			all_events.findFirst();
			while(!all_events.isLast()) {
				if(all_events.retrieve().getEvent_title().equals(n))
					return all_events.retrieve();
				
				all_events.findFirst();
			}
			if(all_events.retrieve().getEvent_title().equals(n))
				return all_events.retrieve();
			return null;
		}
		
		public LinkedListADT<Contacts> search_by_email(String e) {
			LinkedListADT<Contacts> res = new LinkedListADT<Contacts>();
			if(root==null)
				return res;
			rec_search_by_Email(root,res,n);
			return res;
		}
		
		private void rec_search_by_Email(BST<T>p, LinkedListADT<Contacts> res, String n) {
			if(p==1)
				return;
			rec_search_by_Email(p.left,res,n);
			
			if(((Contacts)p.data).getEmail().equals(n)) {
				res.add((Contacts)p.data);
			}
			rec_search_by_Email(p.right,res,n);
		}
				
		public LinkedListADT<Contacts>search_by_first_name(String n){
			LinkedListADT<Contacts>res=new LinkedListADT<Contacts>();
			if(root==null)
				return res;
	rec_search_by_first_name(root,res,n);
	return res;
		}
		private void rec_search_by_first_name(BST<T>p, LinkedListADT<Contacts> res, String n) {
			if(root==null)
				return;
			rec_search_by_first_name(p.left,res,n);
			String cur_full_Name=p.key;
			String First_name=cur_Full_Name.substring(0,cur_Full_Name.indexOF(" "));
			if(First_name.equals(n)) 
				res.add(Contacts)p.data);
		
			rec_search_by_first_name(p.right,res,n);
		}

		if(!contacts_with_cur_event.empty()&&contacts_with_cur_event.retrieve().getName().equals(n))
			contacts_with_cur_event.delete();

		if(!contacts_with_cur_event.empty())
			return;
		all_events_BST.findFirst();
		while(!all_events_BST.isLast()) {
			if(all_events.retrieve().getEvent_title().equals(tit)) { 
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
		}
			 
		public void delete_all_events_with_contact(String n, LinkedListADT<Event>L) {
			while(!L.empty()) {
				String cur_event_title = L.retrieve().getEvent_title();
				delete_event(cur_event_title, n);
				L.delete();
			}
		}


		public void delete_event(String tit, String n){ 
			System.out.println("delelting event " +tit +"with contact "+n);
//			LinkedListADT<Contacts>contacts_with_cur_event= getContacts_in_Event(tit);
			contacts_with_cur_event.findFirst();
		while(!contacts_with_cur_event.empty()&&!contacts_with_cur_event.isLast()) {
			if(contacts_with_cur_events.retrieve().getName().equals(n)) {
				contacts_with_cur_event.delete();
				break;
		}
			contacts_with_cur_event.findNext();
		}
		if(!contacts_with_cur_event.empty()&&contacts_with_cur_event.retrieve().getName().equals(n))
			contacts_with_cur_event.delete();

		if(!contacts_with_cur_event.empty())
			return;
		all_events.findFirst();
		while(!all_events.isLast()) {
			if(all_events.retrieve().getEvent_title().equals(tit)) { 
				all_events.delete();
			System.out.println(tit + "event deleted");
			return;
		}
		all_events.findNext();
		}

		if(all_events.retrieve().getEvent_title().equals(tit)) {
			all_events.delete();
			System.out.println(tit+" events deleted");
			return;
		}
		else
			System.out.println("event can not be deleted because it does not exist");
		}
			 
		public void delete_all_events_with_contact(String n, LinkedListADT<Event>L) {
			while(!L.empty()) {
				String cur_event_title = L.retrieve().getEvent_title();
				delete_event(cur_event_title, n);
				L.delete();
			}
		}
