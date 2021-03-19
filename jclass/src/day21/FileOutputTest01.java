package day21;

/*
 * 	�� ���α׷����� ������ �����
 *  ������ ���뵵 �Է��غ���.
 */
import java.io.*;

public class FileOutputTest01 {

	public FileOutputTest01() {
		// ���Ͽ� �����ϱ� ���ؼ��� ���Ϸ� ����� ��Ʈ���� �ʿ��ϴ�
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("C:\\class\\java\\example\\day21\\FileTest.txt");
			
			// ������ �������� �ʾƵ� �ڵ����� ����� �ش�.
			
			/*
			// 1. �ѱ��ڸ� �Է��غ���.
			fout.write('A');
			*/
			
			/*
			// 2. �������ڸ� ��������.
			String str ="blabla bla blablab lablablabla";
			byte[] buff = str.getBytes();
			fout.write(buff);
			*/
			
			// 3.
			String str = " I Am A Boy, You are my Girl";
			byte[] buff = str.getBytes();
			fout.write(buff,12,buff.length - 12);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// �ܺ� ��ġ�� ����� ���� �ش� �ܺ���ġ�� ����� ����Ǹ�
			// �ݵ�� �ݾ��ִ� ���� ��Ģ�̴�.
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileOutputTest01();
	}

}
