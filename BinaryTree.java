//오류 Exception in thread "main" java.lang.NullPointerException?? root!=null인데 왜 오류나는징?
package datastructure;

class Node{
	Object data;
	Node left;
	Node right;
}

public class BinaryTree {
	private Node root;
	
	public Node BT(Node left, Object data, Node right) {
		root.left=left;
		root.data=data;
		root.right=right;
		
		return root;
	}
	
	static public void preorder(Node root) {
		if(root!=null) {
			System.out.println(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	static public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data+" ");
			inorder(root.right);
		}
	}
	static public void postorder(Node root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree T = new BinaryTree();
		
		Node n7=T.BT(null, 'D', null);
		Node n6=T.BT(null, 'C', null);
		Node n5=T.BT(null, 'B', null);
		Node n4=T.BT(null, 'A', null);
		Node n3=T.BT(n6, '/', n7);
		Node n2=T.BT(n4, '*', n5);
		Node n1=T.BT(n2, '-', n3);
		
		System.out.println("Preorder : ");
		T.preorder(n1);
		System.out.println();
		System.out.println("ineorder : ");
		T.preorder(n1);
		System.out.println();
		System.out.println("Postorder : ");
		T.preorder(n1);
		System.out.println();
	}
}
