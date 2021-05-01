package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 3 : 47
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		
		if(str.equals("0")) {
			System.out.println(0);
			System.exit(0);
		}
		
		for(int i = 0; i < str.length(); i++) {
			int input = str.charAt(str.length()-1-i) -'0';
			int k = input;
					
			while(input > 0) {
				int num = input%2;
				sb.append(num);
				input /= 2;
			}
			
			if(k == 0) {
				sb.append(0);
			}
			
			if(k < 2 && i != str.length()-1) {
				sb.append(0);
				sb.append(0);
			}else if(k < 4 && i != str.length()-1) {
				sb.append(0);
			}
		
		}
		sb.reverse();
		System.out.println(sb);
		

	}
	

}