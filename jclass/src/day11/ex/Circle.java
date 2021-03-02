package day11.ex;

public class Circle {
	public int r;
	
	public Circle() {
		r = (int)(Math.random()*(15-5+1)+1);
	}
	
	public double Around() {
		return 2 * 3.14 * r;
	}
	
	public double Area() {
		return 3.14 * r * r;
	}
}
