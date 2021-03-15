package day14.ex;

public class Circle extends Figure{

	private int radius;
	private double round,rarea;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius =radius;
		setRound();
		setArea();
	}
	
	public double getRound() {
		return round;
	}
	
	public void setRound(double round) {
		this.round = round;
	}
	
	public void setRound() {
		this.round = 2 * Math.PI * radius;
	}
	
	public double getArea() {
		return rarea;
	}
	
	public void setArea(double area) {
		this.rarea = area;
	}
	
	public void setArea() {
		this.rarea = Math.PI * radius * radius;
	}

	public void toPrint() {
		System.out.printf("원의 반지름은 %2d 둘레는 %5.2f 넓이는 %5.2f \n",radius,round,rarea);
	}
}
