package backtracking;

public class RatInAMaze {
	static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = { { 1, 0, 0, 0 }, 
                { 1, 1, 0, 1 }, 
                { 0, 1, 0, 0 }, 
                { 1, 1, 1, 1 } }; 

N = maze.length; 
solveMaze(maze);
	}

	private static boolean solveMaze(int[][] maze) {
		// TODO Auto-generated method stub
		int[][] sol = new int[N][N];
		
		if(solveMazeRec(maze,0,0,sol) == false) {
			System.out.println("Rat can't reach at the end");
			return false;
		}
		
		prinntMaze(sol);
		return true;
		
	}

	private static void prinntMaze(int[][] sol) {
		// TODO Auto-generated method stub
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static boolean solveMazeRec(int[][] maze, int i, int j, int[][] sol) {
		// TODO Auto-generated method stub
		if(i == N-1 && j == N-1 && maze[i][j] == 1) {
			sol[i][j] = 1;
			return true;
		}
		
		if(isSafe(maze,i,j) == true) {
			sol[i][j] = 1;
			if(solveMazeRec(maze,i+1,j,sol))
				return true;
			if(solveMazeRec(maze,i,j+1,sol))
				return true;
			sol[i][j] = 0;
		}
		return false;
	}

	private static boolean isSafe(int[][] maze, int i, int j) {
		// TODO Auto-generated method stub
		return (i<N && j<N && maze[i][j] == 1);
	} 

}
