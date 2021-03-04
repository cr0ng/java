package day11.solv;

/*
	Student Ŭ����(HomeWork02)�� �̿��ؼ� ==> �Լ��� �̿��ؼ� �����ض�...
	�츮�� ģ���� 5���� ������ �迭�� �����
	����ϴ� ���α׷��� ���� �����ϼ���.
*/

/*
	extra ]
		�̸� �Ǵ� ���̵� �Է��ϸ�
		�ش� ģ���� ������ ������ִ� ���α׷��� �����ϼ���.
		
		��ȭ��ȣ�� �Է��ϸ� �ش� �л��� ������ ������ֵ��� ó��...
 */

import java.util.*;
public class HomeWork02 {
	Scanner sc = new Scanner(System.in);
	public HomeWork02() {
		// �迭 �غ��ϰ�
		Student[] stud = getDataArr();
		// �����ϸ� �ν��Ͻ��� ������ ��� ä���� ��ȯ���ִ� �Լ��� �̹� ����� ������
		// ȣ�⸸�ϸ� ���ϴ� Student �迭�� ���� �� �ִ�.
		
		// ������ش�.
		toPrint(stud);
		
		exec(stud);
		sc.close();
	}
	
	// ����ó���Լ�
	public void exec(Student[] st) {
		// ����
		// ���� �ݺ��ؼ� ģ���� �̸��� �Է��� ������ �ƴϸ� ���̵� �Է��� �������� �Է� �޴´�.
		// �̸��Է��� 0�� ���̵��Է��� 1������ ó���ϱ�� �Ѵ�.
		
		// �Էµ��� �غ�
		while(true) {
			// �޼��� ����Ѵ�.
			System.out.print("�̸����� �˻��� 0, ���̵�� �˻��� 1 , ��ȭ��ȣ �˻��� 2�� �Է��ϼ���! ����� 9 �� �Է� : ");
			int no = sc.nextInt();
			System.out.println("no : " + no); 
			// ��ĳ�ʿ��� ������ �Է��� �� ��Ƽ�� ���� ���̰�
			// ������ ������ �Լ��� ����Ű�� �ش��ϴ� Ű���� �������� �ʴ´�.
			// ���ۿ� �����ִ� ���� ������ ��������...
			sc.nextLine();
			
			
			// �����ڵ� �˻��ϰ�
			if(no == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			// �߸��Է����� �˻��ϰ�
			if(!(no == 0 || no == 1 || no == 2)) {
				System.out.println("�߸��Է��߽��ϴ�!");
				continue;
			}
			
			switch(no) {
			case 0:
				// �̸����� �˻��ϴ� ��� ó��
				nameToInfo(st);
				break;
			case 1:
				// ���̵�� �˻��ϴ� ��� ó��
				idToInfo(st);
				break;
			case 2:
				// ��ȭ��ȣ �˻� ��� ó��
				telToInfo(st);
				break;
			}
		}
	}
	
	// �迭�� �Է��ؼ� �����ϸ� �̸��� �Է¹޾Ƽ� 
	// �ش� �̸��� �л������� ������ִ� �Լ�
	public void nameToInfo(Student[] st) {
		// �Էµ��� �غ��ϰ�
		// �޼��� ����ϰ�
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		
		// �� �ε����� �̸��� ���ؼ� ���� �̸��̸� ������ ������ش�.
		for(int i = 0 ; i < st.length ; i++ ) {
			if(st[i].getName().equals(name)) {
//				System.out.println(st[i].toString());
				toPrint(st, i);
				break;
			}
		}
	}
	
	// �迭�� �Է��ؼ� �����ϸ� ���̵� �Է¹ް�
	// �ش���̵��� �л� ������ ������ִ� �Լ�
	public void idToInfo(Student[] st) {
		// �޼��� ����ϰ�
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		
		// �� �ε����� �̸��� ���ؼ� ���� �̸��̸� ������ ������ش�.
		for(int i = 0 ; i < st.length ; i++ ) {
			if(st[i].getId().equals(id)) {
//				System.out.println(st[i].toString());
				toPrint(st, i);
				break;
			}
		}
	}
	
	public void telToInfo(Student[] st) {
		System.out.print("��ȭ��ȣ �Է� : ");
		String tel = sc.nextLine();
		
		for(int i = 0 ; i < st.length; i++) {
			if(st[i].getTel().equals(tel)) {
				toPrint(st,i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new HomeWork02();
	}
	
	// �ν��Ͻ��� ������ ä���ִ� �Լ�
	public Student[] getDataArr() {
		// ��ȯ�� ���� �����
		Student[] st = new Student[5];
		
		for(int i = 0 ; i < st.length ; i++ ) {
			st[i] = new Student();
		}
		
		// ������ ���Կ� �迭�� �غ�
		String[] name = {"���¼�", "�ֿ���", "�����", "�ִٿ�", "�����"};
		String[] id = {"tsung", "hoon", "soo", "yun", "ki"};
		String[] mail = {"tsung@increpas.com", "hoon@increpas.com", "soo@increpas.com", "yun@increpas.com", "ki@increpas.com"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-7777-7777", "010-5555-5555"};
		char[] gen = {'M', 'M', 'F', 'F', 'M'};
		
		//  ������ ä���
		for(int i = 0 ; i < st.length ; i++ ) {
			String irum = name[i];
			String aidi = id[i];
			String juso = mail[i];
			String hp = tel[i];
			char gender = gen[i];
			
			st[i].setName(irum);
			st[i].setId(aidi);
			st[i].setMail(juso);
			st[i].setTel(hp);
			st[i].setGen(gender);
		}
		
		// �ϼ��� �迭 ��ȯ���ְ�...
		return st;
	}
	
	// ��¿� �Լ� 
	public void toPrint(Student[] st) {
		for(int i = 0 ; i < st.length ; i++ ) {
			System.out.println(st[i].toString());
		}
	}
	
	public void toPrint(Student[] st, int idx) {	// �����ε� ( <=== �Ű������� ������ �ٸ���.)
		System.out.println(st[idx].toString());
	}

	/*
	public String toPrint(Student[] st) { // �Ű���������Ʈ�� ���°� ���� ������ �ȵȴ�.
		String str = "";
		
		return str;
	}
	*/
}