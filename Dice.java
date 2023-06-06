package Bs;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        dice("",4);
	}
	public static  void dice(String p, int target) {
		
		if(target==0) {
			System.out.println(p);
		}
		
		for(int i=1;i<=6 && i<=target;i++) {
			
			dice(p+i,target-i);
		}
	}

}
