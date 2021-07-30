package recursion;

public class AllPossiblePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("ABCD","");

	}
	static void permutation(String s,String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<s.length();i++) {
			char fix = s.charAt(i);
			String ros = s.substring(0,i) + s.substring(i+1);
			
			permutation(ros,ans+fix);
		}
	}

}
