package day02;

import javax.swing.JOptionPane;

public class Ex02_01 {

	public static void main(String[] args) {
		/*
		 	여기서는 javax.swing 폴더에 이미 코딩되어있는
		 	JOptionPane 이라는 클래스에
		 	문자열로 메세지를 입력받는 기능의 함수
		 	showInpuDialog()를 사용해서 문자열로 입력받도록 한다.
		 	
		 	 이 함수는 GUI 창이 띄어지고 입력받는다.
		 	 (입력 메세지 창이 떠서 입력받는 함수이다)
		 	 
		 	 이 때 입력 데이터는 문자열로 입력받게 된다.
		 	 
		 	 따라서 정수나 숫자의 경우는 
		 	 이후 사용할 타입으로 변환시켜줘야 한다.
		*/
		
		//2. 입력메시지 출력하고
			// showInputDialog() 함수의 매개변수로 입력되는 문자열이
			// 입력메세지로 출력되기 때문에 여기서는 필요없다.
		
		//3. 입력받아 변수에 기억하고
		String garo = JOptionPane.showInputDialog("가로를 입력하세요");
		String sero = JOptionPane.showInputDialog("세로를 입력하세요");
		
		//정수로 변환
		int width = Integer.parseInt(garo);
		int height = Integer.parseInt(sero);
		
		//4. 넓이 계산
		int result = width * height;
		
		//5. 출력
		System.out.printf("%3s : %5d \n%3s : %5d\n%3s : %5d",
				 "가로",width,"세로",height,"넓이",result);	
		
		// 출력용 문자열 만들어서 변수에 기억
		String msg = "가로 : " + width + "\n세로 : " + height + "\n넓이 : "+result;
		// 출력하고
		JOptionPane.showInputDialog(null,msg);
		
	}

}
