package day11.ex;

public class Won {
	int r;
	double around, area;
	
	public void radius() {
		r = (int)(Math.random()*11+5);
	}
	
	public void around() {
		around = 2 * Math.PI * r; 
	}
	
	public void area() {
		area = Math.PI * r * r;
	}
	
	public void toPrint() {
		System.out.printf("������ : %2d , �ѷ� : %5.2f , ���� : %5.2f \n", r,around,area);
	}
}
