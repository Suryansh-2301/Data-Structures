 package linked_list;

import java.util.*;

public class deleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput.takeInput();
		Scanner s = new Scanner(System.in);
		int pos = s.nextInt();
		//delete(head,pos);
		deleteRecursively(head,pos);
		linkedListUse.print(head);
		
	}

	private static Node<Integer> delete(Node<Integer> head, int pos) {
		// TODO Auto-generated method stub
		Node<Integer> temp = head;
		Node<Integer> prev = null;
		if(pos == 0) {
			head = head.next;
			return head;
		}
		int i=0;
		while(temp != null) {
			if(i == pos) {
				prev.next = temp.next;
				break;
			}
			prev = temp;
			temp = temp.next;
			i++;
		}
		return head;
	}
	
	private static Node<Integer> deleteRecursively(Node<Integer> head,int pos){
		if(head == null) {
			return head;
		}
		
		if(pos == 0) {
			return head.next;
		}else {
			head.next = deleteRecursively(head.next,pos-1);
			return head;
		}
		
	}

}
