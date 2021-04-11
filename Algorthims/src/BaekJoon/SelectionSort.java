package BaekJoon;

import java.io.*;
import java.util.*;

public class SelectionSort {
	
	public static void main(String[] args) throws IOException {		
        int[] ary = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < ary.length; i++) {
        	int min_index = i;
        	for(int j = i+1; j < ary.length; j++) {
        		if(ary[min_index] > ary[j]) {
        			min_index = j;
        		}
        	}
        	
        	int temp = ary[i];
        	ary[i] = ary[min_index];
        	ary[min_index] = temp;
        }
		
	}
}
