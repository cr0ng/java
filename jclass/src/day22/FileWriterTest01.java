package day22;
/*
 *  char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��ϼ���.
 */
import java.io.*;

public class FileWriterTest01 {

	public FileWriterTest01() {
		// ���Ͽ� ������ ��Ʈ�� �غ�
		FileWriter fw = null;
		try {
			// ��Ʈ�� �����
			fw = new FileWriter("src/day22/data/fwTest.txt");
			/*
			// 1. �ѱ���(2 byte)�� �����غ���.
			char ch = '��';
			fw.write(ch);
			*/
			
			
			// 2. �������ڸ� �����غ���.
			// ������ ���ڿ� �����
			String str = "char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���";
			
			/*
			//2-1. ���ڹ迭�� ó���ϴ� ���
			char[] buff = str.toCharArray(); // ���ڿ��� ���ڹ迭�� ��ȯ���ִ� �Լ�
			fw.write(buff);
			*/
			
			/*
			// 2-2. ���ڿ��� �ٷ� ó���ϴ� ���
			str = str + " : ���ڿ��� ó���ϴ� ���";
			fw.write(str);
			*/
			
			/*
			 *  ���� ]
			 *  	char ������ �ؽ�Ʈ �����͸� ó���ϵ��� �Ǿ��ֱ� ������
			 *  	�⺻�Լ� + ���� ó�� ����� �߰��Ǿ��ִ�.
			 */
			
			// �������� ���ڸ� �����غ���.
			StringBuffer buff = new StringBuffer();
			buff.append("- Hortense Vlou -\n");
			buff.append("\n");
			buff.append("Desert\n");
			buff.append("\n");
			buff.append("He felt so lonely\n");
			buff.append("In this desert\n");
			buff.append("That sometimes\n");
			buff.append("He would walk backwards\n");
			buff.append("Just to see tracks in front of him.");
			
			// ���Ͽ� ����Ѵ�.
			// ����� ���� ���ڿ� �����͸� �Է��ؾ��ϹǷ� ���ڿ��� ��ȯ�ؼ� �Է��Ѵ�.
			
			fw.write(buff.toString());
			System.out.println("*** ���� ���� �Ϸ�***");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new FileWriterTest01();
	}

}
