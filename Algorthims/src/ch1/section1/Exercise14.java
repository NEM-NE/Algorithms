package ch1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
    public static void main(String[] args) {
        int answer = lg(8);
        StdOut.println(answer);
    }

    static int lg(int N){
        int num = N;
        int cnt = 0;

        while((num/2) > 0 ){
            cnt++;
            num = num/2;
        }

        return cnt;
    }
}
