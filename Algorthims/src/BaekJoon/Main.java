package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 7 : 54  34min
	
	static long ans = 7;
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		ans = GCD(a, b);
		
		String str ="";
		for(int i = 0; i < ans; i++) {
			str += "1";
		}
		
		sb.append(str);
		
		System.out.println(sb);
	}
	
	static long GCD(long a, long b) {
		if(a%ans == 0 && b%ans == 0) {
			return ans;
		}
		ans--;
		return GCD(a, b);
	}
}