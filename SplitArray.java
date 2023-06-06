package Bs;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {7,2,5,10,8};
		int no=splitArray(nums,2);
		System.out.println(no);
		

	}
	
	 public static int splitArray(int[] nums, int k) {
	       int start=0;
			int end=0;
			
				for(int i=0;i<nums.length;i++) {
				start=Math.max(start, nums[i]);
				end+=nums[i];
				
			}
				System.out.println(start);
				System.out.println(end);
				while(start<end){
	                int mid=start+(end-start)/2;
	                System.out.println(mid+"mid");
			int sum=0;
			int pieces=1;
			
			for(int num:nums) {
				if(sum+num>mid) {
					System.out.println(sum+"sum");
					//create num subarray
					sum=num;
					pieces++;
				}else {
					sum+=num;
				}
			}
			if(pieces>k) {
	            start=mid+1;
			}else{
				end=mid;
			}
			}
				return end;
			 
	    }

}
