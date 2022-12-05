package P1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPrac  {
	
public static void main(String[] args) {
 LinkedList<Integer> linkedList=new LinkedList<>();
 linkedList.add(1);
 linkedList.add(2);
 linkedList.addLast(3);
 System.out.println(linkedList);
 linkedList.addFirst(10);
 System.out.println(linkedList);
 linkedList.add(2,20);
 System.out.println(linkedList);
 List<Integer> list=new ArrayList<>();
 list.add(101);
 list.add(102);
 list.add(103);
 linkedList.addAll(3,list);
 System.out.println(linkedList);
 //Fetch an element at a particular index using the get(int index) method
 System.out.println(list.get(2));
 //Remove the last element using the removeLast() method
 linkedList.removeLast();
 System.out.println(linkedList);
 //Sort a LinkedList using the sort() method
 linkedList.sort(Comparator.reverseOrder());
 System.out.println(linkedList);
 
}
}



















