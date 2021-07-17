package linked_list;

public class midPointOfLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		
		int ans = mid(head).data;
		System.out.println(ans);
	}
	public static Node<Integer> mid(Node<Integer> head) {
		Node<Integer> fast =  head;
		Node<Integer> slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			//for returning the second middle element in case of even number of elements
			slow = slow.next;
			//for returning the first middle element in case of even number of elements
//			if(fast != null) {
//				slow = slow.next;
//			}
		}
		return slow;
	}

}
