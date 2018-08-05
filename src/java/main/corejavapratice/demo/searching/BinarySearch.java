package corejavapratice.demo.searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,4,5,8,22};
		int findelemtn=searchElementByBinary(arr, 0, arr.length,22 );
		System.out.println("Element Position :"+findelemtn);

	}
	
	private static int searchElementByBinary(int[] arr,int left,int right,int elemnt){
		
		int pivot=(left+right)/2;
		
		if(arr[pivot]<elemnt){
			int mid=pivot+1;
			return searchElementByBinary(arr, mid, right, elemnt);
		}
		else if(arr[pivot]>elemnt){
			int mid=pivot-1;
			return searchElementByBinary(arr, left, mid, elemnt);
		}else{
			return pivot;
		}
		
	//return pivot;	
		
	}

}
