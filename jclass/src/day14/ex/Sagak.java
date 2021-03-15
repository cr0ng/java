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
		System.out.printf("���� %2d ���� %2d ���� %3d �� �簢��\n", width,height,area);
	}
	
}
