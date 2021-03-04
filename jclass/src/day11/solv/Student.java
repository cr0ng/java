package day11.solv;

public class Student {
	private String name, id, mail, tel;
	private char gen;
	
	// 데이터 셋팅, 꺼내는 함수들...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	// 출력용 함수
	public String toString() {
		return "이름 : "+ name +", 아이디 : "+ id +", 메일 : " + mail +
				  ", 휴대폰 : "+ tel +", 성별 : " + ((gen == 'M')? "남자" : "여자"); 
	}
}