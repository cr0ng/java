package day22;
/*
 * 	����ȭ�� �Ǳ� ���ؼ���
 *  �ش� Ŭ������ �ݵ�� ����ȭ ���� Ŭ�������� �Ѵ�.
 *  	��� ]
 *  		implements Serializable
 *  		�� ���ָ� �ȴ�.
 */
import java.io.*;

public class MyData implements Serializable {
	private String name, tel, addr, mail;
	private int age;
	private char gen;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "name=" + name + ", tel=" + tel +", mail=" + mail + ", addr=" + addr + ", age=" + age + ", gen=" + gen
				+ ", height=" + height;
	}
	
	@Override
	public boolean equals(Object o) {
		return name.equals(((MyData)o).getName()) && age == ((MyData)o.get)
	}


}
