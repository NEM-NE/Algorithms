package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();	
		
		for(int i = 0; i < tc; i++) {
			String str = "";
			for(int j = 0; j <= i; j++) {
				str += "*";
			}
			
			System.out.println(str);
		}

	}
}

