package backtracking;

import java.util.*;

public class MazeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(maze(3, 3));
		//System.out.println(path("", 3, 3));
		//System.out.println(pathDiagonal("", 3, 3));
		boolean[][] maze = {
				{true, true, true},
				{true, false, true},
				{true, true, true}
		};
		pathWithObstacles("", maze, 0, 0);


	}

	static int maze(int row, int col) {

		if (row == 1 || col == 1) return 1;

		return maze(row-1, col) + maze(row, col-1);
	}

	static List<String> path(String p, int row, int col){

		List<String> list = new ArrayList<>();
		if (row == 1 && col == 1) {
			list.add(p);
			return list;
		}

		if (row > 1)
			list.addAll(path(p+"D", row-1, col));

		if (col > 1)
			list.addAll(path(p+"R", row, col-1));

		return list;
	}

	static List<String> pathDiagonal(String p, int row, int col){

		List<String> list = new ArrayList<>();
		if (row == 1 && col == 1) {
			list.add(p);
			return list;
		}

		// for vertical
		if (row > 1)
			list.addAll(pathDiagonal(p+"V", row-1, col));

		//for diagonal
		if (row > 1 && col > 1) {
			list.addAll(pathDiagonal(p+"D", row-1, col-1));
		}

		//for horizontal
		if (col > 1)
			list.addAll(pathDiagonal(p+"H", row, col-1));

		return list;
	}

	static void pathWithObstacles(String p, boolean maze[][], int row, int col){

		if (row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if (!maze[row][col]) return;

		if (row < maze.length-1) {
			pathWithObstacles(p+"D", maze, row+1, col);
		}

		if (col < maze[0].length-1) 
			pathWithObstacles(p+"R", maze, row, col+1);
	}

}
