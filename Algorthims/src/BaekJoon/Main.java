package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 10 
	
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList(n);
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int index = 0;
		sb.append('<');
		for(int i = 0; i < n-1; i++) {
			index += k-1;
			if(index >= list.size()) index %= list.size();
			
			sb.append(list.remove(index)).append(", ");
		}
		
		sb.append(list.remove(list.size()-1)).append('>');

			
		System.out.println(sb);
		
		
	}
}