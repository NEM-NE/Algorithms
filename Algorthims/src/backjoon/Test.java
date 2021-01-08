package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	static int[] ary;
	
	public static void main(String[] args) {
		try {
			//init
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int num = Integer.parseInt(br.readLine());
			ary = new int[num];
			int index = 0;
			int preValue = 0;
			
			while(num-- > 0) {
				int N = Integer.parseInt(br.readLine());
				
				if(N > preValue) { //determine to do pop or push;
					// push
					for(int i = preValue; i < N; i++) {
						ary[index++] = i + 1;
						sb.append("+\n");
					}
				}else if(ary[index - 1] != N) {
					System.out.println("NO");
					return;
				}
				
				if(preValue < N) {
					preValue = N;
				}
				
				sb.append("-\n");
				index--;
			}
			System.out.println(sb);
			


		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
