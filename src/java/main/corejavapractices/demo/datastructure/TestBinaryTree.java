package corejavapractices.demo.datastructure;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MyBinaryTree binaryTree=new MyBinaryTree();
		//binaryTreeNode=new BinaryTreeNode(2);
		
		binaryTree.insert(2);
		binaryTree.insert(3);
		binaryTree.insert(1);
		binaryTree.insert(4);
		binaryTree.insert(5);
		/*binaryTree.insert(6);*/
		BinaryTreeNode rootNode = binaryTree.getRootNode();
		//binaryTree.insert(2);
		//binaryTree.insert(4);
		
		System.out.println(binaryTree);
		binaryTree.travers("preOrderTravers");
		int height=binaryTree.heightOfBinaryTree(rootNode);
		System.out.println("Height Of Binary Tree :"+height);
		System.out.println("Isbalance : >"+binaryTree.isBalanced(rootNode));
		System.out.println("Search :"+binaryTree.search(rootNode, 6));
		//System.out.println(binaryTreeNode);
		//binaryTreeNode.preOrderTravers(binaryTreeNode);

	}

}
