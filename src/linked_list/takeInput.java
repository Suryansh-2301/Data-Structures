package linked_list;

import java.util.Scanner;

public class takeInput {
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data != -1) {
			Node<Integer> currNode = new Node<Integer>(data);
			if(head == null) {
				//make this node as head
				head = currNode;
				tail = currNode;
			}else {
				tail.next = currNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
}
