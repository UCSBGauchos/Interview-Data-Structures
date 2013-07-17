
public class queue {
	private Node first, last;
	
	public void enqueue(int data){
		if(first == null){
			last = new Node(data);
			first = last;
		}else{
			Node newNode = new Node(data);
			last.next = newNode;
			last = newNode;
		}
	}
	
	public int dequeue(){
		if(first!=null){
			int item = first.getValue();
			first = first.next;
			return item;
		}
		return 0;
	}
	
	public int watchLast(){
		return last.getValue();
	}
	
	public int watchFirst(){
		return first.getValue();
	}
	
	public static void main(String args[]){
		queue que = new queue();
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		que.dequeue();
		
		System.out.println(que.watchFirst());
		
		System.out.println(que.watchLast());
	}
}
