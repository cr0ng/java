package day16;

public class TpInner01 {
	int num = 100;
	void abc() {
		System.out.println("TpInner01.num : " + 100);
	}
	
	class GInner{	// ���� ���� Ŭ����
		public GInner() {
			int no1 = 50;
			System.out.println("����� GInner()");
		}
	}
	
	static class TPCLs{	// ž��������Ŭ����
		int no2 = 5000;
		public void xyz() {
			System.out.println("����� TPCLs");
		}
	}
	
	void aaa() {
		class Aaa() {	// ���� ����Ŭ����
			public Aaa() {
				System.out.println("����� Aaa");
			}
		}
		new 
	}
}
