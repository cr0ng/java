package day16.ex;

public class Semo implements Dohyung {

	int n1 = (int)(Math.random()*10+1);
	int n2 = (int)(Math.random()*10+1);
	
	public Semo() {
	
	}
	
	public double getArea() {
		System.out.println("���� : " + n1 + " �غ� : "+ n2);
		return  n1 * n2 / 2.0;
	}
	
	public void toPrint() {
		System.out.println("���� Ŭ���� \n");
	}
	

	
}
