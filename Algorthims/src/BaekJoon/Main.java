import java.io.*;
import java.util.*;

public class Main {
	// 11 : 36
		
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int tc = scanner.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0; i < tc; i++) {
			list.add(scanner.nextInt());
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < tc; i++) {
			sb.append(list.get(i)).append('\n');
		}
		
		
		System.out.println(sb);
		
	}
}