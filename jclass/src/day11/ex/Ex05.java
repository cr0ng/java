package day11.ex;
/*
 	���� ������ 5�� ����� �迭�� ����
 	������ ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	���ó���� Ex03�� �����ϰ� �ϼ���.
 */
public class Ex05 {

	public Ex05() {
	
		Won[] won = new Won[5];
		
		for(int i = 0 ; i < won.length ; i++) {
			won[i] = new Won();
		}
		
		for(int i = 0 ; i < won.length ; i++) {
			won[i].radius();
			won[i].around();
			won[i].area();
		}
		
		for(Won w : won) {
			w.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
