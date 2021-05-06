package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 11	
	
	static int[][]graph;
	static boolean[] visited;
	static int[] cnt;
	
	static void dfs(int x) {
		visited[x] = true;
		cnt[x]++;
		for(int i = 1; i < graph[x].length; i++) {
			if(!visited[i] && graph[x][i] == 1) dfs(i);
			else if(visited[i] && graph[x][i] == 1)
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			graph = new int[v+1][v+1];
			visited = new boolean[v+1];
			cnt = new int[v+1];
			
			for(int j = 0; j < e; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				

				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			
			dfs(1);
			
			boolean isBipartie = true;
			for(int j = 1; j < visited.length; j++) {
				if(visited[j] != 1) {
					isBipartie = false;
					break;
				}
			}
			if(isBipartie) sb.append("YES").append('\n');
			else sb.append("NO").append('\n');
		}
		
		System.out.println(sb);
	}
	
}