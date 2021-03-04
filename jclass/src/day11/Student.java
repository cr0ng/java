package day11;

public class Student {
	private String name, id, mail, tel;
	private char gen;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", mail=" + mail + ", tel=" + tel + ", gen=" + gen ;
	}
	
}
