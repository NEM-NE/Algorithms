package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 48
	
	static int[] ary;
	static StringBuilder sb;
	static int cnt;
	static void moveTo(int size, int a, int b, int c) {
		cnt++;
		if(size == 1) {
			sb.append(a + " " + c).append('\n');
			return;
		}else {
			moveTo(size-1, a, c, b);
			sb.append(a + " " + c).append('\n');
			moveTo(size-1, b, a, c);
		}
	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = null;
		
		int tc = Integer.parseInt(br.readLine());
		ary = new int[tc];
		cnt = 0;
		for(int i = 1; i <= tc; i++) {
			ary[i-1] = i;
		}
		
		moveTo(tc, 1, 2, 3);
		
		System.out.println(cnt);
		System.out.println(sb);
		
	}

}