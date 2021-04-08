package BaekJoon;

import java.io.*;
import java.util.*;

public class QuickSort {
	
	public static void quick(int[] ary, int start, int end) {
		if(start >= end) return;
		//generally pivot is first;
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		while(left <= right) {
			//repeat if find data that larger than pivot
			while(left <= end && ary[left] <= ary[pivot]) left++;
			//repeat if find data that smaller than pivot
			while(right > start && ary[right] >= ary[pivot]) right++;
			
			//cross case
			if(left > right) {
				int temp = ary[pivot];
				ary[pivot] = ary[right];
				ary[right] = temp;
			}else {
				int temp = ary[left];
				ary[left] = ary[right];
				ary[right] = temp;
			}
			
			quick(ary, start, right - 1);
			quick(ary, right + 1, end);
		}
	}
	
	public static void main(String[] args) throws IOException {		
        int[] ary = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quick(ary, 0, ary.length-1);

        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + ", ");
        }
	}
}