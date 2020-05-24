package code;

public class LinkedList {
	
	Node head;

	public void push(int data) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			Node n= head;
			if(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}

	public void display() {
		// TODO Auto-generated method stub
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data+ " ");
			node=node.next;
		}
		System.out.println(node.data);
		
	}

	public void pop() {
		// TODO Auto-generated method stu
		Node node = head;
		Node n= null;
		if(head == null) {
			System.out.print("List is empty");
		}else {
			while(node.next!=null) {
				n = node;
				node=node.next;
			}
			n.next = null;
			node = n;	
		}
		
	}

}
