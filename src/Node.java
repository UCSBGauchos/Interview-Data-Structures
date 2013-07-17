//LinkList Node

public class Node {
	private Node next; //for linking the next node
	private int data;
	
	public Node(int _data){
		this.data = _data;
	}
	
	public void addToTail(int data){
		Node end = new Node(data);
		Node current = this;
		while (current.next!=null){
			current = current.next;
		}
		current.next = end;
	}
	
	public static Node deleteNode(Node head, int data){
		Node current = head;
		
		if(current.getValue()==data){
			return head.next;
		}
		
		while(current.next!=null){
			if(current.next.getValue()==data){
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return head;
	}
	
	public int getValue(){
		return this.data;
	}
	
	public static void main(String args[]){
		Node n1 = new Node(2);
		n1.addToTail(3);
		
		Node head = n1;
		//head = deleteNode(head,2);
		
		Node point = head;
		
		while(point!=null){
			System.out.println(point.getValue());
			point = point.next;
		}
	}
	
}

