package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 27
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str =br.readLine();
		String[] ary = new String[str.length()];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = str.substring(i, str.length());
		}
		
		Arrays.sort(ary);
		
		for(int i = 0; i < ary.length; i++) {
			sb.append(ary[i]).append('\n');
		}
		
		System.out.println(sb);
	}
}