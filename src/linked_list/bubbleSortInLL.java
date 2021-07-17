package linked_list;

public class bubbleSortInLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		Node<Integer> ans = sort(head);
		linkedListUse.print(ans);
	}

	private static Node<Integer> sort(Node<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null||head.next == null) {
			return head;
		}
		Node<Integer> t1 = head;
		Node<Integer> t2 = head;
		while(t1 != null) {
			t2 = t1.next;
			while(t2 != null) {
				if(t1.data>t2.data) {
					int temp = t1.data;
					t1.data = t2.data;
					t2.data = temp;
				}
				t2 = t2.next;
			}
			t1 = t1.next;
		}
		return head;
	}

}
