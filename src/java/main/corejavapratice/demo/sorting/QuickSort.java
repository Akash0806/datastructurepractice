package corejavapratice.demo.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]={2,1,3,6,4,9};
       sort(arr);
       System.out.println(Arrays.toString(arr));
       
	}
	
	public static void sort(int [] elements){
		if(elements.length<1){
		return ;
		}
		int high=elements.length;
		int low =0;
		sortingAlgo(elements, high-1, low);
	}
	public static void sortingAlgo(int elements[],int high,int low){
		int i=low;
		int j=high;
		int pivot=elements[low+(high-low/2)];
		while (i <= j) {
		while(elements[j]>pivot){
			j--;
		}
		while(elements[i]<pivot){
			i++;
		}
		if(i<=j){
			swap(i,j,elements);
			i++;
			j--;
		}
		}
		if(low<j){
			sortingAlgo(elements, j, low);
		}
		if(i<high){
			sortingAlgo(elements, high, i);
		}
				
		
	}

	private static void swap(int i, int j,int elements[]) {
		// TODO Auto-generated method stub
		int temp=elements[i];
		elements[i]=elements[j];
		elements[j]=temp;
	}

}
