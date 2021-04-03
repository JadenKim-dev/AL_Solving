package Programmers.Level2;

import java.util.*;

public class Country_124 {
    static String solution(int n) {
        String ans = "";
        while(n > 0) {
            if(n%3 == 0) {
                ans = "4" + ans;
                n = n/3-1;
            }
            else {
                ans = Integer.toString(n%3) + ans;
                n /= 3;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
