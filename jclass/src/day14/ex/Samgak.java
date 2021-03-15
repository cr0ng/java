package day14.ex;

public class Samgak extends Figure{
	private int width, height;
	private double area;
	
	public Samgak() {}
	public Samgak(int width, int height) {	// �⺻������ �����ε�
		this.width = width;
		this.height = height;
		setArea();
	}
	
	//getArea() �������̵�
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
		System.out.printf("�غ��� %2d ���̰� %2d�̰� ���̰� %5.2f�� �ﰢ�� \n", width,height,area);
	}
}
