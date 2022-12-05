package P1;

import java.util.HashSet;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		 Set<Integer> set = new HashSet<>();
	        System.out.println("Inserting 17 in the HashSet:  " + set.add(17));
	        System.out.println("Inserting 34 in the HashSet:  " + set.add(34));
	        System.out.println("Inserting 17 in the HashSet:  " + set.add(17));
	        System.out.println(set);

	}

}
