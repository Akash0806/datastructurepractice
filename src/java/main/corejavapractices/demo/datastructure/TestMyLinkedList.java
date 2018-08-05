package corejavapractices.demo.datastructure;

public class TestMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList linkedList=new MyLinkedList(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.getNode().nextNode.nextNode.nextNode.nextNode=linkedList.getNode();
		//linkedList.addNode(5);
		System.out.println("Is Loop In LinkedList :"+linkedList.isLoopInLinkedlist(linkedList.getNode()));
		linkedList.printList(linkedList.getNode());
		//System.out.println(linkedList.getKthNodeFromEndWithOutLenght(2).getObject());
	    // linkedList.reverseLinkedList();
		//System.out.println(linkedList.getMiddelElementInOnePass(linkedList.getNode()));
		// linkedList.traverseLinkedList(linkedList.getNode());

	}

}
