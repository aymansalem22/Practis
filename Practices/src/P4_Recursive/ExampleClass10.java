package P4_Recursive;

//Reversed Linked List
public class ExampleClass10 {

	public static void main(String[] args) {
		Node head = null;

		head = insertAtHead(head, 5);
		head = insertAtHead(head, 4);
		head = insertAtHead(head, 3);
		head = insertAtHead(head, 2);
		head = insertAtHead(head, 1);

		
		System.out.println("Linked List: ");
		for (Node i = head; i != null; i = i.next) {
			System.out.print(i.value + " ");
		}

		
		System.out.println(" ");
		System.out.println("Reversed Linked List: ");
		reverse(head);

	}

	static class Node {
		int value;
		Node next;
	};

	public static void reverse(Node head) {
		// Base case
		if (head == null) {
			return;
		}

		// Recursive case
		else {
			reverse(head.next);
			System.out.print(head.value + " ");
		}
	}

	static Node insertAtHead(Node temp_head, int new_value) {
		Node new_Node = new Node();
		new_Node.value = new_value;
		new_Node.next = (temp_head);
		(temp_head) = new_Node;

		return temp_head;
	}
}
