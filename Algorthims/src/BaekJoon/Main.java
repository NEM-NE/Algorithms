package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 3 : 24
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());
		
		long[] ary = new long[num];
		long max = 0;
		long min = 1;
		long end = 0;
		for(int i = 0; i < num; i++) {
			ary[i] = Integer.parseInt(br.readLine());
			end = Math.max(end, ary[i]);
		}
		
		
		while(min <= end) {
			long mid = (end + min) / 2;
			
			long cnt = 0;
			for(int i = 0; i < num; i++) {
				cnt += ary[i] / mid;
			}
			
			if(cnt < size) {
				end = mid-1;
			}else {
				min = mid+1;
				max = Math.max(max, mid);
			}
		}
		
		sb.append(max);
		System.out.println(sb);
		
		
	}

}