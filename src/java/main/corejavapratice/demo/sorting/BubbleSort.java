package corejavapratice.demo.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayElement={2,1,5,7,4};
		getSortedArrayByBubbleSort(arrayElement);
		

	}
	
	private static int[] getSortedArrayByBubbleSort(int [] arrayElement){
		int count=0;
		//while(count>1){
		//int counter=
		int Arrlength = arrayElement.length;
		for(int i=Arrlength;i>0;i--){
			System.out.println("Value I="+i);
			for(int j=0;j<Arrlength-1;j++){
				System.out.println("Value J="+j);
				int e=j+1;
				if(arrayElement[j]>arrayElement[e]){
					int k=arrayElement[j];
					arrayElement[j]=arrayElement[e];
					arrayElement[e]=k;
					//count++;
				}
			}
		}
		//}
		System.out.println(Arrays.toString(arrayElement));
		
		return null;
	}

}
