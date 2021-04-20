package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 55
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tc; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			for(int j = 0; j < str.length(); j++) {
				char a = str.charAt(j);
				if(a == '(') {
					stack.push(a);
				}else {
					if(stack.size() != 0) stack.pop();
					else {
						stack.push(a);
						break;
					}
				}
			}
			
			if(stack.size() == 0) System.out.println("YES");
			else System.out.println("NO");
		}

		
	}
}