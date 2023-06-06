package Bs;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		quickSort(arr,0,arr.length-1);
	
		System.out.println(Arrays.toString(arr));

	}
	
	static void quickSort(int arr[], int low,int high) {
		if(low>=high) {
			return;
		}
		int s=low;
		int e=high;
		
		while(s<e) {
			int mid=s+(e-s)/2;
			
			while(arr[s]<arr[mid]){
				s++;
			}while(arr[mid]<arr[e]){
				e--;
			}
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		//we give this for terminating the loop of recursion
		//then only base case breaks
		//although it do it again and again still single array
		//already array get sorted in while loop
		//when we break only it return the stack even it is a single stack
		quickSort(arr,low,e);
		quickSort(arr,s,high);
		
		
	}
	

}
