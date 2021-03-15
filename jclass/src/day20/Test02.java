package day20;
/*
 * ģ�� �̸��� Ű������ �ϰ� �� ģ���� ��ȭ��ȣ�� �����ϴ� Map�� ����
 * �����͸� ������ ����غ���.
 */

import java.util.*;

public class Test02 {

	private Hashtable tab;
	public Hashtable getTab() {
		return tab;
	}
	public void setTab(Hashtable tab) {
		this.tab = tab;
	}
	public void setTab() {
		tab = new Hashtable();
		tab.put("ȫ�浿","010-1111-1111");
		tab.put("����","010-2222-1111");
		tab.put("����","010-3333-1111");
		tab.put("����","010-4444-1111");
		tab.put("����","010-5555-1111");
		tab.put("����","010-6666-1111");
	}
	
	public void toPrint() {
		// Map �迭�� key ���� �־�� �����͸� ������ �� �����Ƿ�
		// key ���鸸 ��� ��������.
		Set set = tab.keySet();
		// Iterator�� ��ȯ
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			// Ű�� �ϳ� ��������
			String key = (String)itor.next();
			// tab���� Ű���� �ش��ϴ� ������ ������
			String val = (String)tab.get(key);
			// ����ϰ�
			System.out.println(key + " | "+ val);
		}
	}
	
	// keys() �Լ� �̿��ؼ� ������ִ� �Լ�
	public void toPrint(Hashtable t) {
		// Ű������ �����ϰ�
		Enumeration en = t.keys();
		// �ϳ��� ������ ���
		while(en.hasMoreElements()) {
			// Ű ������
			String key = (String) en.nextElement();
			// value ������
			String val = (String) t.get(key);
			// ���
			System.out.println(key + " | " + val);
		}
	}
	
	public Test02() {
		setTab();	// tab �ʱ�ȭ
		// ������ ���
		toPrint();
		
		System.out.println();
		
		// keys() �Լ��� ó�� �� ���
		toPrint(tab);
	}

	public static void main(String[] args) {
		new Test02();
	}
}
