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
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int N = in.nextInt();
          
            if (N == 1) {
              sb.append(2 + "\n");
            } 
            
            else {
              int ct = 2;
              int number = 3;
              while (ct < N) {
                number += 2;
                if (isPrime(number)) {
                  ct++;
                }
              }
              sb.append(number + "\n");
            }
        }
        in.close();
        System.out.println(sb.toString());
    }
}