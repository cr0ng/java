package day18;
/*
 * 	Ư�� ���ڿ��� �Է��� �� �� ���ڿ� ��
 *  ��Ģ�� �´� �κγ� ��� ����غ���.
 */
import java.util.regex.*;
public class Test02 {

	public Test02() {
		String tel = "������ : 010-3175-9042";
		// �� ���ڿ� �߿��� ��ȭ��ȣ�� ������ ���� �ʹ�.
		// ���
		// 1. ���Խ� �˻縦 �����Ѵ�.
		Pattern pat = Pattern.compile("01[0-9]-[0-9]{4}-[0-9]{4}");
		Matcher mat = pat.matcher(tel);
		// 2. ��Ģ�� �´� �κ��� �ִ��� Ȯ��
		if(mat.find()) {
			// 3. ��Ģ�� �´� �κи� ������ ����Ѵ�.
			String group = mat.group();
			// ���
			System.out.println("������ ��ȭ��ȣ : " + group);
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
