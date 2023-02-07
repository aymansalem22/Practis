package P4_Recursive;
import java.util.LinkedList;
import java.util.List;

//iterative code 
public class Challenge {
 //returns count of nodes in linked list
	public static void main(String[] args) {
		// start with the empty list
		LinkedList list=new LinkedList();
		list.push(1);
		list.push(3);
		list.push(1);
		list.push(2);
		list.push(1);
		
		//System.out.println("Count of nodes is = "+lengthOfList(list.head));

	}
	
	public static int lengthOfList(Node head) {
		int count=0;
		Node temp=head;
		while(temp !=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

}













































