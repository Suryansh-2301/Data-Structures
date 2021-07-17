package linked_list;

class NodeDouble{
	Node<Integer> head;
	Node<Integer> tail;
	NodeDouble(Node<Integer> head,Node<Integer> ail){
		this.head = head;
		this.tail = tail;
	}
	NodeDouble(){
		
	}
}

public class printReverseLLUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput.takeInput();
		
		//reverse(head);
		
		//head = reverseR(head);
		NodeDouble ans = reverseRBetter(head);
		linkedListUse.print(ans.head);

	}
	
	//without returning any parameter
	public static void reverse(Node<Integer> head){
		if(head == null) {
			return;
		}
		reverse(head.next);
		System.out.print(head.data + " ");
	}
	
	//with parameter return and complexity is )(n^2)
	public static Node<Integer> reverseR(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node<Integer> smallhead = reverseR(head.next);
		Node<Integer> tail = smallhead;
		
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallhead;
	}
	//complexity is O(n)
	public static NodeDouble reverseRBetter(Node<Integer> head){
		NodeDouble ans;
		if(head == null || head.next == null){
			ans = new NodeDouble();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		//this doublenode will have both head and tail of reverse LL
		NodeDouble smallAns = reverseRBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new NodeDouble();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}

}
