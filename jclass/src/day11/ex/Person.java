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
		System.out.printf("�̸� : %s , ��ȭ��ȣ : %s , ���� : %s , ���� : %c",name,phone,birth,gender);
	}
}
