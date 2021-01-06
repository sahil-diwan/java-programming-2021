class Node{
	int key;
	Node left,right;
	
	public Node(int key) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.left = this.right = null;
	}
}
public class BinaryTree {

	Node root;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void reverseLevelOrder(Node root){
		
		int h  = height(root);
		System.out.println("Height "+h);
		int i;
		for(i=h;i>=1;i--){
			printGivenLevel(root,i);
		}
		
	}
	
	public static void printGivenLevel(Node root,int level){
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.key+" ");
		else
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
	}
	
	public static int height(Node root){
		
		if(root == null)
			return 0;
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		if(lHeight>rHeight)
			return lHeight+1;
		else
			return rHeight+1;
		
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Reverse Level Order Traversal");
		tree.reverseLevelOrder(tree.root);
	}
}
