package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 46
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		LinkedList<Character> list = new LinkedList<>();
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		int size = list.size();
		int point = size;
		for(int i = 0; i < tc; i++) {
			String input = br.readLine();
	
			if(input.charAt(0) == 'P') {
				char a = input.charAt(2);
				list.add(point, a);
				point++;
				size++;
			}else if(input.charAt(0) == 'L') {
				if(point == 0) continue;
				point--;
			}else if(input.charAt(0) == 'B') {
				if(point == 0) continue;
				list.remove(point-1);
				point--;
				size--;
			}else if(input.charAt(0) == 'D') {
				if(point == size) continue;
				point++;
			}
		}
		
		String ans = "";
		for(int i = 0; i < list.size(); i++) {
			ans += list.get(i);
		}
		
		sb.append(ans);
		
		System.out.println(sb);
		
	}
}