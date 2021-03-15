package day14.ex;

public class Sagak extends Figure{
	private int width, height, area;

	public Sagak() {
		
	}

	public Sagak(int w, int h) {
		this.width = w;
		this.height = h;
		setArea();
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area = width * height;
	}
	
	public void toPrint() {
		System.out.printf("가로 %2d 세로 %2d 넓이 %3d 인 사각형\n", width,height,area);
	}
	
}
