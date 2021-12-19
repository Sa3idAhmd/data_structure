package linked_list;

public class linkedlist {
	public class node {
		int data;
		node next;
	}
	node head = null;
	node tail=null;
	int len=0;

//insert from last
	public void insertlast(int e) {
		node newnode = new node();
		newnode.data = e;
		// first
		if (head == null) {
			head = tail= newnode;
			len+=1;
		}

		// not first
		else {
			tail.next=newnode;
			tail=newnode;
			len+=1;
		}

	}

	// insert from first
	public void insertfirst(int e) {
		node newnode = new node();
		newnode.data = e;
		if(head==null) {
			head=newnode;
			len+=1;
		}
		else {
			newnode.next=head;
			head=newnode;
			len+=1;
		}

	}
	
	//insert position
	public void insertposition(int e,int pos) {
		node newnode = new node();
		newnode.data = e;
		node current=head;
		for(int i=1;i<pos-1;i++) {
			current=current.next;
		}
		newnode.next=current.next;
		current.next=newnode;
		len+=1;
	}
	
	//delete from first
	public void deletefirst() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		else {
			head=head.next;
			len-=1;
		}
		
	}
	
	public void deletelast() {
		node current=head;
		while(current.next!=tail) {
			current =current.next;
		}
		tail=current;
		tail.next=null;
		len-=1;
	}
	public void deleteposition(int pos) {
		if(pos>len&&pos<0) {
			return;
		}
		else {
			node current=head;
			for(int i=1;i<pos-1;i++) {
				current=current.next;
			}
			current.next=current.next.next;
			len-=1;
		}
	}
	
	public void show() {
		node newnode = head;
		while (newnode.next != null) {
			System.out.println(newnode.data);
			newnode = newnode.next;
		}
		System.out.println(newnode.data);
	}
	public int size() {
		return len;
	}

		public static void main(String[] args) {
			linkedlist l1 = new linkedlist();
			l1.insertlast(3);                 //{3}
			l1.insertlast(4);                 //{3,4}
			l1.insertlast(1);                 //{3,4,1}
			l1.insertfirst(9);                //{9,3,4,1}
			l1.insertfirst(8);                //{8,9,3,4,1}
			l1.insertposition(5, 4);          //{8,9,3,5,4,1}
			l1.deletefirst();                 //{9,3,5,4,1}
			l1.deletelast();                  //{9,3,5,4}
			l1.deleteposition(3);             //{9,3,4}
			l1.show();
			System.out.println("size = "+l1.size());
		}

	
}



