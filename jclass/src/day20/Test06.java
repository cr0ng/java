package day20;
/*
 * TreeMap에 이름을 키값으로 하고 나이를 벨류로 하는 데이터를 입력하자.
 */

import java.util.*;

public class Test06 {
	private TreeMap map;
	
	public Test06() {
		setData();
		printMap();
	}
	
	public void setData() {
		map = new TreeMap();
		
		map.put("루피", 17);
		map.put("나미", 19);
		map.put("로빈", 27);
		map.put("쵸파", 10);
		map.put("우솝", 17);
		
	}
	
	public void printMap() {
		// 키만 추출
		Set set = map.keySet();
		TreeSet keys = new TreeSet(set);
		
		ArrayList list = new ArrayList(keys);
		for(Object o : list) {
			System.out.println((String) o + " : " + map.get(o));
		}
	}
	public TreeMap getMap() {
		return map;
	}

	public void setMap(TreeMap map) {
		this.map = map;
	}


	public static void main(String[] args) {
		new Test06();
	}

}
