package linked_list;

import java.util.Scanner;

public class insertNodeInLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		
		Scanner s = new Scanner(System.in);
		int pos = s.nextInt();
		int ele = s.nextInt();
		
		//insertNode(head,pos,ele);
		
		insertNoderecursively(head,pos,ele);
		
		linkedListUse.print(head);

	}

	private static Node<Integer> insertNode(Node<Integer> head, int pos, int ele) {
		// TODO Auto-generated method stub
		Node<Integer> newNode = new Node<Integer>(ele);
		Node<Integer> prev = head;
		
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}else {
			int i = 0;
			while(i<pos && prev != null) {
				i++;
				prev = prev.next;
			}
			if(prev != null) {
				newNode.next = prev.next;
				prev.next = newNode;
			}
		}
		return head;
	}
	
	private static Node<Integer> insertNoderecursively(Node<Integer> head, int pos, int ele){
		if(head == null && pos > 0) {
			return head;
		}
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(ele);
			newNode.next = head;
			return newNode;
		}else {
			Node<Integer> smallerHead = insertNoderecursively(head.next,pos-1,ele);
			head.next = smallerHead;
		}
		return head;
	}

}
