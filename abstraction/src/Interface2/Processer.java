package Interface2;

public abstract class Processer implements Printable, Showable{
	
	public void on() {
		System.out.println("Printable is on from processor");
	}
	
	@Override
	public void showStartTime() {
		System.out.println("Showable is Started by processor");
	}
}
