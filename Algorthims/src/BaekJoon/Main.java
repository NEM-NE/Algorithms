package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 52
	
	static int[] ary;
	static boolean[] visited;
	static boolean[] finished;
	static int cnt;
	
	static void dfs(int x) {
		visited[x] = true;
		
		if(!visited[ary[x]]) {
			dfs(ary[x]);
		}else if(!finished[ary[x]]){
			cnt++;
			for(int i = ary[x]; i != x; i = ary[i]) {
				cnt++;
			}
		}
		finished[x] = true;
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i < tc; i++) {
			int size = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			ary = new int[size+1];
			visited = new boolean[size+1];
			finished = new boolean[size+1];
			cnt = 0;
			
			for(int j = 1; j <= size; j++) {
				ary[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 1; j <= size; j++) {
				if(!visited[j]) {
					dfs(j);
				}
			}
			
			sb.append(size - cnt).append('\n');
			
		}
		
		
		System.out.println(sb);

	}
	
}