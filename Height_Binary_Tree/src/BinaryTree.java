
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
	
	public static int height(Node root){
		
		if(root==null)
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
		tree.root.right.right = new Node(5);
		
		System.out.println("Height of Binary Tree "+ tree.height(tree.root));
	}
}
