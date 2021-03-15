package day20;

import java.util.*;

public class Test01 {
	public Hashtable tab;
	
	public Test01() {
		// Hashtable �����
		tab = new Hashtable();
		// ������ ä���
		tab.put("�̸�","ȫ�浿");
		/*
		 *  Map �迭�� �����͸� �Է��� ��
		 *  �� �����͸� �����ϴ� Ű���� �����͸�
		 *  �ѽ����� ���� �Է��ؾ� ��
		 */
		tab.put("����", 18);
		tab.put("��ȭ", "010-1111-1111");
		tab.put("Ű", 173.0);
		System.out.println("�̸� : " + tab.get("�̸�"));
				
		tab.put("�̸�", "��浿");
		System.out.println("�̸� : " + tab.get("�̸�"));
		/*
		 * ���� Ű������ �����͸� �Է��ϸ�
		 * ���� ����� �����ʹ� �����ǰ�
		 * ���ο� �����Ͱ� �Էµȴ�.
		 * ��, ���� Ű���� �� ���� �����͸� ����� �� �ִ�.
		 */
		
		tab.put("����", "��浿");
		// Ű ���� �޶����� ���� �����͵� �Է��� �� �ִ�.
		System.out.println("���� : " + tab.get("����"));
		
		int len = tab.size();
		System.out.println("tab length : " + len );
		
		// �����͸� ����
		Collection con = tab.values();
		
		// Iterator�� ��������
		Iterator itor = con.iterator();
		
		// �ϳ��� ������ ���
		while(itor.hasNext()) {
			Object o = itor.next();
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("���ڿ� ������ : " + str);
			}else if(o instanceof Integer) {
				int no = (int) o;
				System.out.println("���� ������ : " + no);				
			}else if(o instanceof Double) {
				double num = (double) o;
				System.out.println("�Ǽ� ������ : " + num );
				
			}
		}
				
		// Ű ���� ����
		// Ű ���� �����ϴ� �Լ��� keys(), keySet()
		Enumeration en = tab. keys();
		// ���
		while(en.hasMoreElements()) {
			Object obj = en.nextElement();
			// �츮�� ��� Ű���� ��� ���ڿ��̱� ������ ���ڿ��� ���� ����ȯ ������.
			String skey = (String) obj;
		}
	}
	
	
	public static void main(String[] args) {
		new Test01();
	}

}
