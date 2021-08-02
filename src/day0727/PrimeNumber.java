package day0727;

public class PrimeNumber {

	public static void main(String[] args) {
		// 2 ~ 10000까지 모든 소수를 구하는 프로그램
        for(int i=2; i<=10000; i++) 
        {
        	int j;
            for(j=2; j<i; j++)
            {
                 if(i%j==0) break;    
            }
            // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
            // 위 for문 if문에 걸리지 않으면 소수 판정
            if(j==i) System.out.println(i);
        }
	}
}
