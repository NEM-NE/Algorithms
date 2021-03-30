package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 30
	
	static int[][] dp = new int[1001][2];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		int[] ary = new int[tc+1];
		
		for(int i = 1; i < tc+1; i++) {
			ary[i] = scanner.nextInt();
		}
		//up
		for(int i = 1; i < tc; i++) {
			dp[i][0] = ary[i];
			for(int j = 1; j < i; j++) {
				if(ary[i] > ary[j]) {
					dp[i][0] = Math.max(dp[i][0], dp[j][0] + ary[i]);
				}
			}
		}
		//down
		for(int i = 2; i < tc+1; i++) {
			dp[i][1] = ary[i];
			for(int j = 2; j < i; j++) {
				if(ary[i] < ary[j]) {
					dp[i][1] = Math.max(dp[i][1], dp[j][1] + ary[i]);
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i < tc; i++) {
			int num = dp[i][0] + dp[i+1][1];
			if(max < num) max = num;
		}
		
		System.out.println(max);
	}
	
}