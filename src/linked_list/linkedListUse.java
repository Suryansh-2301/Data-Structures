package linked_list;
import java.util.*;

public class linkedListUse {
    public static void main(String[] args){
        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1.data);
        Node<Integer> head = takeInput.takeInput();//createLinkedList();
        //System.out.println(head.data);
        print(head);
    }

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    
    public static void print(Node<Integer> head) {
    	while(head != null) {
    		System.out.println(head.data);
    		head = head.next;
    	}
    }
    
    
    //Complexity is On^2
//    public static Node<Integer> takeInput(){
//    	Scanner s = new Scanner(System.in);
//    	int data = s.nextInt();
//    	Node<Integer> head = null;
//    	while(data != -1) {
//    		Node<Integer> currNode = new Node<Integer>(data);
//    		if(head == null) {
//    			//make this node as head
//    			head = currNode;
//    		}else {
//    			Node<Integer> tail = head;
//    			//due to while loop complexity becomes On^2
//    			while(tail.next != null){
//    				tail = tail.next;
//    			}
//    			//Now tail will refer to last node
//    			//connect current node after last node
//    			tail.next = currNode;
//    		}
//     		data = s.nextInt();
//    	}
//    	return head;
//    }
    
    //complexity is O(1)

}
