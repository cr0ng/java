package day13.ex;
/*
 	���� 1]
 		���� ������ ����� �ϴ� Student Ŭ������ ���弼��.
 		�ʿ��� ������ �Լ����� ��� �ۼ��ؼ� ���弼��.
 		toString()�� �߰��ϼ���.
 			String name;
 			int ban, no, kor, eng, math, total;
 			
 		5���� �л��� �����͸� �迭�� ���
 		���뵵 ����ϼ���.
 		
 		�۾����� ]
 			1. �ʿ��� ������ ������ Ŭ������ �ۼ�
 			2. �ʿ��� �����ڸ� �����Ѵ�.
 			3. Ex01 Ŭ���� ������ 5�л��� �����͸� �迭�� �����.
 			4. ����Ѵ�.
 		
 */

public class Ex01 {
	/*
	public Ex01() {
		
		Student[] st = getData();
		toPrint(st);
	
	}
	
	public Student[] getData() {
		
		Student[] st = new Student[5];
		
		for(int i = 0 ; i < st.length; i++) {
			st[i] = new Student();
		}
		
		String[] name = {"������","��ä��","�ڿ��","���ǿ�","������"};
		int[] ban = {1,2,3,4,5};
		int[] no = {1,2,3,4,5};
		
		for(int i = 0 ; i < st.length ; i++) {
			String na = name[i];
			int b = ban[i];
			int n = no[i];
			int k = st[i].getKor();
			int e = st[i].getEng();
			int m = st[i].getMath();
			int t = st[i].getTotal(k,e,m);
			
			st[i].setName(na);
			st[i].setBan(b);
			st[i].setNo(n);
			st[i].setKor(k);
			st[i].setEng(e);
			st[i].setMath(m);
			st[i].setTotal(t);
			
			System.out.printf("�̸� : %s, �� : %d, ��ȣ : %d, �������� : %d, �������� : %d, �������� : %d, ���� : %d \n",na,b,n,k,e,m,t);
				
		}
		return st;
	}
	
	public void toPrint(Student[] st) {
		for(int i = 0 ; i < st.length ; i++) {
			System.out.println(st[i].toString());
		}
	}
	*/
	
	//������ �ڵ�
	public Ex01(){
		Student[] stud = getStud();
		
		// ����غ���
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.println(stud[i]);
			/*
			 	println()�� toString()�� �ڵ�ȣ���ؼ� ����Ѵ�.
			 */
		}
	}
	
	//�׻� �迭 ��ȯ���ִ� �Լ�
	public Student[] getStud() {
		Student[] s = new Student[5];
		String[] name= {"ȫ�浿","��  ��","�� �浿","����","�����"};
		int no = 1;
		int ban = 2;
		
		//�迭 �������ְ�
		for(int i = 0 ; i < s. length; i++) {
			// ���� ���� ���� �����ϰ� �����
			int k = (int)(Math.random()*41+60);
			int e = (int)(Math.random()*41+60);
			int m = (int)(Math.random()*41+60);
			
			//���� �� �濡 �ν��Ͻ��� ���� ����Ű��
			s[i] = new Student(name[i], ban, no++, k, e,m);
			/*
			s[i] = new Student(name[i], ban, no++);
			s[i].setKor(k);
			s[i].setEng(e);
			s[i].setMath(m);
			s[i].setTotal();
			s[i].setAvg();
			*/
			/*
			s[i] = new Student();
			s[i].setName(name[i]);
			s[i].setBan(ban);
			s[i].setKor(k);
			s[i].setEng(e);
			s[i].setMath(m);
			s[i].setTotal();
			s[i].setAvg();
			*/
		}
		
		return s;
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
