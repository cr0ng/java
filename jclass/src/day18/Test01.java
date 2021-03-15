package day18;

// �޴�����ȣ ���Խ� 
import java.util.regex.*;

public class Test01 {

	public Test01() {
		/*
		String str = "\"abcd\"";
		
		System.out.println("str : " + str);
		char ch = '\'';
		*/

	// �ڵ��� ��ȣ
	String phone = " 010-3175-9042";
	
	/*
	 * 	1. Pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
	 * 		���� ]
	 * 			�� Ŭ������ ������ �Լ��� ���������ڰ� private�� ������� ��쿡 �ش�
	 * 			�׸��� �� Ŭ������ �Ӽ��� final �Ӽ��� ����Ǿ��ְ�
	 * 			�ǹ̴� �� Ŭ������ �� �̻� ��ӹ��� Ŭ������ ���� �� ���ٶ�� �ǹ��̴�.
	 * 
	 * 			���� �� Ŭ������ �ܺο��� new ���Ѽ� ����� �� ���� Ŭ�����̰�
	 * 			��� ���Ѽ� �� Ŭ������ �ν��Ͻ��� ������ �޾Ƽ� ����� ���� ����.
	 * 			�� ��� �� Ŭ������ ��ü�� ����Ϸ���
	 * 			�Ҽ� �Լ��� �Ӽ��� static �̸鼭 ��ȯ���� Pattern�� �Լ��� ����ϸ� �ȴ�.
	 * 
	 * 			�׷� �Լ� compile()�� �ִ�.
	 * 	
	 */
	
	Pattern pattern = Pattern.compile("01[0-9]-[0-9]{4}-[0-9]{4}");
	
	/*
		2. �� Ŭ�������� ���Խ� ������ �´��� �˻��� �޶�� ��û�ؾ� �Ѵ�.
			���� �˻��ϴ� �Լ���
				matcher()
			�� �Լ��� �˻� ����� Matcher��� Ŭ������
			����� ���� ��� ������ ��� ��ȯ�ϵ��� �Ǿ��ִ�. 
	 */
		
	// ���Խ� �˻��� �޴� ����
	Matcher mat = pattern.matcher(phone);
	
	// ���� Matcher ��ü���� �˻� ����� ������ ���Ǿ��ִ�.
	// �˻� ����� �˷��ִ� �Լ��� �����ϴµ� 
	// Matcher Ŭ������ ��� �� matches() �Լ��̴�.
	
		boolean bool = mat.matches();
		if(bool) {
			System.out.println("�ùٸ� �޴��� ��ȣ");
		}else {
			System.out.println("�ùٸ��� ���� �޴��� ��ȣ");
		}
		
		/*
		 *  ���� ]
		 *  	���Խ� �˻��� ]
		 *  		1. ���Խ� ������ Pattern ��ü�� �����.
		 *  			Pattern.compile("���Խ�����");
		 *  
		 *  		2. ���ڿ��� ���Ͽ� �´��� �˻��Ѵ�.
		 *  			Matcher mat = pattern.matcher("�˻��ҵ�����");
		 *  
		 *  		3. �˻� ����� ������ ����Ѵ�.
		 *  			boolean bool = mat.matcher();
		 */
	}

	public static void main(String[] args) {
		new Test01();
	}

}
