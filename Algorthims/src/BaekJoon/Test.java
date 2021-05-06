package BaekJoon;

import java.io.*;
import java.util.*;

public class Test {
    static int[] dp = new int[9];
    public static void main(String[] args) {
        int[] ary = new int[9];
        //input data
        ary[0] = 2;
        ary[1] = 1;
        ary[2] = 5;
        ary[3] = 4;
        ary[4] = 3;
        ary[5] = 7;
        ary[6] = 6;
        ary[7] = 8;
        ary[8] = 9;

        //LIS algorithms
        for(int i = 1; i < 9; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(ary[i] > ary[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        //find max LIS num
        int max = 0;
        for(int i = 0; i < dp.length; i++){
            if(max < dp[i]) max = dp[i];
        }

        System.out.println(max);
    }


}
