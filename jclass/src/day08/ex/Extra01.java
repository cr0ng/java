package day08.ex;
/*
5���� ģ���� ������ ����� �迭�� �����
ģ���� �̸��� �Է��ϸ� 
�ش� ģ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
������ �̸�, ���̵�, �̸���, ��ȭ��ȣ, ����
�� �����ϼ���.
 */
import java.util.*;

public class Extra01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("ģ���� �̸��� �Է��ϼ��� : ");
		String name = in.nextLine();
		
		/*
		String[][] info = new String[][]
						  {{"������", "yujin","yj@increapas.com","010-1111-1111","����"},
						   {"��ä��", "chaewon","cw@increapas.com","010-2222-2222","����"},
						   {"������", "euns","es@increapas.com","010-3333-3333","����"},
						   {"���ǿ�", "gunnwoo","gw@increapas.com","010-4444-4444","����"},
						   {"������", "taehyun","th@increapas.com","010-5555-5555","����"}
						  };
		
		for(int i = 0 ; i < info.length - 1; i++) {
			
			if(info[i][0].equals(name)) {
				for(int j = 0 ; j < info[i].length; j++) {
					System.out.print(info[i][j] + " ");
				}
			}else 
				continue;
		}
		*/
		
		//������ �ڵ�
		//�� ����� �ټ����� ������ ����ϴ� �迭�� �ټ����� ������ �迭�� �����.
		String[][] friend = {
				{"ȫ�浿","hong","hong@increpas.com","010-1111-1111","M"},
				{"��浿","Gho","ghoincrepas.com","010-2222-2222","M"},
				{"�Ѹ�","dooly","dooly@increpas.com","010-3333-3333","M"},
				{"����","hee","hee@increpas.com","010-4444-4444","M"},
				{"������","mikol","kol@increpas.com","010-5555-5555","M"}
				};
		
		
		
		for(int i = 0 ; i < friend.length ; i++) {
			// �Ѹ� �̸��� ��������.
			String tmp = friend[i][0];
			
			if(tmp.equals(name)) {
				System.out.printf("%-8s : %3s\n","ģ���̸�",friend[i][0]);
				System.out.printf("%-8s : %3s\n","�� �� ��",friend[i][1]);
				System.out.printf("%-8s : %3s\n","�� �� ��",friend[i][2]);
				System.out.printf("%-8s : %3s\n","��ȭ��ȣ",friend[i][3]);
				System.out.printf("%-8s : %3s\n","ģ������",friend[i][4]);
			}
		}
	System.out.println();
	
	}

}
