package BaekJoon;

import java.io.*;
import java.util.*;

public class DFSBFS {

	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static String str = "";
	
	public static void dfs(int x) {
		visited[x] = true;
		str += x + " ";
		
		for(int i = 0; i < graph.get(x).size(); i++) {
			if(!visited[graph.get(x).get(i)]) dfs(graph.get(x).get(i));
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(start);
		visited[start] = true;
		
		while(!que.isEmpty()) {
			int index = que.poll();
			str += index + " ";
			for(int i = 0; i < graph.get(index).size(); i++) {
				if(!visited[graph.get(index).get(i)]) {
					que.add(graph.get(index).get(i));
					visited[graph.get(index).get(i)] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i =0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// add 
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		
		graph.get(2).add(1);
		graph.get(2).add(7);
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);
		
		graph.get(4).add(3);
		graph.get(4).add(5);
		
		graph.get(5).add(3);
		graph.get(5).add(4);
		
		graph.get(6).add(7);
		
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);
		
		graph.get(8).add(1);
		graph.get(8).add(7);
		
		bfs(1);
		System.out.println(str);
    }


}
