import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NthPrime {
    private static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int divisor = 3;
        while (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) return false;
            divisor += 2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
       
        //sieve of Erastothenes, based on the constraint that N <= 10^4
        boolean[] marked = new boolean[2000000];
        for (int k = 2; k < marked.length; k++) {
          if (marked[k]) continue;
          else {
            int prime = k;
            for (int j = 2*k; j < marked.length; j += k) {
              marked[j] = true;
            }
          }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int N = in.nextInt();
            int ct = 0;
            int idx = 1;
            while (ct < N) {
              idx++;
              if (!marked[idx]) ct++; 
            }
            sb.append(idx + "\n");
        }
        in.close();
        System.out.println(sb.toString());
    }
}