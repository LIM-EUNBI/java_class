package limeunbi;

public class Student {
	String name;
	int nyear;
	int nclass;
	int nNumber;
	String birthday; //yyyymmdd
	String gender; //male, female
	String phoneNum;
	
	Student(String name, int nyear, int nclass, int nNumber, String birthday, String gender, String phoneNum){
		this.name = name;
		this.nyear = nyear;
		this.nclass = nclass;
		this.nNumber = nNumber;
		this.birthday = birthday; //yyyymmdd
		this.gender = gender; //male, female
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "이름=" + name + ", 학년=" + nyear + ", 반=" + nclass + ", 학번=" + nNumber
				+ ", 생일=" + birthday + ", 성별=" + gender + ", 전화번호=" + phoneNum;
	}
	
	
	
	
}
