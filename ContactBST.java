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
	BSTNode<T> root, current;
	
	public ContactBST(){
		root = current = null;
	}
	
	public boolean empty(){
		return root==null;
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
/* see the rest of this later
	private BSTNode<T> remove_aux(int key, BSTNode<T> p, Boolean flag) {
		BSTNode<T> q, child = null;
		if(p == null)
			return null;
		if(key < p.key)
			p.left = remove_aux(key, p.left, flag); //go left
		else if(key > p.key)
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
	
	public boolean update(int key, T data){
		remove_key(current.key);
		return insert(key, data);
	}
*/
}
