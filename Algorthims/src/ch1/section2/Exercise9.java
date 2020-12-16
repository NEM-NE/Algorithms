package ch1.section2;

import java.util.Arrays;

public class Exercise9 {
	/*
	 * Binary Search를 수정하여 검사된  키의 전체 개수를 Counter 클래스를 이용해 기록하도록 해보라. 즉, 최종결과를 구하기까지의
	 * 모든 탐색 과정 동안 키에 대한 검사가 몇 번이나 이루어지는 지 출력한다.
	 */
	public static void main(String[] args) {
		int[] whitelist = {2, 10, 3, 6, 5, 4, 7, 1, 9, 8};
		
		int[] keys = {10, 12, 5};
		
		Counter counter = new Counter("count");
		Arrays.sort(whitelist);
		
		for(int i = 0; i < keys.length; i++) {
			if(rank(keys[i], whitelist, counter) != -1) {
				String answer = counter.toString();
				System.out.println(answer);
			}else {
				System.out.println(keys[i]);
			}
		}
		
	}

	public static int rank(int key, int[] a, Counter counter) {
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi) {
			counter.increment();
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]) hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
}

class Counter{
	private final String name;
	private int count;
	
	public Counter(String id) {
		name = id;
	}
	
	public void increment() {
		count++;
	}
	
	public int tally() {
		return count;
	}
	
	public String toString() {
		return count + " " + name;
	}
}
