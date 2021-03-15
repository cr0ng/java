package day15.ex;

public class Semo extends Figure {
	
	private int n1 = (int)(Math.random()*10 + 1);
	private int n2 = (int)(Math.random()*10 + 1);
	
	public double getArea() {
		System.out.println("높이 : " + n1 + " 밑변 : "+ n2);
		return  n1 * n2 / 2.0;
	}

	public void toPrint() {
		System.out.println("세모 클래스 \n");
	}



}
