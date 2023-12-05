package project;


import java.sql.Time;
import java.util.LinkedList;

/***********************************
CLASS: ContactBST.java and BSTNode.java
CSC212 Data structures - Project phase II
Winter 2023
EDIT DATE:
28-11-2023
TEAM:
MMA
AUTHORS:
Muhannad Alasmari, 443102430
***********************************/
class BSTNode<T>{
	public String key;
	public T data;
	public BSTNode<T> left, right;
	
	public BSTNode(String k, T val){
		key = k;
		data = val;
		left = right = null;
	}
	
	public BSTNode(String k, T val, BSTNode<T> l, BSTNode<T> r){
		key = k;
		data = val;
		left = l;
		right = r;
	}
}

public class ContactBST<T>{
	
	private BSTNode<T> root, current;
	
	public ContactBST(){
		root = current = null;
	}

	public boolean empty(){
		return root==null;
	}
	public void clear() {
		current = root = null;
	}
	public void findNext() {
	current= current.right;
	}
	public boolean full(){
		return false;
	}
	
	public T retrieve(){
		return current.data;
	}
	
	public boolean findkey(String tkey){
		BSTNode<T> p = root;
		while(p!=null){
			current = p;
			if(tkey.compareToIgnoreCase(p.key)==0)
				return true;
			else if (tkey.compareToIgnoreCase(p.key)<0)
				p = p.left;
			else
				p = p.right;
		}
		return false;
	}
	
	public boolean insert(String k, T val) {
		if(root==null){
			current = root = new BSTNode<T>(k, val);
			return true;
		}
		
		BSTNode<T> p = current;
		if (findkey(k)) {
			current = p;
			return false;
		}
		BSTNode<T> tmp = new BSTNode<T>(k, val);
		if(k.compareToIgnoreCase(current.key)<0)
			current.left = tmp;
		else
			current.right = tmp;
		current = tmp;
		return true;
	}
	
	public boolean remove_key (String tkey){
		String k1 = tkey;
		BSTNode<T> p = current;
		BSTNode<T> q = null;
		while(p!=null){
			if(k1.compareToIgnoreCase(p.key)<0){
				q = p;
				p = p.left;
			}
			else if(k1.compareToIgnoreCase(p.key)>0){
				q = p;
				p = p.right;
			}
			else{
				if((p.left!=null)&&(p.right!=null)){
					BSTNode<T> min = p.right;
					q = p;
					while(min.left!=null){
						q = min;
						min = min.left;
					}
					p.key = min.key;
					p.data = min.data;
					k1 = min.key;
					p = min;
				}
				if(p.left!=null)
					p = p.left;
				else
					p = p.right;
				
				if(q==null)
					root = p;
				else{
					if(k1.compareToIgnoreCase(q.key)<0)
						q.left = p;
					else
						q.right = p;
				}
				current = root;
				return true;
			}	
		}
		return false;
	}
	private BSTNode<T> remove_aux(String key, BSTNode<T> p, Boolean flag) {
		BSTNode<T> q, child = null;
		if(p == null)
			return null;
		if(key.compareToIgnoreCase(p.key)<0)
			p.left = remove_aux(key, p.left, flag); //go left
		else if(key.compareToIgnoreCase(p.key)>0)
			p.right = remove_aux(key, p.right, flag); //go right
		else {
			flag = true;
			if (p.left != null && p.right != null){ //two children
				q = find_min(p.right);
				p.key = q.key;
				p.data = q.data;
				p.right = remove_aux(q.key, p.right, flag);
			}
			else {
				if (p.right == null) //one child
					child = p.left;
				else if (p.left == null) //one child
					child = p.right;
				return child;
			}
		}
		return p;
	}
	
	private BSTNode<T> find_min(BSTNode<T> p){
		if(p == null)
			return null;
		
		while(p.left != null){
			p = p.left;
		}
		
		return p;
	}
	
	public boolean update(String key, T data){
		remove_key(current.key);
		return insert(key, data);
	}

	public boolean check_phone_Exist(String ph){
		if(root==null)
			return false;
		else
			return check_phone_inOrder((BSTNode<Contact>)root,ph);
	}

	private boolean check_phone_inOrder(BSTNode<Contact> p, String ph){
		if(p==null)
			return false;
		boolean exist_in_left = check_phone_inOrder(p.left, ph);
		if(exist_in_left)
			return true;
		if(p.data.getNumber().equals(ph))
			return true;
		return check_phone_inOrder(p.right,ph);
	}

