package project;


import java.util.Scanner;

public class Phonebook {
static LinkedList<Contact>contacts;

public phonebook() {
	
	contacts = new LinkedList<Contact>();
	
}

public phonebook( LinkedList<Contact> contacts) {
	this.contacts = contacts;
	
}

public void Add_Sorted_User(Contact d) {
	
	if (contacts.iSEmpty()) {
		
	}
	contacts.insert(d);
	return;
}
else {
	contacts.FindFirst();
	if(d.compare.retrieve().getContact_name())<0){
		Contact c = new Contact(contacts.retrieve());
		contacts.update(d);
		contacts.insert(c);
		return;
	}
	
	else {
		while(!contacts.retrieve().compareTo(d.getContact_name())<=0) {
			contacts.findNext();
		}
	}
	
	if(contacts.retrieve().compareTo(d.getContacts_name())>0) {
		Contact c = new Contact(contacts.retrieve());
		contacts.update(d);
		contacts.insert(c);
	}
	else {
		
		d.display_contact();
		contacts.insert(d);
		
		}
}
}
}

public boolean search(Contact c) {
	if(contacts.Empty())
		return false;
	contacts.FindFirst();
	while(!contacts.last()) {
		if(contacts.retrieve().getContact_name().equals(c.getContact_name())||contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
return true;
contacts.FindNext();
	}
	if(contacts.retrieve.getContact_name().equals(c.getContact_name()) || contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
		return true;
	else
		return false;
}

public void add_contact(Contacts c) {
	boolean found = search(c);
	if(!found) {
		contacts.Add_sorted1(c);
		
	}
	
}

public void delete contact(String n) {
	if (contacts.isEmpty()) {
		System.out.print("empty List can not delete");
		return;
	}
	contacts.FindFirst();
	while(!contacts.last()) {
		if(contacts.retrieve.getContact_name().equals(n)) {
			contact.remove();
			System.out.println(n+"contact deleted");
		}
		else System.out.println("can not be deleted because it does not exist");
	}
	
	
}





































