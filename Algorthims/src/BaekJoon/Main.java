package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 18
	
	static long[] dp = new long[10001];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		
		int[] length = new int[1001];
		int[] array = new int[1001];
		for(int i = 0; i < tc; i++) {
			array[0] = scanner.nextInt();
		}
		
		for(int i = 0; i < tc; i++) {
			int num = 0;
			if(length[array[i]] == 0) {
				num = array[i];
				for(int k = i; k < tc; k++) {
					if()
				}
			}
		}
		
	}
	
}