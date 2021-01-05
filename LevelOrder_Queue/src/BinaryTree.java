import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left,right;
	
	public Node(int item) {
		// TODO Auto-generated constructor stub
		this.data = item;
		this.left = null;
		this.right = null;
	}
}
public class BinaryTree {

	Node root;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void printLevelOrder(){
		Queue<Node>  queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node tempNode = queue.poll();
			System.out.print(tempNode.data+" ");
			
			if(tempNode.left!=null){
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null){
				queue.add(tempNode.right);
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
	    tree_level.root.right = new Node(3);
	    tree_level.root.left.left = new Node(4);
	    tree_level.root.left.right = new Node(5);
	    
	    System.out.println("Level Order traversal of binary tree is -");
	    tree_level.printLevelOrder();
	}
}
