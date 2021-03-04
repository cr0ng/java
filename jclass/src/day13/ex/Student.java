package day13.ex;
/*
 	이 클래스는 학생 한명의 이름, 반, 번호,
 		국어, 영어, 수학, 총점
 	을 기억할 클래스
 */
public class Student {
	/*
	// 내 코드
	private String name;
	private int ban, no, kor, eng, math, total;
	
	public Student() {
		kor = (int)(Math.random()*(100-50+1)+50);
		eng = (int)(Math.random()*(100-50+1)+50);
		math = (int)(Math.random()*(100-50+1)+50);
	}
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal(int k, int e, int m) {
		total = k + e + m;
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", total=" + total;
	}
	*/

	// 선생님 코드
	
	// 변수 선언
	private String name;
	private int ban, no, kor, eng, math, total;
	private double avg;
	
	// 생성자함수
	// 1. 기본생성자
	public Student() {}
	// 2. 이름, 반, 번호만 입력하는 생성자
	public Student(String irum, int b, int n) {
		name = irum;
		ban = b;
		no = n;
	}
	// 3. 2 + 과목점수
	public Student(String irum, int b, int n, int k, int e, int m) {
		/*
		name = irum;
		ban = b;
		no = n;
		*/
		this(irum,b,n);
		kor = k;
		eng = e;
		math = m;
		setTotal();
		setAvg();
	}
	// 4. 3 + 총점 + 평균
	public Student(String irum, int b, int n, int k, int e, int m,int t, double a) {
		/*
		name = irum;
		ban = b;
		no = n;
		*/
		this(irum,b,n);
		kor = k;
		eng = e;
		math = m;
		total = t;
		avg = a;
	}
	
	// 변수의 내용을 꺼내주는 함수들...
	public String getName() {
		return name;
	}
	
	public int getBan() {
		return ban;
	}
	
	public int getNo() {
		return no;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return total;
	}
	
	public double getAvg() {
		return avg;
	}
	
	// 변수의 내용을 셋팅해주는 함수들...
	
	public void setName(String n) {
		name = n;
	}
	
	public void setBan(int b) {
		ban = b;
	}
	
	public void setNo(int n) {
		no = n;
	}
	
	public void setKor(int k) {
		kor = k;
	}
	
	public void setEng(int e) {
		eng = e;
	}
	
	public void setMath(int m) {
		math= m;
	}
	
	public void setTotal(int t) {
		total = t;
	}
	
	public void setTotal() { // 오버로딩
		total = kor + eng + math;
	}
	
	public void setAvg(double a) {
		avg = a;
	}
	
	public void setAvg() {
		avg = total / 3.0;
	}
	
	//toString()
	public String toString() {
		return "이름 : "+name + ", 반 : "+ban+", 번호 : " + no + 
				", 국어 : " + kor + ", 영어 : "+eng+", 수학 : "+math+",총점  : "+total+", 평균 : " + Math.round(avg*100)/100.0;
				
	}
}
