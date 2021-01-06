
class Node{
	int key;
	Node left,right;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.key = data;
		this.left = this.right = null;
	}
}

public class BinaryTree {
	
	Node root;
	static int sum = 0;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public int checkSumTree(Node root){
		if(root==null)
			return 0;
		sum = checkSumTree(root.left)+root.key+checkSumTree(root.right);
		return sum;
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(14);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		int val = tree.checkSumTree(tree.root)-tree.root.key;
		
		if(tree.root.key == val){
			System.out.println("Sum Tree");
		}
		else{
			System.out.println("Not");
		}
		
	}
	
}
