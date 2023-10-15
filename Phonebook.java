package project;


import java.util.Scanner;

public class Phonebook {
static LinkedListADT<Contact>contacts;

public phonebook() {
	
	contacts = new LinkedListADT<Contact>();
	
}

public phonebook( LinkedListADT<Contact> contacts) {
	this.contacts = contacts;
	
}

public void Add_Sorted_User(Contact d) {
	
	if (contacts.empty()) {
		
	}
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
		while(!contacts.retrieve().compareTo(d.getContact_name())<=0) {
			contacts.findNext();
		}
	}
	
	if(contacts.retrieve().compareTo(d.getContacts_name())>0) {
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
	if(contacts.empty())
		return false;
	contacts.findFirst();
	while(!contacts.isLast()) {
		if(contacts.retrieve().getContact_name().equals(c.getContact_name())||contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
return true;
contacts.findNext();
	}
	if(contacts.retrieve.getContact_name().equals(c.getContact_name()) || contacts.retrieve().getPhone_num().equals(c.getPhone_num()))
		return true;
	else
		return false;
}

public void add_contact(Contacts c) {
	boolean found = search(c);
	if(!found) {
		contacts.addInOrder(c);
		
	}
	
}

public void delete contact(String n) {
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
	
	
}





































