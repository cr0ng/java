package day11.ex;

public class Person {
	String name, phone, birth;
	char gender;
	
	public String getname() {
		return name;
	}
	
	public String getphone() {
		return phone;
	}
	
	public String getbirth() {
		return birth;
	}
	
	public char getgender() {
		return gender;
	}
	
	public void toPrint() {
		System.out.printf("이름 : %s , 전화번호 : %s , 생일 : %s , 성별 : %c",name,phone,birth,gender);
	}
}
