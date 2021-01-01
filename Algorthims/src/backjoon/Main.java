package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try {
			//init
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int num = Integer.parseInt(br.readLine());
			int[] base = new int[num];
			int lastFindIndex = 0;
			int lastFindValue = 0;
			
			//init array
			for(int i = 0; i < num; i++) {
				base[i] = i + 1;
			}
			boolean flag = true;
			while(lastFindValue != base[num-1] || flag) {
				int N = Integer.parseInt(br.readLine());
				
				if(lastFindValue < N) { 
					for(int i = lastFindIndex+1; i < base.length; i++) {
						if(base[i] == N) {
							base[i] = 0;
							lastFindIndex = i;
							lastFindValue = N;
						}
						bw.write("+\n");

					} 
				}else {
					for(int i = lastFindIndex-1; i > 0; i--) {
						if(base[i] == 0) continue;
						if(base[i] > N) {
							System.out.println("NO");
							flag = false;
							break;
						}
						if(base[i] == N) {
							base[i] = 0;
							lastFindIndex = i;
							lastFindValue = N;
						}
						
						bw.write("-\n");
					}
				}
				
			}
			
			if(flag) {
				bw.flush();
				bw.close();
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
