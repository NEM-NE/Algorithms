package backjoon;

import edu.princeton.cs.algs4.StdOut;

public class Test {

	public static void main(String[] args) {
		int[] ary = new int[5];
		for(int i = 0; i < ary.length; i++) {
			ary[i] = i;
		}
		System.out.println(ary[1]);
		cal(ary);
		System.out.println(ary[1]);
	}

	private static void cal(int[] ary) {
		for(int i = 0; i < ary.length; i++) {
			ary[i] = ary.length-1-i;
		}
		
	}

}
