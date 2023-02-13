package P4_Recursive;


//Search for a Value in a Linked List
public class ExampleClass11 {

	static class Node {
		int value;
		Node next;
	};

	static Node insertAtHead(Node temp_head, int new_value) {
		Node new_Node = new Node();
		new_Node.value = new_value;
		new_Node.next = (temp_head);
		(temp_head) = new_Node;

		return temp_head;
	}

	public static boolean search(Node head, int num) {
		// base case
		if (head == null) {
			return false;
		}

		// recursive case
		else {

			if (head.value == num) {
				return true;
			} else {
				return search(head.next, num);
			}

		}
	}

	public static void main(String[] args) {

		Node head = null;
		head = insertAtHead(head, 0);
		head = insertAtHead(head, 3);
		head = insertAtHead(head, 1);
		head = insertAtHead(head, 6);
		head = insertAtHead(head, 4);

		System.out.println("Linked List: ");
		for (Node i = head; i != null; i = i.next) {
			System.out.print(i.value + " ");
		}

		System.out.println(" ");
		int searchFor = 0;
		boolean result = search(head, searchFor);
		System.out.println("Is " + searchFor + " present in the list? : " + result);
	}

}
