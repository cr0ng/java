package day17.ex;

/*
	���� 2 ]
		�л��� ������ �����ϴ� Ŭ������ �ۼ��ϼ���.
		�л��� ������ �л���ȣ, �̸��� ����ϱ�� �ϰ�
		������ java, db, web, jsp, ���� �� ����ϱ�� �Ѵ�.
		
		�� ��
			�л���ȣ�� ������ ���� �л����� ó���ǰ� �ϼ���.
		�� Ŭ������ ������ ����� �� �ش� �л��� ����(�⺻���� + ����)�� ��µǵ��� �ϼ���.
 */
public class Ex02 {

	public Ex02() {
		Student s1 = new Student(1,"������",100,100,100,100);
		System.out.println(s1);
		
		Student s2 = new Student(1,"��ä��",100,100,100,100);
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			System.out.println("���� �л�");
		}else
			System.out.println("�ٸ� �л�");
	}

	public static void main(String[] args) {
		new Ex02();
	}

}