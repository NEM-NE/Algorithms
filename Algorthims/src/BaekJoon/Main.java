package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 10 : 55
	static boolean[] visited;
	static int[] graph;
	static int start;
	static int cnt;
	static ArrayList<Integer> cycleList = new ArrayList<>();
	
	static boolean dfs(int x) {
		if(cycleList.contains(x)) return false;
		if(x == start) return true;
		visited[x] = true;

		if(!visited[graph[x]]) {
			if(dfs(graph[x])) {
				cycleList.add(graph[x]);
				return true;
			}
			return false;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			graph = new int[num+1];
			cnt = 0;
			
			for(int j = 1; j < graph.length; j++) {
				graph[j] = Integer.parseInt(st.nextToken());
			}
			
			// default
			
			
			for(int j = 1; j < graph.length; j++) {
				visited = new boolean[num+1];
				start = j;
				if(!dfs(graph[j])) {
					cnt++;
				}else {
					cycleList.add(graph[j]);
				}
			}
			
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
	}
	
}