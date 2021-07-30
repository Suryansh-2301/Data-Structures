package recursion;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stubw
		toh(5,'A','C','B');
	}

	private static void toh(int n, char src, char destination, char helper) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		toh(n-1,src,helper,destination);
		System.out.println("Moved from "+src+" to "+destination);
		toh(n-1,helper,destination,src);
		
	}

}
