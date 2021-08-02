package limeunbi;

public class CellPhone {
	String company; // 제조사
	String model; // 모델
	String rDate; // 출시일
	int memory ; // 용량
	String price; //가격
	String payFun; // 페이기능 여부
	
	CellPhone(String company, String model, String rDate, int memory, String price, String payFun){
		this.company = company;
		this.model = model;
		this.rDate = rDate;
		this.memory = memory;
		this.price = price;
		this.payFun = payFun;
	}

	@Override
	public String toString() {
		return "제조사=" + company + ", 모델명=" + model + ", 출시일=" + rDate + ", memory=" + memory
				+ ", 가격=" + price + ", 페이기능=" + payFun;
	}
	
	
}
