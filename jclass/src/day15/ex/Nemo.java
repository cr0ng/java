package day15.ex;

public class Nemo extends Figure{
	
	private int n1 = (int)(Math.random()*10 + 1);
	private int n2 = (int)(Math.random()*10 + 1);
	
	public double getArea() {
		System.out.println("가로 : " + n1 + " 세로 : "+ n2);
		return n1 * n2;
	}
	
	public void toPrint() {
		System.out.println("네모 클래스 \n");
		
	}


}
