package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 12 : 16
	
	static long[] dp = new long[101];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		dp[1] = 9;
		
		for(int i = 2; i < tc+1; i++) {
			if(i%2 == 0) {
				dp[i] = 2 * dp[i-1] - 1;
				dp[i] %= 1000000000;
			}else {
				dp[i] = 2 * (dp[i-1] - 1);
				dp[i] %= 1000000000;	
			}

		}
		
		System.out.println(dp[tc]);
		
	}
}