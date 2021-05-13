package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 14 : 36
	
	static class Node {
		int x;
		int y;
		int cnt;
		
		public Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static int lsland = 1;
	static ArrayList<Node> list;
	static int cnt;
	
	static int bfs(int x, int y, int end) {
		Queue<Node> que = new LinkedList<Main.Node>();
		que.offer(new Node(x, y));
		visited[y][x] = true;
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int xx = node.x + dx[i];
				int yy = node.y + dy[i];
				
				if(xx > 0 && xx < map.length && yy > 0 && yy < map.length) {
					if(map[yy][xx] == 0 && !visited[yy][xx]) {
						que.offer(new Node(xx, yy));
						visited[yy][xx] = visited[y][x] + 1;
					}else if(map[yy][xx] == end) {
						return visited[y][x];
					}
				}
			}
		}
		return -1;
	}
	
	static void find(int start) {
		for(int i = 1; i < map.length; i++) {
			for(int j = 1; j < map.length; j++) {
				if(map[i][j] == start) {
					list.add(new Node(j, i));
				}
			}
		}
	}
	
	static void setNumbering(int x, int y) {
		Queue<Node> que = new LinkedList<Main.Node>();
		que.offer(new Node(x, y));
		visited[y][x] = true;
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int xx = node.x + dx[i];
				int yy = node.y + dy[i];
				
				if(xx > 0 && xx < map.length && yy > 0 && yy < map.length) {
					if(map[yy][xx] == 1 && !visited[yy][xx]) {
						que.offer(new Node(xx, yy));
						visited[yy][xx] = true;
						map[yy][xx] = lsland;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		
		map = new int[tc+1][tc+1];
		visited = new boolean[tc+1][tc+1];
		
		// create graph;
		for(int i = 1; i < tc+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < tc+1; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num == 1) {
					map[i][j] = num;
				}
			}
		}
		
		for(int i = 1; i < tc+1; i++) {
			for(int j = 1; j < tc+1; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					setNumbering(j, i);
					lsland++;
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= lsland; i++) { // j -> i
			for(int j = 1; j < i; j++) {
				list = new ArrayList<Main.Node>();
				find(j);
				for(int k = 0; k < list.size(); k++) {
					Node node = list.get(k);
					visited = new boolean[tc+1][tc+1];
					min = Math.min(bfs(node.x, node.y, i), min);
				}
			}
		}
		
		sb.append(min);
		System.out.println(sb);
		
		
	}
	
}