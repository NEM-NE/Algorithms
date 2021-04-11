package BaekJoon;

import java.io.*;
import java.util.*;

public class CountingSort {
	public static void main(String[] args) throws IOException {		
        int[] ary = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] cnt = new int[10];
        
        for(int i = 0; i < ary.length; i++) {
        	cnt[ary[i]]++;
        }

        for (int i = 0; i < cnt.length; i++) {
        	for(int j = 0; j < cnt[i]; j++) {
        		System.out.print(i + " ");
        	}
        }
		
	}
}