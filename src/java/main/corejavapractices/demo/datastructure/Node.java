package corejavapractices.demo.datastructure;

public class Node {

	int object;
	Node nextNode;
	
	public Node(int object){
		this.object=object;
		nextNode=null;
	}

	public int getObject() {
		return object;
	}

	public void setObject(int object) {
		this.object = object;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
