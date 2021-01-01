package ch1.section5;

import java.util.Scanner;

public class WeightQuickUnion {
	static int[] id;
	static int[] sz;
	static int count;
	
	private static int find(int p) {
		while(id[p] != p ) p = id[p];
		return p;
	}
	
	private static void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		
		if(pId == qId) return;
		
		if(sz[p] < sz[q]) {
			id[pId] = qId;
			sz[q] += sz[p];
		}else {
			id[qId] = pId;
			sz[p] += sz[q];
		}
		count--;
	}
	
	private static boolean connected(int p, int q) {
		return find(p) == find(q) ;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		count = N;
		id = new int[N];
		sz = new int[N];
		
		//init
		for(int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
		
		while(scanner.hasNext()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			
			if(connected(p, q)) continue;
			
			union(p, q);
			
		}

	}

}
