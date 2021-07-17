package linked_list;

import java.util.*;

public class checkPalindromeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		
		boolean ans = check(head);
		if(ans) {
			System.out.println("It's Palindrome");
		}else {
			System.out.println("It's not Palindrome");
		}
	}
	
	public static boolean check(Node<Integer> head) {
		Node<Integer> temp = head;
		Stack<Integer> st = new Stack<Integer>();
		while(temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp != null) {
			if(temp.data != st.pop()) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}

}
