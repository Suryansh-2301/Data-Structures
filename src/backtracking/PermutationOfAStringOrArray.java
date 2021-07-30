package backtracking;
import java.util.*;

public class PermutationOfAStringOrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		
		permute(a);
	}

	private static void permute(int[] a) {
		// TODO Auto-generated method stub
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		
		boolean[] freq = new boolean[a.length];
		
//		recPermute(a,ds,ans,freq);
		recPermute1(0,a,ans);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		
	}

	private static void recPermute1(int index, int[] a, List<List<Integer>> ans) {
		// TODO Auto-generated method stub
		if(index == a.length) {
			List<Integer> ds = new ArrayList<>();
			
			for(int j=0;j<a.length;j++) {
				ds.add(a[j]);
			}
			ans.add(new ArrayList(ds));
			return;
		}
		for(int j=0;j<a.length;j++) {
			swap(j,index,a);
			recPermute1(index+1,a,ans);
			swap(j,index,a);
		}
		
	}

	private static void swap(int j, int i, int[] a) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		
	}

	

	//Time Complexity is n!*n
	//Space Complexity is 
//	private static void recPermute(int[] a, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
//		// TODO Auto-generated method stub
//		if(ds.size() == a.length) {
//			ans.add(new ArrayList<>(ds));
//			return;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			if(!freq[i]) {
//				freq[i] = true;
//				ds.add(a[i]);
//				recPermute(a,ds,ans,freq);
//				ds.remove(ds.size() - 1);
//				freq[i] = false;
//			}
//		}
//		
//	}

}
