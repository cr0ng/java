package day19;

import java.util.*;
public class Test06 {

	public Test06() {
		ArrayList list = new ArrayList();
		list.add("ȫ�浿"); // �̸�
		list.add(18); 		// ����
		list.add('M'); 		// ����
		list.add(175.5);	// ����
		// ���������Ͱ� �ԷµǾ �ȴ�.
		// Object Ÿ������ �ڵ� ����ȯ�� �Ǽ� ���ȴ�.
		
		/*
			����Ʈ�� �����͸� ������ 
				�̸� : ȫ�浿,
				���� : 19��,
				���� : ����,
				���� : 177.5 cm
			�� �����ؼ� ����ϼ���.
		 */
		
		// ����Ʈ�� ������ ���� �˾Ƴ���
		int len = list.size();
		for(int i = 0 ; i < len ; i++ ) {
			Object o = list.get(i);
			String msg = "";
			if(o instanceof String) {
				String name = (String) o;
				msg = "�̸� : " + name + ", ";
			} else if( o instanceof Integer) {
				int age = (int) o;
				age = age + 1;
				msg = "���� : " + age + "��, ";
			} else if(o instanceof Character) {
				char gen = (char) o;
				String sgen = (gen == 'M') ? "����" : "����";
				msg = "���� : " + sgen + ", ";
			} else if(o instanceof Double) {
				double height = (double) o;
				height = height + 2;
				msg = "���� : " + height + " cm";
			}
			
			System.out.println(msg);
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}