package Interface2;

public class Execution {

	public static void main(String[] args) {
		Computer dell = new Computer();
		
		System.out.println(dell.dailyTime);
		System.out.println(dell.maxPages);
		
		dell.showEndTime();
		dell.on();
		dell.off();
		dell.showStartTime();
		
		Processer p = new Computer();
		
		System.out.println(p.dailyTime);
		System.out.println(p.maxPages);
		
		p.off();
		p.on();
		p.showEndTime();
		p.showStartTime();
	}

}
