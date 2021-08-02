package day0728;
import java.util.ArrayList;

public class Car {
	String color;
	String modelName;
	//String fuleType; //gasoline/ electricity/ LPG/ Hybried
	int maxSpeed;
	int speed;
	int guest;
	int wheel;
	//int fuel;
	ArrayList<Integer> dailyRun;
	
	Car(String color, String modelName, int maxSpeed, int speed, int guest, int wheel){
		this.color = color;
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.guest = guest;
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [색상=" + color + ", 모델=" + modelName + ", 최대 속도=" + maxSpeed + ", 현재 속도=" + speed
				+ ", 좌석=" + guest + ", 휠 갯수=" + wheel + "]";
	}
	
}
