package day21;

import java.util.*;

public class Test01 {
/*
 * 	���ʸ��� ������ ���ϵ� ī��
 * 	==> � �Լ��� ���ʸ� ����� �÷����� �Ű������� ���� ��
 * 		�ڱ��ڽ� �̿��� �ٸ� Ŭ������ ���ʸ� ����� �͵� ���� �� �ֵ��� �Ѵ�.
 */
	public Test01() {
		ArrayList<Object> list0 = new ArrayList<Object>();
		ArrayList<Son> list1 = new ArrayList<Son>();
		ArrayList<Father> list2 = new ArrayList<Father>();
		ArrayList<Grand> list3 = new ArrayList<Grand>();
		
//		abc(list1);	// ����Ʈ ���ʸ��� ������ �ٸ�
		abc(list2);
//		abc(list3);	// ����Ʈ ���ʸ��� ������ �ٸ�
		
		// xyz() ȣ��
//		xyz(list1);	// ArrayList�� ����� �����Ͱ� �ٸ���.
		xyz(list2);
		xyz(list3);
		xyz(list0);
		
		//lmn() ȣ��
//		lmn(list0);	// <Object> �̱� ������ �ȵ�
		lmn(list1);	// list1�� ArrayList<Son>���� ���ʸ����� ����Ǿ��ֱ� ������ ����
		lmn(list2);
//		lmn(list3); // 
		
		//qwe() ȣ��
		qwe(list0);
		qwe(list1);
		qwe(list2);
		qwe(list3);
	}

	public void abc(ArrayList<Father> l) {
		/*
		 * �� �Լ��� ArrayList�� �Ű������� �޾Ƽ� ���
		 * �� �Լ��� �ݵ�� Father�� ���ʸ� ����� ArrayList�� �Ű������� ���� �� ����
		 */
	}
	
	public void xyz(ArrayList< ? super Father> l ) {
		/*
		 * 
		 */
	}
	
	public void lmn(ArrayList<? extends Father> l) {
		/*
		 *  Father Ŭ������ �� ���� Ŭ������ ���ʸ� �����
		 *  ArrayList�� ���� �� �ִ�.
		 */
	}
	
	public void qwe(ArrayList<?> l) {
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

class Grand{

}

class Father extends Grand{
	
}

class Son extends Father{
	
}