package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test13 {

	public Test13() {
		// TreeSet �����
		TreeSet set = new TreeSet();
		// ������ 10�� �ְ�
		while(set.size() <= 10) {
			set.add((int)(random()*20 + 1));
		}
		
		// ���� ���캸��...
		System.out.println(set);
		
		TreeSet set2 = new TreeSet();
		set2.add("����");
		set2.add("����");
		set2.add("����");
		set2.add("����");
		set2.add("��������");
		set2.add("�κ�");
		set2.add("����");
		set2.add("���");
		set2.add("���");
		set2.add("����Ű");
		
		// ���
		Iterator itor = set2.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		TreeSet set3 = new TreeSet();
		// Semo 5�� �Է�
		while( set3.size() <= 5 ) {
			set3.add(new Semo((int)(random()*10 + 1), (int)(random()*10 + 1)));
		}
		
		// ���
		itor = set3.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
	}
	
	
	public static void main(String[] args) {
		new Test13();
	}

}