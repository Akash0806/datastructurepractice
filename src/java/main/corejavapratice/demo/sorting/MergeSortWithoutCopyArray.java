package corejavapratice.demo.sorting;

import java.util.Arrays;

public class MergeSortWithoutCopyArray {
	
	private int[] inputArray=null;
	private int[] tempArray=null;
	
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tempArray=new int[inputArray.length];
		MergeSortWithoutCopyArray mergeSortWithoutCopyArray=new MergeSortWithoutCopyArray();
				mergeSortWithoutCopyArray.mergeSorting();

	}



	private  void mergeSorting() {
		int[] inputArray2={2,1,7,5,4,8};
		int j=0;
		int length = inputArray2.length;
		inputArray=new int[length];
		for(int element:inputArray2){
			inputArray[j]=element;
			j++;
		}
		this.tempArray=new int[inputArray.length];
		System.out.println("Before Sorting :"+Arrays.toString(inputArray));
		mergeSort(0, length-1);
		System.out.println("After Sorting:"+Arrays.toString(inputArray));
		
		
	}
	
	
	
	private  void mergeSort(int leftIndex,int rightIndex){
		if(leftIndex<rightIndex){
		int mid = leftIndex + (rightIndex - leftIndex) / 2;
		mergeSort(leftIndex, mid);
		mergeSort(mid+1, rightIndex);	
		mergeParts(leftIndex, rightIndex, mid);
		}
		
	}
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		 
        for (int i = lowerIndex; i <= higherIndex; i++) {
        	tempArray[i] = inputArray[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
            	inputArray[k] = tempArray[i];
                i++;
            } else {
            	inputArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
        	inputArray[k] = tempArray[i];
            k++;
            i++;
        }
 
    }

	
	private  void mergeElement(int leftIndex,int rightIndex,int mid){
		
		for(int i=0;i<rightIndex;i++){
			tempArray[i]=inputArray[i];
		}
		int firstArrayIndex=0;
		int secondArrayIndex=0;
		int mergeArrayIndex=0;
		
		while(firstArrayIndex<mid&&secondArrayIndex<rightIndex){
			if(tempArray[firstArrayIndex]<=tempArray[secondArrayIndex]){
				inputArray[mergeArrayIndex]=tempArray[firstArrayIndex];
				firstArrayIndex++;
			}else{
				inputArray[mergeArrayIndex]=tempArray[secondArrayIndex];
				secondArrayIndex++;
			}
			mergeArrayIndex++;	
		}
		/*while (firstArrayIndex < mid) {
			inputArray[mergeArrayIndex] = tempArray[firstArrayIndex];
			mergeArrayIndex++;
			firstArrayIndex++;
        }*/
 

	}

}
