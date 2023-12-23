package loops;

public class Iterations {
	public static void main(String[] args) {
		// print all the even numbers
		printEvenNumbers(100);
	}
	
	public static void printEvenNumbers(int n) {
		for(int i = 0; i < n; i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
	}

}
