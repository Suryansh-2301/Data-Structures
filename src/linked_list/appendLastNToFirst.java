package linked_list;

import java.util.*;

public class appendLastNToFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		linkedListUse.print(append(head,n));
		
	}
	
	public static Node<Integer> append(Node<Integer> head, int k){
		Node<Integer> temp = head;
		int len = 0;
		while(temp != null) {
			len++;
			temp = temp.next;
		}
		
		Node<Integer> tail = head,newTail=null,newHead=null;
		int c = 1;
		
		while(tail.next != null) {
			if(c == len-k) {
				newTail = tail;
			}
			if(c == len-k+1) {
				newHead = tail;
			}
			tail = tail.next;
			c++;
		}
		newTail.next = null;
		tail.next = head;
		
	    return newHead;
	}

}
