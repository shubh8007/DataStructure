package tree;

public class Main {

	public static void main(String[] args) {
	BinarySearchTree bst=new BinarySearchTree();
	System.out.println(bst.insert(50));

	System.out.println(bst.insert(20));
	System.out.println(bst.insert(30));
	bst.preorder();
	System.out.println(bst.insert(40));
bst.inorder();
bst.inorder();
bst.preorder();


	}

}
