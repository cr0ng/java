package day15.ex;

public class Won extends Figure {
	
	private int r = (int)(Math.random()*10 + 1);
	
	public double getArea() {
		System.out.println("반지름 : " + r);
		return Math.PI * r * r;
	}

	public void toPrint() {
		System.out.println("원 클래스 \n");
	}

}
