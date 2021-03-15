package day14.ex;

import static java.lang.Math.random;

/*
 	전 예제에서 작성한 Samgak, Sagak, Circle 클래스를
 	10개를 기억할 배열을 만들고
 	랜덤하게 각 클래스의 인스턴스를 채워서
 	출력하는 프로그램을 작성하세요.
 */
public class Ex01 {

	public Ex01() {
		Figure f1 = new Samgak();
		Figure f2 = new Sagak();
		Figure f3 = new Circle();
		
		Figure[] f = new Figure[10];
		for(int i = 0 ; i < f.length ; i++) {
			f[i] = getFigure();
		}
		for(Figure fi : f) {
			fi.toPrint();
		}
		
	}
	
	public Figure getFigure() {
		Figure f= null;
		
		int no = (int)(Math.random()*3);
		switch(no) {
		case 0 :
			f = new Samgak((int)(random()*10)+1,(int)(random()*10)+1);;
			break;
		case 1 :
			f =  new Sagak((int)(r andom()*10)+1,(int)(random()*10)+1);;
			break;
		case 2 :
			f = new Circle((int)(random()*10)+1);;
			break;
		}
		return f;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
