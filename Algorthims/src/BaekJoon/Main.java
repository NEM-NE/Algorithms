package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 4 : 50
	
	static long[] dp = new long[5000];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		String tc = scanner.next();
		
		int[] ary = new int[tc.length()+1];
		for(int i = 1; i < tc.length()+1; i++) {
			ary[i] = tc.charAt(i-1) - 48;
		}
		
		dp[0] = 1;
		if(ary[1] != 0) {
			dp[1] = 1;
		}else {
			System.out.println(0);
			System.exit(0);
		}
		
		for(int i = 2; i < ary.length; i++) {
			if(10*ary[i-1] + ary[i] > 27 || ary[i] == 0) {
				if(ary[i] == 0 && (10*ary[i-1] + ary[i] > 27 || 10*ary[i-1] + ary[i] == 0)) {
					System.out.println(0);
					System.exit(0);
				}
				dp[i] = dp[i-1];
				dp[i] %= 1000000;
			}else {
				dp[i] = dp[i-1] + dp[i-2];
				dp[i] %= 1000000;
			}
		}
		
		System.out.println(dp[ary.length-1]);
		

	}
}