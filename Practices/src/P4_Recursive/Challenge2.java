package P4_Recursive;

import java.util.LinkedList;

//code recursively
public class Challenge2 {
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.push(1);
		list.push(3);
		list.push(1);
		list.push(2);
		list.push(1);
		//System.out.println(lengthOfList(list));
	}

	public static int lengthOfList(Node head) {
		//Base case
		if(head==null)
		return 0;
		
		//Count is this node plus rest of the list
		return 1+lengthOfList(head);
	}
}


















