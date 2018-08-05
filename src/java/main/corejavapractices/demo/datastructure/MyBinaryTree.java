package corejavapractices.demo.datastructure;

public class MyBinaryTree {

	private BinaryTreeNode rootNode;

	public void insert(int data) {
		insert(rootNode, data);
	}

	public void insert(BinaryTreeNode node, int number) {
		BinaryTreeNode tmpNode = new BinaryTreeNode(number);
		if (node == null) {
			rootNode = tmpNode;
		} else {
			if (number < node.getData()) {
				if (node.getLeftNode() != null) {
					insert(node.getLeftNode(), number);
				} else {
					node.setLeftNode(tmpNode);

				}
			} else if (number > node.getData()) {
				if (node.getRightNode() != null) {
					insert(node.getRightNode(), number);
				} else {
					node.setRightNode(tmpNode);
				}
			}
		}

	}
	/*
	 * inorder :left preorder:root postorder:right
	 */

	public void travers(String orderType) {

		if ("preOrderTravers".equals(orderType)) {
			preOrderTravers(this.rootNode,0);
		}

	}

	public void preOrderTravers(BinaryTreeNode binaryTreeNode,int level) {
		System.out.println(binaryTreeNode.getData());
		/* root node */ ;
		level=level+1;
		if (binaryTreeNode.getLeftNode() != null){
			System.out.println("Left: Level"+level);
			preOrderTravers(binaryTreeNode.getLeftNode(),level+1);
		}
		if (binaryTreeNode.getRightNode() != null){
			System.out.println("Right: Level"+level);
			preOrderTravers(binaryTreeNode.getRightNode(),level+1);
		}

	}
	
	public boolean isBalanced(BinaryTreeNode root){
		if(getHeight(root)==-1){
			return false;
		}
		return true;
	}
	
	public int getHeight(BinaryTreeNode root){
		if(root==null){
			return 0;
		}
		int leftHeight=getHeight(root.getLeftNode());
		if(leftHeight==-1){
			return -1;
		}
		int rightHeight=getHeight(root.getRightNode());
		if(rightHeight==-1){
			return -1;
		}
		int result = leftHeight-rightHeight;
		int abs = Math.abs(result);
		System.out.println("ABS :"+result);
		if(abs>1){
			return -1;
		}
		
		return Math.max(leftHeight, rightHeight)+1;
	}

	public int heightOfBinaryTree(BinaryTreeNode root) {
		int height = 0;
		if (root == null) {
			return height;
		}

		int leftHeight = heightOfBinaryTree(root.getLeftNode());
		int rightHeight = heightOfBinaryTree(root.getRightNode());
		if (leftHeight > rightHeight) {
			height = leftHeight;
		} else {
			height = rightHeight;
		}
		return height + 1;

		/*
		 * left height right height get max from both height and return
		 */

	}

	public boolean search(BinaryTreeNode root, int element) {
		boolean isAvailable = false;
		if (root.getData() == element)
			isAvailable = true;
		else {
			if (root.getLeftNode() != null)
				isAvailable = search(root.getLeftNode(), element);
			if (root.getRightNode() != null)
				isAvailable = search(root.getRightNode(), element);

		}
		return isAvailable;

	}

	public BinaryTreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(BinaryTreeNode rootNode) {
		this.rootNode = rootNode;
	}

}
