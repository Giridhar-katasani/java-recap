package Interface2;

public interface Printable {
	
	public static final int maxPages = 100;
	
	static void print() {
		System.out.println();
	}
	
	public void on();
	
	public void off();
}
