package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 35
	
	static long[][] dp = new long[100000][2];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		
		for(int i = 0; i < tc; i++) {
			//init
			int column = scanner.nextInt();
			for(int k = 0; k < column; k++) {
				dp[k][0] = scanner.nextInt();
			}
			for(int k = 0; k < column; k++) {
				dp[k][1] = scanner.nextInt();
			}
			
			
		}
		
		
	}
	
}