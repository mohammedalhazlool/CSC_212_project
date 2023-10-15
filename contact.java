package a;

import java.util.Scanner;

public class Contact implements Comparable<String>
{
private String name;
private String number;
private String birthday;
private String notes;
private String email;
private String address;
public contact() {
	
}
public Contact(String name, String number, String birthday, String notes, String email, String address) {
	this.name= name;
	this.number=number;
	this.birthday=birthday;
	this.notes=notes;
	this.email=email;
	this.address=address;
}

public Contact(Contact a) {
	this.address=a.address;
	this.email=a.email;
	this.name=a.name;
	this.number=a.number;
	this.birthday=a.birthday;
	this.notes=a.notes;
	
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
	return (name.compareTo(n));
}
public void read_contact()
	{
System.out.println("Enter the contact's name");
name=read.nextLine();
System.out.println("Enter the phone number");		





	}





}
