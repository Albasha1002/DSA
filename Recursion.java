package Bs;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1%10);
		System.out.println(reverseMathtech(55));
		System.out.println(rev(55));
		System.out.println(count(399800787));
		System.out.println(helperStepCount(14,0));
		
	}
	
	
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	
	static void funRev(int n) {
		if(n==0) {
			return;
		}
		
		funRev(n-1);
		System.out.println(n);
	}
	static int factorial(int n) {
		if(n==1) {
			return n;
		}
		
		return n*factorial(n-1);
	}
	
	static int sum(int n){
		if(n%10==n) {
			
			return n;
		}
		
		
		
		
		
		return n%10 + sum(n/10);
		
	}
	static int sum=0;
	static int reverse(int n){
		if(n==0) {
			
			return n;
		}
		
		sum=sum*10+n%10;
		reverse(n/10);
		
		
		
		
		return sum;
		
	}
	
	static int reverseMathtech(int n){
		
		
		int digits=(int)(Math.log10(n))+1;
		
		
		
		
		return helper(n,digits);
	}
	
	static int helper(int n, int digits) {
		if(n%10==n) {
			return n;
			
		}
		int rem=n%10;
		return (int)(rem*Math.pow(10, digits-1))+helper(n/10,digits-1);
	}
	
	static boolean rev(int n){
		if(n==reverseMathtech(n)) {
			return true;
		}
		return false;
	}
	
	static int count(int n) {
		return helpercount(n,0);
		
	}
	
	static int helpercount(int n,int count) {
		
		if(n==0) {
			return count;
	
		}
		
		int rem=n%10;
		
		if(rem==0) {
			return helpercount(n/10,count+1);
		}
		return helpercount(n/10,count);
	}
	
static int helperStepCount(int n,int step) {
		
		if(n==0) {
			return step;
	
		}
		
		
		
		if(n%2==0) {
			return helperStepCount(n/2,step+1);
		}
		return helperStepCount(n-1,step+1);
	}
	
	


}
