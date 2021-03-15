package day19.ex;

public class Circle implements Figure{
	private int radius;
	private double area;
	
	public Circle(int radius) {
		this.radius = radius;
		setArea();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = radius * radius * 3.14;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void toPrint() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "¹İÁö¸§ : " + radius + ", ³ĞÀÌ : " + area;
	}
	
	
	
}
