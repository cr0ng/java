package day11.ex;
/*
 	�簢���� 7���� ����� �迭�� �����
 	������ ����ϴ� ���α׷��� ���弼��.
 	
 	Ex03�� �����ϰ� ����� ó���ϼ���.
 */
public class Ex04 {
	public Ex04() {
		Nemo[] nemo = new Nemo[7];
		
		for(int i = 0 ; i < nemo.length ; i++) {
			nemo[i] = new Nemo();
		}
		
		for(int i = 0 ; i < nemo.length ; i++) {
			nemo[i].garo();
			nemo[i].sero();
			nemo[i].area();
		}
		
		for(Nemo n : nemo) {
			n.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
