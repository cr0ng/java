package day11.ex;

public class Nemo {
	int garo, sero, area;
	
	public void garo() {
		garo = (int)(Math.random()*11+5);
	}
	
	public void sero() {
		sero = (int)(Math.random()*11+5);
	}
	
	public void area() {
		area = garo * sero;
	}
	
	public void toPrint() {
		System.out.printf("���� : %2d , ���� : %2d , ���� : %3d\n",garo,sero,area);
	}
}
