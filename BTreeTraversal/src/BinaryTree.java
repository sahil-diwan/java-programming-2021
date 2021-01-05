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
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void printPreOrder(Node root){
		if(root==null)
			return;
		System.out.print(root.key+" , ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	void printPostOrder(Node root){
		if(root==null)
			return;
		
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.key+" , ");
	}
	
	void printInOrder(Node root){
		if(root==null)
			return;
		printInOrder(root.left);
		System.out.print(root.key+" , ");
		printInOrder(root.right);
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Preorder Traversal of binary tree is :");
		tree.printPreOrder(tree.root);
		System.out.println();
		System.out.println("Inorder Traversal of binary tree is :");
		tree.printInOrder(tree.root);
		System.out.println();
		System.out.println("Postorder Traversal of binary tree is :");
		tree.printPostOrder(tree.root);
	}
}
