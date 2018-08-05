package corejavapratice.demo.sorting;

import java.util.Arrays;

public class MergeSortImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer [] arrayElemnt={2,5,3,8,1,30,4,85}; 
      
      mergeSort1(arrayElemnt);
      System.out.println("Destination>"+Arrays.toString(arrayElemnt));
	}
	
	/*private static int[] dividedArrayinSubArray(int resultArr[]){
		int leftarryLengh=resultArr.length/2;
		int [] leftArray=new int[leftarryLengh];
		int rightArrLength=resultArr.length-leftArray.length;
		int [] rightArray=new int[rightArrLength];
		System.arraycopy(resultArr, 0, leftArray, 0, leftarryLengh);
		System.arraycopy(resultArr, leftarryLengh, rightArray, 0, rightArrLength);
		System.out.println("Left Array>"+Arrays.toString(leftArray));
		System.out.println("Right Array>"+Arrays.toString(rightArray));
		dividedArrayinSubArray(leftArray);
		dividedArrayinSubArray(rightArray);
		mergeElementArray(leftArray, rightArray, resultArr);
		return resultArr;
	}*/
	
	public static Integer[] mergeSort1(Integer [] list){
		if(list.length==0)
		return list;
		
		Integer length = list.length;
		Integer firstLen=length/2;
		Integer secondLen=(length-firstLen);
		System.out.println("firstLen :"+firstLen+":: secondLen >"+secondLen);
		Integer firstArray []=new Integer[firstLen];
		Integer secondArray[]=new Integer[secondLen];
		System.arraycopy(list, 0, firstArray, 0, firstLen);
		System.arraycopy(list, firstLen, secondArray, 0, secondLen);
		System.out.println("firstArray >"+Arrays.toString(firstArray));
		System.out.println("secondArray >"+Arrays.toString(secondArray));
		mergeSort1(firstArray);
		mergeSort1(secondArray);
		mergeElementArray1(firstArray,secondArray,list);
		return list;
	}
	
	@SuppressWarnings("rawtypes") 
    public static Comparable[] mergeSort(Comparable[] list) 
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }
         
        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
         
        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);
         
        //Merge both halves together, overwriting to original array
        mergeElementArray(first, second, list);
        return list;
    }
	
	private static void mergeElementArray(Comparable []leftArray
			,Comparable []rightArray,Comparable[] resultArray){
		
		int firstIndex=0;
		int secorndIndex=0;
		int mergeArrayIndex=0;
		//int[] temparray=new int[resultArray.length];
		
		while(firstIndex < leftArray.length && secorndIndex < rightArray.length){
			
			if(leftArray[firstIndex].compareTo(rightArray[secorndIndex])<0){
				resultArray[mergeArrayIndex]=leftArray[firstIndex];
				firstIndex++;
			}else{
				resultArray[mergeArrayIndex]=rightArray[secorndIndex];
				secorndIndex++;
			}
			mergeArrayIndex++;
		}
		 System.arraycopy(leftArray, firstIndex, resultArray, mergeArrayIndex, leftArray.length - firstIndex);
	     System.arraycopy(rightArray, secorndIndex, resultArray, mergeArrayIndex, rightArray.length - secorndIndex);
	}
	
	private static void mergeElementArray1(Integer []leftArray
			,Integer []rightArray,Integer[] resultArray){
		
		int firstIndex=0;
		int secorndIndex=0;
		int mergeArrayIndex=0;
		//int[] temparray=new int[resultArray.length];
		
		while(firstIndex < leftArray.length && secorndIndex < rightArray.length){
			
			if(leftArray[firstIndex].compareTo(rightArray[secorndIndex])<0){
				resultArray[mergeArrayIndex]=leftArray[firstIndex];
				firstIndex++;
			}else{
				resultArray[mergeArrayIndex]=rightArray[secorndIndex];
				secorndIndex++;
			}
			mergeArrayIndex++;
		}
		 System.arraycopy(leftArray, firstIndex, resultArray, mergeArrayIndex, leftArray.length - firstIndex);
	     System.arraycopy(rightArray, secorndIndex, resultArray, mergeArrayIndex, rightArray.length - secorndIndex);
	}

}
