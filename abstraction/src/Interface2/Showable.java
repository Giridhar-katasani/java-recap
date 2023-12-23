package Interface2;

public interface Showable {
	
	public static final int dailyTime = 6;
	
	static void show() {
		System.out.println("showing");
	}
	
	public void showStartTime();
	
	public void showEndTime();
	
}
