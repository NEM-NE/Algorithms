package ch1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise6 {

	public static void main(String[] args) {
		String str1 = "ACTGACG";
		String str2 = "TGACGAC";
		
		boolean isShift = isCircularShift(str1, str2);
		
		StdOut.print(isShift);
	}

	private static boolean isCircularShift(String str1, String str2) {
		boolean flag = true;
		int i = 1;
		
		while(flag) {
			String temp = str2.substring(0, i);
			
			if(str1.indexOf(temp) != -1) {
				i++;
			}else {
				flag = false;
			}
		}
		
		if(!flag) {
			String temp = str2.substring(i, str2.length());
			String temp2 = str1.substring(0, i);
			return temp.equals(temp2);
		}
		
		return false;
	}

}
