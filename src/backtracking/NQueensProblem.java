package backtracking;

public class NQueensProblem {

	static int arr[][] = { { 0, 0, 0, 0 }, 
            { 0, 0, 0, 0 }, 
            { 0, 0, 0, 0 }, 
            { 0, 0, 0, 0 } };
	static int n = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		solve();

	}
	private static boolean solve() {
		// TODO Auto-generated method stub
		if(nqueen(0) == false) {
			System.out.println("Queens can't be placed");
			return false;
		}
		print(arr);
		return true;
	}
	private static void print(int[][] arr2) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static boolean nqueen( int col) {
		// TODO Auto-generated method stub
		if(col == n) {
			return true;
		}
		for(int i=0;i<n;i++) {
			if(isSafe(i,col)) {
				arr[i][col] = 1;
				if(nqueen(col+1) == true) {
					return true;
				}
				arr[i][col] = 0;
			}
		}
		return false;
	}
	static boolean isSafe(int row, int col) 
    { 
        int i, j; 
  
        for (i = 0; i < col; i++) 
            if (arr[row][i] == 1) 
                return false; 
  
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (arr[i][j] == 1) 
                return false; 
  
        for (i = row, j = col; j >= 0 && i < n; i++, j--) 
            if (arr[i][j] == 1) 
                return false; 
  
        return true; 
    } 
	
	
}
