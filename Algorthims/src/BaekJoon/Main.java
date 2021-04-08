package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10: 23
	
	static int[] dp = new int[301];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		int[] ary = new int[tc+1];
		
		for(int i = 1; i < tc+1; i++) {
			ary[i] = scanner.nextInt();
		}
		
		dp[1] = ary[1];
		if(tc > 1)dp[2] = ary[1] + ary[2];
		
		for(int i = 3; i < tc+1; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3]+ary[i-1]) + ary[i];
		}
		
		System.out.println(dp[tc]);
		
	}
}