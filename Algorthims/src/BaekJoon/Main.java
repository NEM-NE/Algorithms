package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 3 : 23
	
	static int[] ary;
	static int[] temp;
	static int cnt;
	public static void mergeSort(int arr[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	public static void merge(int arr[], int l, int mid, int r) {
		int i = l;
		int j = mid+1;
		int k = l;
		int temp[] = new int[arr.length];
		while(i<=mid && j<=r) {
			cnt++;
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=r)
			temp[k++] = arr[j++];
		
		for(int index=l; index<k; index++)
			arr[index] = temp[index];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int tc = Integer.parseInt(br.readLine());
		
		ary = new int[tc];
		temp = new int[tc];
		cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < tc; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(ary, 0, tc-1);
		
		sb.append(cnt);
		System.out.println(sb);
	}

}