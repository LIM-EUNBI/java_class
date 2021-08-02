package day0727;
import java.util.Scanner;

public class CommonMultiple {

	public static void main(String[] args) {
		// 최대공약수 최소공배수 구하기
		Scanner sc = new Scanner(System.in);
		int gcd=0, lcm=0; //최대공약수, 최소공배수
	
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = sc.nextInt();
		
		int num3 = (num1<num2)?num1:num2; //i의 범위를 지정하기 위한 약수
		
		for(int i=1; i<=num3; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
			lcm=(num1*num2)/gcd;
	}
		System.out.println("최대공약수: "+gcd);
		System.out.println("최소공배수: "+lcm);
		
		//1~100까지의 합
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}