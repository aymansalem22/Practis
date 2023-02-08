package tasks_exam;

public class Task1 {
	public static void main(String[] args) {
		int n=4;
		System.out.print(n);
		if(is_ugly(n)) {
			System.out.print(" "+"YES\n");
		}
		else {
			System.out.print(" "+"NO\n");
		}
		
	}
	public static Boolean is_ugly(int n) {
		while(n%2==0) {
			n/=2;
		}
		while(n%3==0) {
			n/=3;	
			}
		while(n%5==0) {
			n/=5;
		}
		return n==1;
	}
	}

