package linkedList;
import java.util.*;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Node<Integer> head= null;
		Node<Integer> tail= null;
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> currNode = new Node<Integer>(data);
			if(head == null) {
				head = currNode;
				tail = currNode;
			}else {
				tail.next = currNode;
				tail = currNode;
			}
			data = s.nextInt();
		}
		printLL(head);
		System.out.println();
		
		//insertion
//		insertLL(head,4,88);
//		printLL(head);
//		System.out.println("Insertion");
//		//deletion\
//		deleteLL(head,4);
//		printLL(head);
//		System.out.println("Deletion");
//		//reverse
//		Node<Integer> ans = reverseLL(head); 
//		printLL(ans);
//		System.out.println("Revrese");
		//ReverseRecursively
		Node<Integer> answer = reverserecLL(head);
		printLL(answer);
		System.out.println("Reverse Recursively");
	}

	private static Node<Integer> reverserecLL(Node<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> newHead = reverserecLL(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	private static Node<Integer> reverseLL(Node<Integer> head) {
		// TODO Auto-generated method stub
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			
			//we will now iterate forward
			prev = curr;
			curr = next;
					
		}
		return prev;
	}

	private static Node insertLL(Node<Integer> head, int pos, int ele) {
		// TODO Auto-generated method stub
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(ele);
			newNode.next = head;
			return newNode;
		}
		
		Node<Integer> smallHead = insertLL(head.next,pos-1,ele);
		head.next = smallHead;
		return head;
		
		
	}

	private static Node deleteLL(Node<Integer> head, int pos) {
		// TODO Auto-generated method stub
		if(pos<1) {
			return head;
		}
		if(head == null) {
			return null;
		}
		if(pos == 1) {
			return head.next;
		}
		head.next = deleteLL(head.next,pos-1);
		return head;
	}

	private static void printLL(Node<Integer> head) {
		// TODO Auto-generated method stub
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}

}
class Node<T>{
	Node<T> next;
	T data;
	Node(T data){
		this.data = data;
		next = null;
	}
}
