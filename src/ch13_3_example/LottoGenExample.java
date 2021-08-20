package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoGenExample {
	
	static final int MAX = 45;
	static final int COUNT = 6;
	
	
	public static void main(String[] args) {
		/**{로또 번호 생성기}
		 * 중복저장되지 않는 HashSet이용
		 */
		
		Set<Integer> set = new HashSet<>(COUNT);
		
		int n = 0;
		while(set.size() < COUNT) {
			n++;
			set.add((int)(Math.random() * MAX) + 1);
		}
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		System.out.println(lotto + " " + n + "회");
	}
}
