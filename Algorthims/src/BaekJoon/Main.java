package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 15
	
	static long[] dp = new long[100001];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		dp[2] = 3;
		dp[4] = 11;
		for(int i = 6; i < tc+1; i += 2) {
			dp[i] = dp[i-2] * dp[2] + 2;
			dp[i] += (i-6)/2 * 4;
			if((i/2) % 2 ==0) dp[i] -= 1;
		}
		
		System.out.println(dp[tc]);

	}
}