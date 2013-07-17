
public class Stack {
	private Node top;
	
	public int pop(){
		if (this.top!=null){
			int item = top.getValue();
			top = top.next;
			return item;
		}
		
		return 0;
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		
	}
	
	public int peek(){
		return top.getValue();
	}
	
	public static void main(String args[]){
		Stack stk = new Stack();
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.pop();
		System.out.println(stk.peek());
	}
}
