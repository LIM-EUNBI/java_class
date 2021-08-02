package day0729;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.init();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String mName = sc.nextLine();
		
		while(!mName.equals("")) {
			int mPrice = sc1.nextInt();
			menu.addName(mName);
			menu.addPrice(mPrice);
			mName = sc.nextLine();
		}
		menu.showMenu();
		
		sc.close();
		sc1.close();

	}
}
