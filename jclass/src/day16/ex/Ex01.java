package day16.ex;
/*
 	인터페이스 Dohyung을 구현한 클래스
 		Semo, Nemo, Won
 	을 만들고
 	배열에 랜덤하게 10개를 만들어서 채우고
 	각 도형의 정보를 출력하세요
 */
public class Ex01 {

	public Ex01() {
		
		//int no = (int)(Math.random()*3);
		
		Dohyung d = null;
		double [] arr = new double[10];
		
		/*switch(no) {
		case 0:
			d = new Semo();
		case 1:
			d = new Nemo();
		case 2:
			d = new Won();
		}*/
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int no = (int)(Math.random()*3);
			
			if(no == 0) {
				d = new Semo();
				arr[i] = d.getArea();
				System.out.println(arr[i] +" ");
				d.toPrint();
			}else if (no == 1){
				d = new Nemo();
				arr[i] = d.getArea();
				System.out.println(arr[i] +" ");
				d.toPrint();
			}else if (no == 2){
				d = new Won();
				arr[i] = d.getArea();
				System.out.println(arr[i] +" ");
				d.toPrint();
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
