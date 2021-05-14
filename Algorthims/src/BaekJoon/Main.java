package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 19
	
	static class Node{
		int x, y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int min = Integer.MAX_VALUE;
	static int num;
	static int number = 2;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static ArrayList<Node> list = new ArrayList<>();
	
	static void findShortest(ArrayList<Node> list) {
		Queue<Node> que = new LinkedList<>();
		
		for(int i = 0; i < list.size(); i++) {
			que.offer(list.get(i));
			visited[list.get(i).y][list.get(i).x] = true;
		}
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int xx = node.x + dx[i];
				int yy = node.y + dy[i];
				
				if(xx > 0 && xx < num+1 && yy > 0 && yy < num+1) {
					if(map[yy][xx] == 0 && !visited[yy][xx]) {
						que.offer(new Node(xx, yy));
						visited[yy][xx] = true;
						map[yy][xx] = map[node.y][node.x] - 1;
					}
				}
			}
		}
	}
	
	static void numbering(int x, int y) {
		Queue<Node> que = new LinkedList<>();
		que.offer(new Node(x, y));
		visited[y][x] = true;
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int xx = node.x + dx[i];
				int yy = node.y + dy[i];
				
				if(xx > 0 && xx < num+1 && yy > 0 && yy < num+1) {
					if(map[yy][xx] == 1 && !visited[yy][xx]) {
						que.offer(new Node(xx, yy));
						visited[yy][xx] = true;
						
						for(int j = 0; j < 4; j++) {
							int xxx = xx + dx[j];
							int yyy = yy + dy[j];
							if(xxx > 0 && xxx < num+1 && yyy > 0 && yyy < num+1) {
								if(map[xxx][yyy] == 0) {
									list.add(new Node(xx, yy));
									map[yy][xx] = number;
								}
							}
						}
						
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		num = Integer.parseInt(br.readLine());
		map = new int[num+1][num+1];
		visited = new boolean[num+1][num+1];
		
		for(int i = 1; i < num+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < num+1; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i < num+1; i++) {
			for(int j = 1; j < num+1; j++) {
				if(map[i][j] == 1) {
					numbering(j, i);
					number++;
				}
			}
		}
		
		for(int i = 1; i < num+1; i++) {
			for(int j = 1; j < num+1; j++) {
				if(map[i][j] > 1) {
					visited = new boolean[num+1][num+1];
					findShortest(list);
				}
			}
		}
		
		sb.append(min).append('\n');
		
		System.out.println(sb);
	}
	
}