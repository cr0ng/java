package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test14 {

	public Test14() {
		TreeSet set = new TreeSet((new Test11()).new MySort());
		
		// Semo 5개 랜덤하게 입력
		while(set.size() < 5) {
			set.add(new Semo((int)(random()*10 + 1), (int)(random()*10 + 1)));
		}
		
		System.out.println("===================================================");
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Semo s = (Semo) itor.next();
			s.toPrint();
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}