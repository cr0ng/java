package day15.ex;

public class Won extends Figure {
	
	private int r = (int)(Math.random()*10 + 1);
	
	public double getArea() {
		System.out.println("������ : " + r);
		return Math.PI * r * r;
	}

	public void toPrint() {
		System.out.println("�� Ŭ���� \n");
	}

}
