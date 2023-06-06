package Bs;

import java.util.Arrays;

public class MazeObstacle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		boolean[][] maze={
			{true, true, true},
			{true, true, true},
			{true, true, true}
		};
		int path[][]=new int[maze.length][maze[0].length];
		
		//mazeObstacle("",maze,0,0);
		//
		//
		//
		//mazeAllPath("", maze, 0, 0);
		mazeMatrixPath("", maze, 0, 0, path, 1);

	}
	
	static void mazeObstacle(String p,boolean maze[][],int r,int c) {
		if(r==maze.length-1 && c==maze[0].length-1) {//start from 0,0
		 System.out.println(p);
		 return;
		}
		
		if(maze[r][c]==false) {//(!maze[r][c])
			return;
		}
		
		if(r<maze.length-1) {
			mazeObstacle(p+"D",maze,r+1,c);// here r+1, c+1
		}if(c<maze[0].length-1) {
			mazeObstacle(p+"R",maze,r,c+1);//c+1
		}
		
	}
	
	static void mazeAllPath(String p,boolean maze[][],int r,int c) {
		if(r==maze.length-1 && c==maze[0].length-1) {//start from 0,0
		 System.out.println(p);
		 return;
		}
		
		if(maze[r][c]==false) {
			//(!maze[r][c])
			return;
		}
		maze[r][c]=false;
		
		if(r<maze.length-1) {
			mazeAllPath(p+"D",maze,r+1,c);// here r+1, c+1
		}if(c<maze[0].length-1) {
			mazeAllPath(p+"R",maze,r,c+1);//c+1
		}if(r>0) {
		    mazeAllPath(p+"U",maze,r-1,c);
		}if(c>0) {
			mazeAllPath(p+"L", maze, r, c-1);
		}
		
		maze[r][c]=true;
		
	}
	
	static void mazeMatrixPath(String p, boolean maze[][], int r, int c, int path[][],int steps) {
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			path[r][c]=steps;//start from 0,0
			 System.out.println(p);
			 for(int[] arr:path ) {
				 System.out.println(Arrays.toString(arr));
}
			 return;
			}
			
			if(maze[r][c]==false) {
				//(!maze[r][c])
				return;
			}
			maze[r][c]=false;
			path[r][c]=steps
					;
			
			if(r<maze.length-1) {
				mazeMatrixPath(p+"D", maze, r+1, c, path, steps+1);// here r+1, c+1
			}if(c<maze[0].length-1) {
				mazeMatrixPath(p+"R", maze, r, c+1, path, steps+1);//c+1
			}if(r>0) {
			    mazeMatrixPath(p+"L", maze, r-1, c, path, steps+1);
			}if(c>0) {
				mazeMatrixPath(p+"U", maze, r, c-1, path, steps+1);
			}
			
			maze[r][c]=true;
			path[r][c]=0;
	}

}
