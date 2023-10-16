/***********************************
CLASS: LinkedListADT.java
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
	static LinkedList<Contact>contacts;
        static LinkedList<Event>Events;

        
	public Phonebook() {
                Events = new LinkedList<Events>();
		contacts = new LinkedList<Contact>();
		
	}


	public Phonebook(LinkedList<Contact> contacts) {
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
		contacts.insert(d);
		
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
			contacts.FindNext();
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
			contacts.Add_sorted1(c);

		}

	}

public void delete

	contact(String n) {
	if (contacts.isEmpty()) {
		System.out.print("empty List can not delete");
		return;
	}
	contacts.findFirst();
	while(!contacts.isLast()) {
		if(contacts.retrieve.getContact_name().equals(n)) {
			contact.remove();
			System.out.println(n+"contact deleted");
		}
		else System.out.println("can not be deleted because it does not exist");
	}

	public LinkedList<Contact> search__by_First_name(String n){
		LinkedList<Contact>res = new LinkedList<Contact>();
		if(all_contact.isEmpty())
			return res;
		all_contacts.FindFirst();
		while(!all_contacts.retrieve()){
			
	String cur_Full_Name=all_contacts.retrieve().getContact_name();
	String First_name=curr_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
	if(First_name.equals(n))
		res.insert(all_contacts.retrieve());
	
	all_contacts.findNext();
}
		String cur_Full_Name=all_contacts.retrieve().getContact_name();
		String First_name=curr_Full_Name.substring(0,cur_Full_Name.indexOf(" ")-1);
		if(First_name.equals(n))
			res.insert(all_contacts.retrieve());
		return res;

public Contact search__by_name(String n) {
if(all_contacts.isEmpty()) 
	return null;
	all_contacts.FindFirst();
	while(!all_contacts.last()) {
		if(all_contacts.retrieve(getContact_name().equals(n))
			return all_contacts.retrieve();
		all_contacts_findNext();
	}
	if(all_contacts.retrieve(getContact_name().equals(n))
			return all_contacts.retrieve();
	return null;
}

	public Contact search__by_Phone(String ph) {
		LinkedList<Contact> res = new LinkedList<Contact>();
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
public LinkedList<Contact> search_email(string e){
	LinkedList<Contact> r=new LinkedList<Contact>();
	if(contacts.isEmpty())
		return r;
	contacts.FindFirst();
	do {
		if(contacts.retrieve().getEmail().equals(e)res.insert(contacts.retrieve()){
		
		contacts.findnext();}
		
	}while(!contactsLast);
	if(contacts.retrieve().getEmail().equals(e)res.insert(contacts.retrieve())
	return r;}

public LinkedList<Contact> search_address(string a){
	LinkedList<Contact> r=new LinkedList<Contact>();
	if(contacts.isEmpty())
		return r;
	contacts.FindFirst();
	while(!contacts.List) {
		if(contacts.retrieve().getAddress().equals(a)res.insert(contacts.retrieve());
		contacts.findnext(){
		contacts.FindFirst();	}
		
		if(contacts.retrieve().getAddress().equals(a)res.insert(contacts.retrieve())
				return r;}
	public LinkedList<Contact> search_birth(string b)
	LinkedList<Contact> r=new LinkedList<Contact>();
	if(contacts.isEmpty())
		return r;
	contacts.FindFirst();
	while(!contacts.List) {
		if(contacts.retrieve().getBirthday().equals(b)res.insert(contacts.retrieve());
		contacts.findnext(){
		contacts.FindFirst();
		}
		
		if(contacts.retrieve().getBirthday().equals(b)res.insert(contacts.retrieve())
				return r; }
public static void print_contacts(Phonebook p1){
	if(!p1.contacts.isEmpty()){
	p1.contacts>.FindFirst();
	while(!p1.contacts.Last()){
	p1.contacts.retrieve().display_c();
	p1.contacts.findNext();	
	}
        p1.contacts.retrieve().display_c();
}else
System.out.println("is empty");
}
public static void print_contacts_byname(LinkedList<Contact>A){
	if(!A.isEmpty()){
	A.FindFirst();
	while(!A.Last()){
	System.out.println(A.retrieve().get_Name());
	A.findNext();	
	}
	System.out.println(A.retrieve().get_Name());
}else
System.out.println("is empty");
}

public static void print_List_Events(LinkedList<Event>A){
	if(!A..isEmpty()){
	A.FindFirst();
	while(!A.Last()){
	System.out.println(A.retrieve()+" linked with contacts: ");
	print_contacts_byname(A.retrieve().contact_event);
	A.findNext();	
	}
	System.out.println(A.retrieve()+" linked with contacts: ");
	print_contacts_byname(A.retrieve().contact_event);
}else
System.out.println("is empty");
}




























}
