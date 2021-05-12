package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 06

	static class Node{
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
	
	static void bfs(int x, int y) {
		Queue<Node> que = new LinkedList<>();
		que.offer(new Node(x, y));
		visited[x][y] = true;
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			
			for(int i = 0; i < 8; i++) {
				int xx = node.x + dx[i];
				int yy = node.y + dy[i];

				if(xx > 0 && xx < map.length && yy > 0 && yy < map[0].length) {
					if(map[xx][yy] == 1 && !visited[xx][yy]) {
						que.offer(new Node(xx, yy));
						visited[xx][yy] = true;
					}
				}
			}
		}

	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0")) break;
			
			int w = str.charAt(0) - '0';
			int h = str.charAt(2) - '0';
			
			map = new int[w+1][h+1];
			visited = new boolean[w+1][h+1];
			
			for(int i = 1; i < h+1; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j < w+1; j++) {
					if(Integer.parseInt(st.nextToken()) == 1) {
						map[j][i] = 1;
					}
				}
			}
			
			int cnt = 0;
			for(int i = 1; i < h+1; i++) {
				for(int j = 1; j < w+1; j++) {
					System.out.println(map[j][i]);
					System.out.println(visited[j][i]);
					if(map[j][i] == 1 && !visited[j][i]) {
						cnt++;
						bfs(i, j);
					}
				}
			}
			
			sb.append(cnt).append('\n');
			
		}
		
		System.out.println(sb);
	}
	
}