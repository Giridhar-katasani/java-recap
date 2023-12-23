package quiz;

public class Main {

	public void test(long b) {
		System.out.println("long b");
	}
	
	public void test(int b) {
		System.out.println("int b");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main e = new Main();
		e.test(9*10000000000l);
	}

}

//public class Main {
//public int a;
//public long b;
//public void test(long  b)
//{
//System.out.println("long b");
//}
//public void test(int a)
//{
//System.out.println("int a");
//}
//public static void main(String[] args) {
//       
//        Main e=new Main();
//        e.test(9*1000000000);
//       
// 
//    }
// 
//}
