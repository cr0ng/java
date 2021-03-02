package day11.ex;

public class Semo {
	public int under, height;
	
	public Semo() {
		under = (int)(Math.random()*(15-5+1)+5);
		height = (int)(Math.random()*(15-5+1)+5);
	}
	
	public double area() {
		return under * height * 0.5;
	}
}
