package limeunbi;

public class MainFile {

	public static void main(String[] args) {
		// 학생 클래스로 인스턴스 변수 s1을 만든다.
		// s1안의 필드들에 적당한 값을 넣는다.
		// s1안의 필드들의 값을 화면에 출력
		Student s1 = new Student("임은비", 4, 9, 21, "19930101", "female", "010-8075-3708");
		Student s2 = new Student("홍길동", 4, 9, 21, "20001011", "male", "010-5555-2454");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("");
		
		CellPhone p1 = new CellPhone("삼성", "갤럭시 S21", "2021-01-29", 128, "1,280,000", "Y");
		CellPhone p2 = new CellPhone("아이폰", "아이폰 12pro", "2020-10-30", 256, "1,590,000", "N");
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
