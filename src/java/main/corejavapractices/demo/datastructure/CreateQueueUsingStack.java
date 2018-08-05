package corejavapractices.demo.datastructure;

public class CreateQueueUsingStack {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateQueueUsingStack queueUsingStack=new CreateQueueUsingStack(4);
		queueUsingStack.enqueue(1);
		queueUsingStack.enqueue(2);
		queueUsingStack.enqueue(3);
		queueUsingStack.dequeue();
		
	}
	
	MyStack myStack1;
	MyStack myStack2;
	int front=0;
	int rear=-1;
	int currentPosition;
	int capacity;
	
	public CreateQueueUsingStack(int capacity){
		this.myStack1=new MyStack(capacity-1);
		this.myStack2=new MyStack(capacity-1);
		this.capacity=capacity-1;
   }
	
	
    public void enqueue(int elemnt){
    	if(rear<capacity){
    	System.out.println("Push :"+elemnt);
    	myStack1.push(elemnt);
    	rear++;
    	}
    }
    
    public void dequeue(){
    	   	
      int capcity = capacity-1;
	  for(int i=0;i<capcity;i++){
		   int element=myStack1.pop();
		   System.out.println("Pop from stack1 :"+element);
		   myStack2.push(element);
        }
	    System.out.println("Last Pop : "+myStack1.pop());
	    MyStack temp=myStack1;
	    myStack1=myStack2;
	    myStack2=temp;
    	
    }

}
