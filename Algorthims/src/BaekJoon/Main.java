package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 35
	
	static int[] dp = new int[100000];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		int[][] stickers = new int[100000][2];
		for(int i = 0; i < tc; i++) {
			//init
			int column = scanner.nextInt();
			for(int k = 0; k < column; k++) {
				stickers[k][0] = scanner.nextInt();
			}
			for(int k = 0; k < column; k++) {
				stickers[k][1] = scanner.nextInt();
			}
			
			boolean up = false;
			if(stickers[0][0] >= stickers[0][1]) {
				dp[0] = stickers[0][0];
				up = true;
			}else {
				dp[0] = stickers[0][1];
				up = false;
			}
			
			for(int k = 1; k < column; k++) {
				int upDown = stickers[k-1][0] + stickers[k][1];
				int downUp = stickers[k-1][1] + stickers[k][0];
				
				if(upDown >= downUp) {
					dp[k] = upDown;
					up = true;
				}else {
					dp[k] = downUp;
					up = false;
				}
				
				if(up) {
					
				}else {
					
				}
			}
			
			
		}
		
		
	}
	
}