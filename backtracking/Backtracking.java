package backtracking;

import java.util.*;

public class Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze = {
				{true, true, true},
				{true, true, true},
				{true, true, true},
		};
		int[][] path = new int[maze.length][maze[0].length];
		allPathsPrint("", maze, 0, 0, path, 1);

	}
	
	static void allPaths(String p, boolean[][] maze, int row, int col) {
		
		if (row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if (!maze[row][col]) return;
		
		// i have used this path so make it false
		maze[row][col] = false;
		
		//for down
		if (row < maze.length-1) 
			allPaths(p+"D", maze, row+1, col);
		
		//for right
		if (col < maze[0].length-1)
			allPaths(p+"R", maze, row, col+1);
		
		//for up
		if (row > 0)
			allPaths(p+"U", maze, row-1, col);
		
		//for left
		if (col > 0)
			allPaths(p+"L", maze, row, col-1);
		
		//while going back, make the current block true
		maze[row][col] = true;
	}
	
	static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
		
		if (r == maze.length-1 && c == maze[0].length-1) {
			path[r][c] = step;
			for (int[] n: path) {
				System.out.println(Arrays.toString(n));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		
		if (!maze[r][c]) return;
		
		maze[r][c] = false;
		path[r][c] = step;
		
		if (r < maze.length-1)
			allPathsPrint(p+"D", maze, r+1, c, path, step+1);
		
		if (c < maze[0].length-1)
			allPathsPrint(p+"R", maze, r, c+1, path, step+1);
		
		if (r > 0)
			allPathsPrint(p+"U", maze, r-1, c, path, step+1);
		
		if (c > 0)
			allPathsPrint(p+"L", maze, r, c-1, path, step+1);
		
		maze[r][c] = true;
		path[r][c] = 0;
	}
	
	
	

}
