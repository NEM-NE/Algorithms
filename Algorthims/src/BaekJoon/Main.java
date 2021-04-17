package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 20

	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		long[] list = new long[tc];
		long[][]cnt2 = new long[tc][2]; 
		
		for(int i = 0; i < tc; i++) {
			list[i] = (Long.parseLong((br.readLine())));
		}
		
		Arrays.sort(list);

		Long cur;
		Long pre;
		int index = 0;
		
		cnt2[0][0] = 1;
		cnt2[0][1] = list[0];
		for(int i = 1; i < list.length; i++) {
			pre= list[i-1];
			cur = list[i];
			if(cur != pre) {
				index++;
				cnt2[index][1] = cur;
			}
			cnt2[index][0]++;
		}
		
		long max = 0;
		long ans = 0;
		for(int i = 0; i < cnt2.length; i++) {
			if(max < cnt2[i][0]) {
				max = cnt2[i][0];
				ans = cnt2[i][1];
			}
		}
		
		sb.append(ans).append('\n');
		
		System.out.println(sb);
	}
}