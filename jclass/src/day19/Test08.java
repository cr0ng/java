package day19;

import java.util.*;

import static java.lang.Math.*;
public class Test08 {
/*
	�ﰢ�� 10���� �����ϰ� ����
	���Ϳ� �����Ѻ���.
	�׸��� ������ �������.
 */
	public Test08() {
		Vector vec = new Vector(10, 1);
		// �� ���ʹ� �����͸� ����� ������ 10�� �̰� �����ϴ� ������ 1���� ������Ų��.
		
		// Semo 10���� ä���.
		for(int i = 0 ; i < 10 ; i++ ) {
			// ���� ��ü �����
			Semo semo = new Semo(getInt(), getInt());
			// ���Ϳ� ����ü �־��ְ�
			vec.add(semo);
		}
		
		// ������ ����غ���.
		for(Object o : vec) {
			// �� �濡�� ����ü�� �����װ� ����ҷ��� ������ ����Ÿ������ ���� ����ȯ ���Ѿ� �Ѵ�.
			
			/*
				�� �濡 ä���� �����ʹ�
					Object o = new Semo(getInt(), getInt());
			 */
			
//			System.out.println(o); // ==> �� ������ �������̵���  toString() �Լ��� ȣ��
			
			// toPrint() �Լ� ȣ��
			((Figure) o).toPrint();
		}
		
		System.out.println("Capacity : " + vec.capacity());
		
		vec.add(new Semo(getInt(), getInt()));

		System.out.println("�߰��� �뷮 : " + vec.capacity());
	}
	
	// ������ ���� ��ȯ���ִ� �Լ�
	public int getInt() {
		return (int)(random()*10 + 1);
	}

	public static void main(String[] args) {
		new Test08();
	}

}