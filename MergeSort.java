package Bs;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		mergeSort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	public static  void mergeSort(int arr[],int s,int e) {
		//tree going to end in  1
		if(e-s==1) {
			return;
		}
		//int mid=(s+e)/2; should be always inside bracket
		int mid=s+(e-s)/2;
		
		mergeSort(arr,s,mid);
		mergeSort(arr,mid,e);
		
		mergeSort(arr,s,mid,e);	
	}
	
	public static void  mergeSort(int arr[],int s,int mid,int e) {
		//important to create a array
		int[] mix=new int [e-s];
		
		int i=s;
		int j=mid;
		int k=0;
		
		while(i<mid && j<e) {
			if(arr[i]<arr[j]) {
				mix[k]=arr[i];
				i++;
				k++;
			}else {
				mix[k]=arr[j];
				j++;
				k++;
			}
			
			
		}
		while(i<mid) {
			mix[k]=arr[i];
			i++;
			k++;
			
		}while(j<e) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		
		for(int l=0;l<mix.length;l++) {
			arr[s+l]=mix[l];
		}
		
		
	}

}
