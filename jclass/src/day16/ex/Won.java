package day16.ex;

public class Won implements Dohyung{
	
	int r = (int)(Math.random()*10+1);
	
	public Won() {
	
	}
	
	public double getArea() {
		System.out.println("������ : " + r);
		return  3.14 * r * r ;
	}
	
	public void toPrint() {
		System.out.println("�� Ŭ���� \n");
	}

}
