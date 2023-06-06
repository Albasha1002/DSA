package Bs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {8,7,6,5,3,2};
       bubbleSort(arr,arr.length-1,0);
       System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int arr[],int r,int c ) {
		if(r==0) {
			return;
		}
		
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
				
				bubbleSort(arr,r,c+1);
			}
				
			
		}
		bubbleSort(arr,r-1,0);
		
	}

}
