package day0728;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// 정적배열과 동적배열
		int[] intArr = new int[5]; //정적배열
		ArrayList<String> fruits = new ArrayList<String>(); //동적배열
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("watermelon");
		//하나의 값 가져오기
//		System.out.println(fruits.get(0));
		
		//수정하기
		fruits.set(0, "peach");

		//삭제하기
		fruits.remove(0);
		
		//모든값 삭제하기
		//fruits.clear();
		
		//모든값 가져오기
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
	}
}
