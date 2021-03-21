package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 38
	
	static long[] dp = new long[101];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		dp[1] = 9;
		dp[2] = 17;
		for(int i = 3; i < tc+1; i++) {
			dp[i] = (long) (2 * dp[i-1] - (i-1));
			dp[i] %= 1000000000;
		}
		System.out.println(dp[tc]);
		
	}
}