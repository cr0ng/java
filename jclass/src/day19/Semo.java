package day19;

public class Semo implements Figure{
	private int width, height;
	private double area;
	
	
	// ������
	public Semo() {}
	public Semo(int width, int height) {
		// �غ��� ���̸� �Է����ָ鼭 ��ü�� ����� �ִ� ������
		this.width = width;
		this.height = height;
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

	@Override
	public void toPrint() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "�ﰢ�� : �غ� - " + width + ", ���� - " + height + ", ���� - " + area;
	}
	
	@Override
	public boolean equals(Object o) {
		return area == ((Semo) o).getArea();
	}
}