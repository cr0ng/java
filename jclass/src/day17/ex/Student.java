package day17.ex;

public class Student {
	int no, java, db, web,jsp;
	String name;
	
	public Student() {

	}
	
	public Student(int no, String name, int java, int db, int web, int jsp) {
		setNo(no);
		setName(name);
		setJava(java);
		setDb(db);
		setWeb(web);
		setJsp(jsp);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "학번 : "+ no +", 이름 : " + name + ", java 점수 : " + java +", db 점수 : " + db +", web 점수 : " + web + ", jsp 점수 : " + jsp;
	}
	
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Student tmp = (Student) obj;
		
		bool = this.no == tmp.no;
		
		return bool;
	}

}
