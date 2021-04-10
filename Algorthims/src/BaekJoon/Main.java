package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 07 : 5
	
	static int[] dp = new int[31];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		
		dp[2] = 3;
		for(int i = 4; i < tc+1; i+=2) {
			dp[i] = (int)Math.pow(3, i/2);
			for(int j = i/2 - 2; j >= 0; j--) {
				dp[i] += (int)Math.pow(6, j) * 2;
			}
			
		}
		
		System.out.println(dp[tc]);
	}
}