package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 8 : 28 20min
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(b == 10) {
			System.out.println(n);
			System.exit(0);
		}
		
		int m = 0;
		int num = n+1;
		while(num >= b) {
			num /= b;
			m++;
		}
		
		int r = (n+1)%b;
		
		for(int i = 0; i < m; i++) {
			if(b > 10) {
				sb.append((char)('6' + b));
			}else {
				sb.append((char)('/' + b));
			}
		}
		
		if(b > 10 && r > 0) {
			if(r >= 10) {
				sb.append('7' + b);
			}else {
				sb.append('0' + b);
			}
			
		}else if(r > 0) {
			sb.append('0' + b);
		}
		
		System.out.println(sb);
		
	}
	

}