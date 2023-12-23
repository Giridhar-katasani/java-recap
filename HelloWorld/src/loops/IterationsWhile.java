package loops;

public class IterationsWhile {

	public static void main(String[] args) {
		int start = 1;
		int end = 20;
		while(start < end) {
			int currentStart = 2;
			if(start > 2) {				
				currentStart = start - 1;
			}
			int factor = 0;
			while(currentStart < start) {				
				if(start%currentStart == 0) {
					factor++;
				}
				currentStart--;
				if(currentStart == 0) {
					break;
				}
			}
			if(factor < 2) {
				System.out.println(start);
			}
			start++;
			if(start >= end) {
				break;
			}
		}
	}
}
