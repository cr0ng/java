package day11.solv;

/*
	Stud Ŭ����(HomeWork01)�� �̿��ؼ�
	�츮�� ģ���� 5���� ������ �迭�� �����
	����ϴ� ���α׷��� ���� �����ϼ���.
*/
public class HomeWork01 {
	
	public HomeWork01() {
		// �迭���� �غ��ϰ�
		Stud[] stud = new Stud[5];
		// �ν��Ͻ�ä��� ������ ä���
		setData(stud);
		
		// ����Ѵ�.
		for(Stud st : stud) {
			st.toPrint();
		}
	}
	
	// �迭�� �Է��ϸ� �迭�� �����͸� ä���ִ� �Լ�
	public void setData(Stud[] st) {
		// ������ ���Կ� �迭�� �غ�
		String[] name = {"���¼�", "�ֿ���", "�����", "�ִٿ�", "�����"};
		String[] id = {"tsung", "hoon", "soo", "yun", "ki"};
		String[] mail = {"tsung@increpas.com", "hoon@increpas.com", "soo@increpas.com", "yun@increpas.com", "ki@increpas.com"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-7777-7777", "010-5555-5555"};
		char[] gen = {'M', 'M', 'F', 'F', 'M'};
		
		for(int i = 0 ; i < st.length ; i++ ) {
			// ���� �迭�� �ν��Ͻ� ä���
			st[i] = new Stud();
			
			// ������ ä���
			st[i].name = name[i];
			st[i].id = id[i];
			st[i].mail = mail[i];
			st[i].tel = tel[i];
			st[i].gen = gen[i];
		}
	}
	
	public static void main(String[] args) {
		new HomeWork01();
	}

}