package day11.ex;

public class Samgak {
	int width, height;
	double area;
	
	public void width() {
		width = (int)(Math.random()*(11)+5);
	}
	
	public void height() {
		height = (int)(Math.random()*11+5);
	}
	
	public void area() {
		area = width * height * 0.5;
	}
	public void toPrint() {
		System.out.printf("가로 : %2d , 세로 : %2d , 넓이 : %4.1f \n",width,height,area);
	}
}
