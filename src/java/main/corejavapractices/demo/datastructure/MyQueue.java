package corejavapractices.demo.datastructure;

public class MyQueue {
	
	public static void main(String[] args) {
		MyQueue myQueue=new MyQueue(4);
		myQueue.enQueue(1);
		myQueue.enQueue(2);
		myQueue.enQueue(3);
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
	}

	int queueArray[] = null;
	int top = 0;
	static int front=0;
	int rear=-1;
	int capacity=0;
	static int currentSize;

	public MyQueue(int capacity) {
		this.queueArray = new int[capacity];
		this.capacity = capacity - 1;
	}

	public void enQueue(int element) {
		//if (top > 0) {
		   if(rear==capacity){
			   rear=0;
		   }
		    rear++;
			queueArray[rear] = element;
			currentSize++;
		//}

	}

	public int  deQueue() {
		
		front++;
		int element=queueArray[front-1];
		//System.out.println("dequeueElemnt : "+element);
		if(front == capacity){
            System.out.println("Pop operation done !| removed: "+element);
            front = 0;
        } else {
            System.out.println("Pop operation done ! removed: "+element);
        }
		return element;
	}

}
