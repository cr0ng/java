package day07;
/*
 	'A' ~ 'J' ������ ���ڸ� �����ϰ� 100�� �߻��� ��
 	������ ���ڰ� ��� �߻��ߴ���
 	Ƚ���� ����ϰ�
 	�׷��� �������� ����ϼ���.
 	
 		�� ]
 			
 			A [7]  : *******
 			B [10] : **********
 			
 */
public class Test04 {

	public static void main(String[] args) {
		
		// ���ڸ� ����� �迭�� ����� ���� �ƴϰ�
		// 10���� ���ڰ� �߻��� ī��Ʈ�� ����� �迭�� �����.
		
		int [] cnt = new int[10];
		
		// 100ȸ �ݺ��Ѵ�.
		for(int i = 0 ; i < 100 ; i++) {
			// �����ϰ� ���ڹ߻���Ų��.
			/*
			 	���� ]
			 		A : A + 0	:	A - A
			 		B : A + 1	:	B - A
			 		C : A + 2	:	C - A
			 */
			
			char ch = (char)(Math.random()*10 + 'A');
			// ���� �߻��� ���ڰ� C��� ����° �濡 +1 ���ָ� �ȴ�.
			// �� �� ����° ���� ��ġ���� 'C' - 'A'
			
			// �ε���
			int idx = ch - 'A';
			
			// �ε����� �ش��ϴ� ���� ī��Ʈ + 1
			cnt[idx] += 1;
		}

		// ���� �� ������ ���� Ƚ���� ����Ѵ�.
		for(int i = 0 ; i < cnt.length ; i++) {
			int count = cnt[i];
			System.out.println((char)('A' + i) + " : " +count);
		}
		
		// �׷��� �������� ���
		for(int i = 0 ; i < cnt.length; i++) {
			char ch = (char)('A'+i);
			int count = cnt[i];
			
			System.out.print(ch + " : ");
			for(int j = 0 ; j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
