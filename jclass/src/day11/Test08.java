package day11;

/*
 	�츮�� ģ������ ������ ����� Ŭ������ �����ϰ�
 	�Ѹ� ������ �Է��ؼ� ����غ���.
 */
public class Test08 {
	
	public Test08() {
		
		String[] name = {"������","�����","��ä��","������","������"};
		String[] id = {"euns","soo","won","jin","sin"};
		String [] mail = {"euns@increpas.com","soo@increpas.com","won@increpas.com","jin@increpas.com","sin@increpas.com"};
		String [] tel = {"010-1111-1111","010-2222-1111","010-1333-1111","010-4444-1111","010-5555-1111"};
		char[] gen = {'M','F','F','F','M'};
		
		Stud[] stud = new Stud[5];
		for(int i = 0 ; i < stud.length ; i++) {
			// �� �濡 �ν��Ͻ� ���� ä���ְ�
			stud[i] = new Stud();
			
			// ������ �������ְ�
			stud[i].name = name[i];
			stud[i].id = id[i];
			stud[i].mail = mail[i];
			stud[i].tel = tel[i];
			stud[i].gen = gen[i];
		}
		
		//���
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.println(stud[i].toString());
		}
		
		Student st = new Student();
		//st.name = "�Ѹ�";	// �翬�� ������ �߻��Ѵ� <== ���������ڰ� private�̱� ������ �ش� Ŭ������������ ������ �� �ִ�.
		//String irum = st.name;
		st.setName("�Ѹ�");
		System.out.println("�л� �̸� : " + st.getName());
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}
