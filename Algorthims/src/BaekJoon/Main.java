package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 12 : 50
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		long[] list = new long[k];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		long max = Integer.MAX_VALUE;
		long min = 1;

		while(min <= max) {
			long mid = (max + min) / 2;
			
			long sum = 0;
			for(int i = 0; i < k; i++) {
				sum += list[i]/mid;
			}
			
			if(sum >= n) {
				min = mid + 1;
			}else {
				max = mid - 1;
			}
		}
		
		sb.append(max);
		
		System.out.println(sb);
	}

}