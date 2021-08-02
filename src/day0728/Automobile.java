package day0728;

public class Automobile {

	public static void main(String[] args) {
		Car avante = new Car("red", "AVANTE", 240, 0, 5, 4);
		
		System.out.println(avante);
		
		avante.dailyRun.add(23);
		avante.dailyRun.add(89);
		avante.dailyRun.add(120);
		
		for(int run:avante.dailyRun) {
			System.out.println(run);
		}
	}

}
