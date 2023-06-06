package Bs;

public class fibnoacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=fibnocci(4);
		System.out.println(no);

	}
	
	public static int fibnocci(int n) {
		if(n<2) {
			System.out.println(n+"out");
			return n;
		}
		return fibnocci(n-1)+fibnocci(n-2);
	}

}
