package day0729;
import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() { //초기화
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	
	void addName(String name) {
		alName.add(name);
	}
	void addPrice(int price) {
		alPrice.add(price);
	}
	void showMenu() {
		//alName, alPrice 출력
		for(int i=0; i<alName.size(); i++) {
			System.out.println(alName.get(i)+ "\n   ▶ " + alPrice.get(i));
		}
	}
	
}
