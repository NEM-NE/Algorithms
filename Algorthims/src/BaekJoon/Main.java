package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 44
	
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
	
		if(b == 10) {
			System.out.println(a);
			System.exit(0);
		}
		
		int rem = a % b;
		while(a > b) {
			a /= b;
			if(a > 10) {
				sb.append((char)(54+b));
			}else {
				sb.append(a);
			}
		}
		
		if(rem < 10) {
			sb.append((char)(rem+47));
		}else {
			sb.append((char)(rem+55));
		}

		
		System.out.println(sb);
	}
	
}