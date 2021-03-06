package ch1.section5;

import java.util.Scanner;

public class QuickFind {
	static int[] id;
	static int count;
	
	private static int find(int p) {
		return id[p];
	}
	
	private static void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pId) id[i] = qId;
			count--;
		}
	}
	
	private static boolean connected(int p, int q) {
		return find(p) == find(q) ;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		count = N;
		id = new int[N];
		
		while(scanner.hasNext()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			
			if(connected(p, q)) continue;
			
			union(p, q);
			
		}

	}

}
