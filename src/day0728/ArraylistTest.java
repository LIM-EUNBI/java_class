package day0728;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistTest {

	public static void main(String[] args) {
		// Scanner와 ArrayList를 이용해서 학생들의 수학점수 추가하기 및 총 합계와 평균 구하기
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> mathArr = new ArrayList<Integer>();
		
		boolean sys = true;
		int sum = 0;
		float avg = 0;
		
		//수학점수 읽어들이기
		while(sys) {
			System.out.println("수학점수를 입력해 주세요 : ");
			int math = sc.nextInt();
			if(math>0 && math<101) {
				mathArr.add(math);
			}else {
				sys = false;
			}
		}
		//총 합계 구하기
		for(int math:mathArr) {
			sum += math;
		}
		System.out.println("총 합계 : " + sum);
		//평균 구하기
		avg = sum / mathArr.size();
		System.out.println("총 평균 : " + avg);
		
		sc.close();
	}
}
