package linked_list;

import java.util.*;

public class findNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int ans = find(head,n);
		if(ans == -1) {
			System.out.println("Node not found");
		}else {
			System.out.println("Node found at position: " + ans);
		}
	}
	public static int find(Node<Integer> head, int n) {
		Node<Integer> temp = head;
		int i = 0;
		while(temp != null) {
			if(temp.data == n) {
				return i;
			}
			i++;
			temp = temp.next;
		}
		return -1;
	}

}
