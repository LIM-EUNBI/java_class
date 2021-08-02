package day0727;
import java.util.Scanner;

public class Cho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	      Scanner s = new Scanner(System.in);
//	      String str= s.nextLine();
//	      while(!str.equals("x")) {
//	         if(str.equals("m")) {
//	         System.out.println("메뉴리스트");
//	         } else if(str.equals("o")){
//	            System.out.println("주문");
//	         } else if(str.equals("s")){
//	            System.out.println("매출현황");
//	         } else if(str.equals("x")) {
//	            break;
//	         }
//	         str= s.nextLine();
//	      }
//	      System.out.println("파일종료");
//		int n =4;
//		for(int i=1;i<=n; i++) {
//		    if (i%2 == 1) {
//		       for (int j=1; j<=n; j++) {
//		          System.out.print(j + (i-1)*n + " ");
//		       }
//		    }
//		    else if(i%2 ==0) {
//		       for(int j=n; j>0; j--) {
//		          System.out.print(j + (i-1)*n + " ");
//		       }
//		    }
//		    System.out.println();
//		}
		int num1 = 0;
	      int num2 = 1;
	      int sum =0;
	      

	      for(int i=1; i<=10000; i++) {
	          
	          sum=num1+num2;
	          if(sum<=10000) {         
	             System.out.println(sum);
	             num1 = num2;
	             num2 = sum;
	          }
		   }
	      
	      
	}
	}

