//Put n items with given weight and value in a 
//knapsack of capacity W to get the maximum 
//total value in the knapsack

package recursion;

public class KnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[] = {10,20,30};
		int val[] = {100,50,150};
		int W = 50;
		int n = 3;
		System.out.println(knapsack(val,wt,n,W));
		}

	private static int knapsack(int[] val, int[] wt, int n, int W) {
		// TODO Auto-generated method stub
		if(n == 0 || W == 0) {
			return 0;
		}
		if(wt[n-1] > W) {
			return knapsack(val,wt,n-1,W);
		}
		
		
		return Math.max(knapsack(val,wt,n-1,W-wt[n-1])+val[n-1], knapsack(val,wt,n-1,W));
	}

	}


