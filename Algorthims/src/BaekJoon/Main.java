package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 07
		static int[] dp = new int[5001];
		
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());
		
		int[] ary = new int[tc+1];
		int[] cnt = new int[2000001];
		for(int i = 0; i < tc; i++) {
			ary[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < tc; i++) {
			cnt[ary[i] + 1000000]++;
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] == 1) sb.append(i-1000000 + "\n");
		}
		
		System.out.println(sb);



		
	}
}