package corejavapractices.demo.datastructure;

public class MyLinkedList {

	private int length;

	private Node node;

	public MyLinkedList(int object) {
		this.node = new Node(object);
		length++;
	}

	public void addNode(int object) {
		Node temp = this.node;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.setNextNode(new Node(object));
		length++;
	}

	public void reverseLinkedList() {
		Node reversedPart = null;
		Node head = this.getNode();
		Node current = head;
		while (current != null) {
			Node next = current.nextNode;// next=2 1 next=3
			current.nextNode = reversedPart;// 2=null;3=1
			reversedPart = current;// rever=1;rever=2;
			current = next;// 1=2//2=3;
		}
		head = reversedPart;
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getObject());
			temp = temp.nextNode;
		}

	}

	public Node getKthNodeFromEndWithOutLenght(int k) {
		Node mainNode = this.node;
		Node kthNode = this.node;
		int count = 1;
		while (count < k) {

			kthNode = kthNode.nextNode;
			count++;
		}

		while (kthNode != null) {
			kthNode = kthNode.nextNode;
			mainNode = mainNode.nextNode;
		}
		return mainNode;
	}

	public int getMiddelElementInOnePass(Node node) {

		Node current = this.getNode();
		Node middel = this.getNode();
		int length = 0;
		while (current != null) {
			length++;
			if (length % 2 == 0) {
				middel = middel.nextNode;

			}
			current = current.getNextNode();
		}
		if(length % 2==1){
		   middel=middel.getNextNode();
		}	
		return middel.getObject();

	}

	public void traverseLinkedList(Node root) {
		Node current = root;
		while (current != null) {
			System.out.println(current.getObject());
			current = current.getNextNode();
		}

	}
	
	public boolean isLoopInLinkedlist(Node root){
		Node slow = root, fast = root;
        while (slow != null && fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
            System.out.println("Slow :>"+slow.getObject()); 
            System.out.println("fast :>"+fast.getObject()); 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                removeLoop(slow, node);
                return true;
            }
        }
        return false;
	}
	
	 void removeLoop(Node loop, Node curr) {
	        Node ptr1 = null, ptr2 = null;
	 
	        /* Set a pointer to the beging of the Linked List and
	         move it one by one to find the first node which is
	         part of the Linked List */
	        ptr1 = curr;
	        while (1 == 1) {
	 
	            /* Now start a pointer from loop_node and check if it ever
	             reaches ptr2 */
	            ptr2 = loop;
	            while (ptr2.nextNode != loop && ptr2.nextNode != ptr1) {
	                ptr2 = ptr2.nextNode;
	            }
	 
	            /* If ptr2 reahced ptr1 then there is a loop. So break the
	             loop */
	            if (ptr2.nextNode == ptr1) {
	                break;
	            }
	 
	            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
	            ptr1 = ptr1.nextNode;
	        }
	 
	        /* After the end of loop ptr2 is the last node of the loop. So
	         make next of ptr2 as NULL */
	        ptr2.nextNode = null;
	    }
	 
	    // Function to print the linked list
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.object + " ");
	            node = node.nextNode;
	        }
	    }

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