	public LinkedList<Contact> search_by_first_name(String n){
		LinkedList<Contact> res = new LinkedList<Contact>();
		if(root==null)
			return res;
		rec_search_by_first_name(root,res,n);
		return res;
	}
	public LinkedList<Contact> search_by_email(String n) {
		LinkedList<Contact> res = new LinkedList<Contact>();
		if(root==null)
			return res;
		rec_search_by_Email(root,res,n);
		return res;
	}
	
	private void rec_search_by_Email(BSTNode<T> root2, LinkedList<Contact> res, String n) {
		if(root2==null)return;
		rec_search_by_Email(root2.left,res,n);
		
		if(((Contact)root2.data).getEmail().equals(n)) {
			res.add((Contact)root2.data);
		}
		rec_search_by_Email(root2.right,res,n);
	}
	public LinkedList<Contact>search_by_first_name1(String n){
		LinkedList<Contact>res=new LinkedList<Contact>();
		if(root==null)
			return res;
rec_search_by_first_name(root,res,n);
return res;
	}
	private void rec_search_by_first_name(BSTNode<T>p, LinkedList<Contact> res, String n) {
		if(p==null) {
			return;}
		rec_search_by_first_name(p.left,res,n);
		String cur_full_Name=p.key;
		String First_name=cur_full_Name.substring(0,cur_full_Name.indexOf(" "));
		if(First_name.equals(n)) {
///			res.insert((Contact)p.data);
			}
	
		rec_search_by_first_name(p.right,res,n);
	

}
	public void inOrder() {
		if(root==null)
			System.out.println("empty tree");
			else
				inOrder((BSTNode<Contact>)root);
			
		}
	public void inOrder(BSTNode<Contact>p){
		if(p==null)
			return;
		inOrder(p.left);
		System.out.println("Key = "+p.key);
		System.out.println(p.data.toString());
		inOrder(p.right);
	}

	public void preOrder(){
		if(root==null)
			System.out.println("Empty Tree");
		else
			preOrder((BSTNode<Contact>)root);
	}
	
	private void preOrder(BSTNode<Contact> p){
		if(p==null)
			return;
		System.out.println("Key = "+p.key);
		System.out.println(p.data.toString());
		preOrder(p.left);
		preOrder(p.right);
	}

	public boolean is_conflict(Event e){
		if(root==null)
			return false;
		return is_conflict(e,(BSTNode<Event>)root);
	}

	public boolean is_conflict(Event e, BSTNode<Event> p){
		if(p==null)
			return false;
		if((e.getEvent_date().equals(p.data.getEvent_date()))&&(e.getEvent_time().equals(p.data.getEvent_time())))
			return true;
		return is_conflict(e, p.left) || is_conflict(e, p.right);
	}
public void findRoot() {
		current =root;
	}
	public String curkey() {
		return current.key;
	}
	public void findRight() {
		current =root;
	}
	public void findLeft() {
		current =root;
	}
	public int nbCompkey(String k) {
		int nb=0;
		BSTNode<T> p = root;
		while(p!= null) {
			nb++;
			if(k.compareToIgnoreCase(p.key)==0){
				return nb;
			
		}else if(k.compareToIgnoreCase(p.key)<0) {
			p = p.left;
		}else {
			p = p.right;
		}}
		return nb;
		}
	public int is_greater(String tt1, String tt2) {
		String a1[]=tt1.split(":");
		String a2[]=tt1.split(":");
		if(Integer.parseInt(a1[0])>Integer.parseInt(a2[0])) 
		return 1;
		else if(Integer.parseInt(a1[0])<Integer.parseInt(a2[0])) 
		return -1;
		else {
			if(Integer.parseInt(a1[1])>Integer.parseInt(a2[1])) 
				return 1;
				else if(Integer.parseInt(a1[1])<Integer.parseInt(a2[1])) 
				return -1;
				else
					return 0;
		}
	}
public int is_greater1(String tt1, String tt2) {
		String a1[]=tt1.split(":");
		String a2[]=tt1.split(":");
		Time t1=new Time(Integer.parseInt(a1[0]),Integer.parseInt(a1[1]),0);
		Time t2=new Time(Integer.parseInt(a2[0]),Integer.parseInt(a2[1]),0);
		return t1.compareTo(t2);
	}
	
	public boolean update1(String key, T data){
		remove_key(current.key);
		return insert(key, data);
	}

	
	
}
