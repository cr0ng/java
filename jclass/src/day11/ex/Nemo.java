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
		System.out.printf("가로 : %2d , 세로 : %2d , 넓이 : %3d\n",garo,sero,area);
	}
}
