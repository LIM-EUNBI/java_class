package day0727;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 팩토리얼 구하기
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int result=1;
		
		for(int i=1; i<=f; i++) {
			result *= i;
		}
		System.out.println(result);
	}
}
