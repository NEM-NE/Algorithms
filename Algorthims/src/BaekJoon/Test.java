package BaekJoon;

import java.io.*;
import java.util.*;

public class Test {
	// 10 : 15
	static int Ax, Ay, Cx, Cy;
	static double Adx, Ady, Cdx, Cdy;
	
	static double cal(double x) {
		double xx = (Cx + (Cdx * x)) - (Ax + (Adx * x));
		double yy = (Cy + (Cdy * x)) - (Ay + (Ady * x));
		return Math.sqrt(Math.pow(xx, 2) + Math.pow(yy, 2));
	}
	
	private static double cal2(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Ax = Integer.parseInt(st.nextToken());
		Ay = Integer.parseInt(st.nextToken());
		double Bx = Integer.parseInt(st.nextToken());
		double By = Integer.parseInt(st.nextToken());
		
		Cx = Integer.parseInt(st.nextToken());
		Cy = Integer.parseInt(st.nextToken());
		double Dx = Integer.parseInt(st.nextToken());
		double Dy = Integer.parseInt(st.nextToken());
		
		Adx = (Bx - Ax) / 1000000;
		Ady = (By - Ay) / 1000000;
		
		Cdx = (Dx - Cx) / 1000000;
		Cdy = (Dy - Cy) / 1000000;
		
		int max = 1000000;
		int min = 0;
			
		while((max - min) >= 3) {
			int p = (2*min + max) / 3, q = (min + 2 * max) / 3;
			
			double A = cal(p);
			double B = cal(q);
			
			if(A < B) {
				max = q - 1;
			}else {
				min = p + 1;
			}
		}
		
		double lo = Double.MAX_VALUE;
		while(min <= max) {
			lo = Math.min(lo, cal(min));
			min++;
		}
		
		sb.append(lo);
		System.out.println(sb);
	}

}