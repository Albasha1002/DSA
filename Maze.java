package Bs;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(maze(3,3));
         mazePath("",3,3);
	}
	
	static int maze(int r, int c) {
		if(r==1 || c==1) {
			System.out.println();
			return 1;
			
		}
		int left=maze(r-1,c);
		int right=maze(r,c-1);
		
		return left+right;
		
	}
	
	static void mazePath(String p,int r, int c) {
		//&& symbol is main
		if(r==1 && c==1) {
			System.out.println(p);
		}
		
		if(r>1) {
			mazePath(p+"D", r-1, c);
		}
		//This is for diagonal path
	   //if(r>1 && c>1) {
      ////mazePath(p+"D",r-1,c-1);
     ////			
    ////		}
		if(c>1) {
			mazePath(p+"R"+ "",r,c-1);
		}
	}
	
	static void mazePathdiagonal(String p, int r, int c) {
		
		if(r==1 && c==1) {
			System.out.println(p);
		}
		
	}

}
