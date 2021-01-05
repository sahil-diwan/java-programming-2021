
public class Stack {
	StackNode root;
	
	static class StackNode{
		int data;
		StackNode next;
		
		public StackNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}
	
	boolean isEmpty(){
		if(root==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void push(int x){
		StackNode newNode = new StackNode(x);
		
		if(root==null){
			root = newNode;
		}
		else{
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(x + " pushed to stack");
	}
	
	public int pop(){
		int popped = Integer.MIN_VALUE;
		if(root==null){
			System.out.println("Stack is empty");
		}
		else{
			popped = root.data;
			root = root.next;
		}
		return popped;
	}
	
	public int peek(){
		
		if(root==null){
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		else{
			return root.data;
		}
		
	}
	
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}
