package corejavapractices.demo.datastructure;

public class MyStack {
	
	public static void main(String[] args) {
		MyStack myStack=new MyStack(3);
		myStack.push(1);
		myStack.push(2);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
	}
	
	int capacity;
	int top=-1;
	int array[]=null;
	
	public MyStack(int capacity){
		this.capacity=capacity;
		this.array=new int[capacity];
	}
    
	
	public void push(int element){
		if(top<capacity-1){
		top++;
		array[top]=element;
		}
	}
	
	public int pop(){
		if(top>=0){
		  int elemt=array[top];
		  top--;
		  return elemt;
		}
		return -1;
	}
}
