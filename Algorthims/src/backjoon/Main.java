package backjoon;

import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br;
	static int N;
	static int M;
	static LinkedList<Integer> queue;
	
	static int cnt;
	static boolean isFind;
	
	static void init() throws IOException {
		String[] strs = br.readLine().split(" ");
		N = Integer.parseInt(strs[0]);
		M = Integer.parseInt(strs[1]);
		String[] strs2 = br.readLine().split(" ");
		isFind = false;
		cnt = 0;
		
		for(int i = 0; i < strs2.length; i++) {
			int num = Integer.parseInt(strs2[i]);
			queue.offer(num);
		}
	}
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		queue = new LinkedList<>();
		int num = Integer.parseInt(br.readLine());
		
		while(num-- > 0) {
			init();
			
			for(int i = 0; i < N; i++) {
				if
			}
			
		}
		
		System.out.println(sb);
		
	}
}