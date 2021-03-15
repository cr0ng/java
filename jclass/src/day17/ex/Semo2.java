package day17.ex;

public class Semo2 {
	private int width,height;
	private double area;
	
	public Semo2() {
		
	}
	
	public Semo2(int w,int h) {
		setWidth(w);
		setHeight(h);
		setArea();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}
	
	public void setArea() {
		this.area = width * height / 2.0;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String toString() {
		return "πÿ∫Ø : " + width + ", ≥Ù¿Ã : " + height + ", ≥–¿Ã : " + area  + "\n";
	}

	public boolean equals(Object obj) {
		boolean bool = false;
		
		Semo2 tmp = (Semo2) obj;
		
		bool = this.width == tmp.width;
		
		return bool;
	}
}
