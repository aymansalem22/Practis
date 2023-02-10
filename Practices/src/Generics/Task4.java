package Generics;

public class Task4 {
public static <T extends Comparable<T>> T minimu(T a,T b) {
	if(a.compareTo(b)<0)
		return a;
	
	else 
		return b;
}
public static void main(String[] args) {
	System.out.println(minimu(1, 2));
	System.out.println(minimu(2.9, 11.1));
	System.out.println(minimu('a', 'b'));
	
}
}
