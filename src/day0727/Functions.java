package day0727;

public class Functions {
	public static void show(int i) {
		//show 함수 선언
		for(int j=1; j<10; j++) {
			System.out.println(i + "x" + j + "=" + i*j);
		}
	}
	
	public static void main(String[] args) {
		// 함수 호출
		for(int i=2; i<10; i++) {
			show(i);
			System.out.println("");
		}
		
	}

}
