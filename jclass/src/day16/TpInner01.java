package day16;

public class TpInner01 {
	int num = 100;
	void abc() {
		System.out.println("TpInner01.num : " + 100);
	}
	
	class GInner{	// 전역 내부 클래스
		public GInner() {
			int no1 = 50;
			System.out.println("여기는 GInner()");
		}
	}
	
	static class TPCLs{	// 탑레벨내부클래스
		int no2 = 5000;
		public void xyz() {
			System.out.println("여기는 TPCLs");
		}
	}
	
	void aaa() {
		class Aaa() {	// 지역 내부클래스
			public Aaa() {
				System.out.println("여기는 Aaa");
			}
		}
		new 
	}
}
