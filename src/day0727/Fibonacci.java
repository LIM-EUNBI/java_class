package day0727;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int newNum = 0;
//		int preNum = 1;
//		int nextNum = 0;
//
//		while((newNum+preNum)<10000) {
//			nextNum = newNum + preNum;
//			newNum = preNum;
//			preNum = nextNum;
//			System.out.println(nextNum);
//		}
		
		int first = 0;
		int second = 1;
		int third = first+second;
		while(third<10000) {
			System.out.println(third);
			first = second;
			second = third;
			third = first+second;
		}
		
	}

}
