package linked_list;

public class eliminateDuplicatesFromLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput.takeInput();
		Node<Integer> ans = eliminate(head);
		linkedListUse.print(ans);
		

	}
	
	public static Node<Integer> eliminate(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp!=null && temp.next!=null) {
			if(temp.data.equals(temp.next.data)) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		
		return head;
	}

}
