package corejavapractices.demo.datastructure;

public class CreateStackWhichReturnValueFromQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue =new MyQueue(3);
		CreateStackWhichReturnValueFromQueue cr=new CreateStackWhichReturnValueFromQueue(3);
		cr.push(1);
		cr.pop();
		cr.push(2);
		cr.push(3);
		cr.pop();

	}
	int capacity;
	int top=-1;
	int array[]=null;
	MyQueue myQueue=null; 
	int currentPositon=0;
	MyQueue myQueue2=null;
	
	public CreateStackWhichReturnValueFromQueue(int capacity){
		this.capacity=capacity;
		this.array=new int[capacity];
		this.myQueue=new MyQueue(capacity);
		this.myQueue2=new MyQueue(capacity);
	}
	public void push(int elemnt){
		System.out.println("push into stack :"+elemnt);
		myQueue.enQueue(elemnt);
		currentPositon++;
		top++;
		
	}
	
	public void pop(){
		System.out.println("currentPositon "+currentPositon);
		//MyQueue queue1=new MyQueue(capacity);
		for(int i=0;i<top;i++){
			int elemnt=myQueue.deQueue();
			myQueue2.enQueue(elemnt);
		}
		System.out.println("Stack Pop :"+myQueue.deQueue());
		MyQueue temp=myQueue;
		myQueue=myQueue2;
		myQueue2=temp;
		
	}
	
	

}
