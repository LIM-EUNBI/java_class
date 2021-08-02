package day0727;
public class Snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1; n<101; n++) {
			if(n%2==1) {
				System.out.println(n);
			}
		}
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
			System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		
		int n=6;
		int number=1;
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				for(int j=0; j<n; j++) {
					System.out.print(number++ + " ");
				}
			}else{
				number += n;
				for(int j=0; j<n; j++) {
					System.out.print(--number + " ");
				}
				number += n;
			}
			System.out.println();
		}
	}
}


