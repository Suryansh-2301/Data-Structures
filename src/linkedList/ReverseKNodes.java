package linkedList;
import java.util.*;

public class ReverseKNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		int k = s.nextInt();
		Node<Integer> temp = reverseK(head,k);
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	private static Node<Integer> reverseK(Node<Integer> head, int k) {
		// TODO Auto-generated method stub
		if(head == null) {
			return null;
		}
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next = null;
		int count = 0;
		while(curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
			
			count++;
		}
		if(next != null) {
			head.next = reverseK(next,k);
		}
		return prev;
	}

}
//class Node<T>{
//	Node<T> next;
//	T data;
//	Node(T data){
//		this.data = data;
//		next = null;
//	}
//}
