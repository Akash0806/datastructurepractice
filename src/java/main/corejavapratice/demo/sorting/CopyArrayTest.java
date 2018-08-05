package corejavapratice.demo.sorting;

import java.util.Arrays;

public class CopyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,5,8,6,7};
		int arr1[]=new int[3];
	    System.arraycopy(arr, 0, arr1, 0, arr1.length);
	    System.out.println(Arrays.toString(arr1));

	}
	


}
