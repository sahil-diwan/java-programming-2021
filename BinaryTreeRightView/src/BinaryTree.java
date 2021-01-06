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
	static int max_level = 0;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void printRightView(Node root){
		rightViewUtil(root, 1);
	}
	
	public void rightViewUtil(Node root, int level){
		
		if(root==null)
			return;
		if(max_level<level){
			System.out.print(root.key+" ");
			max_level = level;
		}
		rightViewUtil(root.right, level+1);
		rightViewUtil(root.left, level+1);
				
	}
	

	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Level Order traversal is");
		tree.printRightView(tree.root);
		
	}

}
