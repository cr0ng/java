package day21;

/*
 * 	1. C:\ ���� �ϳ��� ������ ������.
 * 
 * 	2. C:\ ������ ������ ������ ������.
 * 
 * 	3. ������� ���� �� �ϳ��� ��������. (���� ������ ����, ���� ������ ����)
 */

import java.io.*;

public class FileTest01 {

	public FileTest01() {
		// ����� ���� ����(��� ��� ����.) ���Ϸ� �����
		/*
		// 1.
		File file = new File("C:\\example");
		file.mkdir();
		*/
		
		/*
		// 2.
		File file = new File("C:\\class\\java\\example\\day20");
		file.mkdirs();
		*/
		
		/*
		// 3.
		File file = new File("C:\\example");
		file.delete();
		*/
		
		// Ư�� ������ �̸��� �ٸ� �̸����� ��������.
		// �۾� ����
		// 1. ���� ���ϰ� �ٲ��̸��� ������ �� �� File �� �����.
		File oldfile = new File("C:\\class\\java\\example\\day20");
		File newfile = new File("C:\\class\\java\\example\\day21");
		// 2. �ٲ۴�.
		oldfile.renameTo(newfile);
	}

	public static void main(String[] args) {
		new FileTest01();
	}

}
