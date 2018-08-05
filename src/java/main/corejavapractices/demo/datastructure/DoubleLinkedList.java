package corejavapractices.demo.datastructure;

public class DoubleLinkedList {

	DoubleLinkedListNode head;
	DoubleLinkedListNode tail;
	int length;
	
	public void insertFrontNode(int element){
		    DoubleLinkedListNode tmp = new DoubleLinkedListNode(tail,null,element);
	        if(tail != null) {
	        	tail.next = tmp;
	        	}
	        tail = tmp;
	        if(head == null) { 
	        	head = tmp;
	        }
	        length++;
	        System.out.println("adding: "+element);
		
	}
	
	
	class DoubleLinkedListNode{
		DoubleLinkedListNode prev;
		DoubleLinkedListNode next;
		int object;
		
		public DoubleLinkedListNode(DoubleLinkedListNode prev,DoubleLinkedListNode next,int object){
			this.prev=prev;
			this.next=next;
			this.object=object;
		}
		
		
	}
}
