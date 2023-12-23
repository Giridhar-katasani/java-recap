package ControlFlows;

public class SwitchClasss {
	public static void main(String[] args) {
		int x = 8;
		// cannot be switched on float type
		//	can be on int, string, enum
		switch (x) {
			case 1:
				System.out.println("print value: 1");
				break;
			case 2: 
				System.out.println("print value: 2");
				break;
			case 3:
				System.out.println("print 3");
				break;
			default:
				System.out.println("value executed");
				break;
		}
	}
}
