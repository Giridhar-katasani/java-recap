package ControlFlows;

public class IfElseBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 5;
			a = a++;
			System.out.println(a);// 5
		
		a++;
		System.out.println(a); //6
		
		if(a == 6) {
			System.out.println("value of a is incremented");
		} else if(a == 5) {
			System.out.print("a value is not incremented");
		} else {
			System.out.println("nothing special");
		}
	}
}
