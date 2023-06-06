package Bs;

import java.util.Scanner;

public class BinaryTree {
	
	public class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value=value;
			
		}
	
	}
	
	public Node root;
	
	public void populate(Scanner scanner) {
		System.out.println("Enter the root node: ");
		int value=scanner.nextInt();
		root=new Node(value);
		populate(scanner, root);
	}
	
	public void populate(Scanner scanner, Node node) {
		System.out.println("Do you want to enter the left value of node "+ node.value);
		boolean left=scanner.nextBoolean();
		if(left){
			System.out.println("Enter the left value for root node "+node.value);
			int value=scanner.nextInt();
			node.left=new Node(value);
			populate(scanner,node.left);
		}
		
		System.out.println("Do you want to enter the right value of root node"+ node.value);
		boolean right=scanner.nextBoolean();
		if(right){
			System.out.println("Enter the value of right node "+node.value);
			int value=scanner.nextInt();
			node.right=new Node(value);
			populate(scanner,node.right);
		}
	}
	
	public void display() {
		display(root, "");
	}
	
	public void display(Node node, String indent) {
		if(node==null) {
			return;
		}
		System.out.println(indent+node.value);
		display(node.left,indent+ "\t");
		display(node.right,indent+ "\t");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		tree.populate(scanner);
		tree.display();

	}

}
