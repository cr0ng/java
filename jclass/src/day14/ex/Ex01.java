package day14.ex;

import static java.lang.Math.random;

/*
 	�� �������� �ۼ��� Samgak, Sagak, Circle Ŭ������
 	10���� ����� �迭�� �����
 	�����ϰ� �� Ŭ������ �ν��Ͻ��� ä����
 	����ϴ� ���α׷��� �ۼ��ϼ���.
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
