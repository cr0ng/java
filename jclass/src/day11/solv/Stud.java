package day11.solv;

public class Stud {
	public String name, id, mail,tel;
	public char gen;
	
	//��¿��Լ�
	public void toPrint() {
		System.out.printf("�̸� : %3s, ���̵� : %8s , ���� : 20%s, �޴��� : %13s, ���� : %2s \n",name,id,mail,tel,gen);
	}
}
