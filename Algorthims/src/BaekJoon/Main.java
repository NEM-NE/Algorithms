package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 2 : 19
	
	static int[] dp = new int[5001];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		String tc = scanner.nextLine();
		
		int[] ary = new int[tc.length()+1];
		for(int i = 1; i < ary.length; i++) {
			ary[i] = tc.charAt(i-1) - '0';
		}
		
		dp[0] = dp[1] = 1;

		for(int i = 2; i < ary.length; i++) {
			int num = ary[i-1] * 10 + ary[i];
			if(num%10 == 0) {
				if(num == 10 || num == 20) {
					dp[i] = dp[i-2];
				}else break;
			}else {
				if(num > 10 && num < 27) {
					dp[i] = dp[i-1] + dp[i-2];
				}else {
					dp[i] = dp[i-1];
				}
			}
			
			dp[i] %= 1000000;
		}
		
		if(ary[1] == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		System.out.println(dp[ary.length-1]);


	}
}