/***********************************
CLASS: Contact.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
14-10-2023
TEAM:
MMA
AUTHORS:
Muhammed Alhithlool, 443101218
***********************************/

package project;

import java.util.Scanner;

public class Contact implements Comparable<String> {
	private String name;
	private String number;
	private String birthday;
	private String notes;
	private String email;
	private String address;
  public BST<Event>contact_events_BST=new BST<Event>();

	public Contact() {
	}

	public Contact(String name, String number, String birthday, String notes, String email, String address) {
		this.name = name;
		this.number = number;
		this.birthday = birthday;
		this.notes = notes;
		this.email = email;
		this.address = address;
	}

	public Contact(Contact a) {
		this.address = a.address;
		this.email = a.email;
		this.name = a.name;
		this.number = a.number;
		this.birthday = a.birthday;
		this.notes = a.notes;

	}

	public LinkedList<Event> getContact_event() {
		return contact_event;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

@Override
public int compareTo(String n) {
	// TODO Auto-generated method stub
	return name.compareTo(n);

	public int compareTo(Contact c) {
		return name.compareTo(c.name);
	}

	public void read_contact() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the contact's name");
		name = read.nextLine();
		System.out.println("Enter the phone number");
		number = read.nextLine();
		System.out.println("Enter the birthday");
		birthday = read.nextLine();
		System.out.println("Enter the notes");
		notes = read.nextLine();
		System.out.println("Enter the email");
		email = read.nextLine();
		System.out.println("Enter the address");
		address = read.nextLine();
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", birthday=" + birthday + ", notes=" + notes
				+ ", email=" + email + ", address=" + address + "]";
	}

	public void display_contact() {
		System.out.println("name: " + name);
		System.out.println("email: " + email);
		System.out.println("number: " + number);
		System.out.println("address: " + address);
		System.out.println("birthday: " + birthday);
		System.out.println("notes: " + notes);
	}

}

