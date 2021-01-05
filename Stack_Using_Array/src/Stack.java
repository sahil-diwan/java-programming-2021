
public class Stack {

	static final int MAX= 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty(){
		return (top<0);
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
		top = -1;
	}
	
	boolean push(int x){
		if(top >= (MAX-1)){
			System.out.println("Stack Overflow");
			return false;
		}
		else{
			a[++top]=x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		else{
			return a[top--];
		}
	}
	
	
	int peek(){
		if(top<0){
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		else{
			return a[top];
		}
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
	}
}
