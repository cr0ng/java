package day14.ex;

public class Samgak extends Figure{
	private int width, height;
	private double area;
	
	public Samgak() {}
	public Samgak(int width, int height) {	// 기본생성자 오버로딩
		this.width = width;
		this.height = height;
		setArea();
	}
	
	//getArea() 오버라이딩
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area = width * height / 2.0;
	}
	
	public void toPrint() {
		System.out.printf("밑변이 %2d 높이가 %2d이고 넓이가 %5.2f인 삼각형 \n", width,height,area);
	}
}
