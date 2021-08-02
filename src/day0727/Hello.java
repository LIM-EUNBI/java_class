package day0727;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("임은비");
//		System.out.println("010-8075-3708");
//		System.out.println("01.01");		
//		
//		int num = 5;
//		System.out.println(num + " x 1 = " + num*1);
//		System.out.println(num + " x 2 = " + num*2);
//		System.out.println(num + " x 3 = " + num*3);
//		System.out.println(num + " x 4 = " + num*4);
//		System.out.println(num + " x 5 = " + num*5);
//		System.out.println(num + " x 6 = " + num*6);
//		System.out.println(num + " x 7 = " + num*7);
//		System.out.println(num + " x 8 = " + num*8);
//		System.out.println(num + " x 9 = " + num*9);
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(str);
		
		// 문자열을 콘솔에서 읽어들인다.
		// 그 문자열이 자기 이름의 이니셜과 같으면
		// 자기이름 전체를 출력

		 Scanner sc = new Scanner(System.in); 
//		 String str = sc.nextLine();
//		 
//		 if(str.equals("a") || str.equals("A")) {
//			 System.out.println("Apple");
//		 } else if(str.equals("b") || str.equals("B")) {
//			 System.out.println("Banana");
//		 }else if(str.equals("w") || str.equals("W")) {
//			 System.out.println("Watermelon");
//		 }else if(str.equals("s") || str.equals("S")) {
//			 System.out.println("Strawberry");
//		 }else {
//			 System.out.println("모르는 이니셜");
//		 }
//		 System.out.println("프로그램 종료");
//		 
//		 int n = sc.nextInt();
//		 int x = (n==1)?10:100;
		 
//		 int num = sc.nextInt();
//		 
//		 if(num > 89) System.out.println("A");
//		 else if(num > 79) System.out.println("B");
//		 else if(num > 69) System.out.println("C");
//		 else if(num > 59) System.out.println("D");
//		 else System.out.println("F");
//		 
//		 num = num / 10;
//		 
//		 switch(num) {
//		 	case 9:
//		 		System.out.println("A");
//		 		break;
//		 	case 8:
//		 		System.out.println("B");
//		 		break;
//		 	case 7:
//		 		System.out.println("C");
//		 		break;
//		 	case 6:
//		 		System.out.println("D");
//		 		break;
//		 	default:
//		 		System.out.println("F");
//		 		break;
//		 }
//		 int n = 1;
//		 while(n<101) {
//			 if(n%5==0) {
//				 System.out.println(n);
//			 }
//			 n++;
//		 }
		 
		 // 사용자 입력을 받는다.
		 // 입력값이 'x'이면 프로그램 종료를 출력하고 프로그램 종료
		 // 입력값이 'm'이면 "메뉴리스트"를 출력, 'o'이면 "주문"을 출력, 's'이면 "매출현황"을 출력
		 // 1로 돌아간다.
		 boolean sys = true;
		 do {
			 String ch = sc.nextLine();
			 switch(ch) {
			 	case "x":
			 		System.out.println("프로그램 종료");
			 		sys = false;
			 		break;
			 	case "m":
			 		System.out.println("메뉴리스트");
			 		break;
			 	case "o":
			 		System.out.println("주문");
			 		break;
			 	case "s":
			 		System.out.println("매출현황");
			 		break;
			 }
		 }while(sys);
		 
		 
	}
}
