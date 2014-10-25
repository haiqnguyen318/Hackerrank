import java.util.*;

public class PairwiseSumDivide {
    private static int solution(int[] array) {
      int sum = 0;
      int ones = 0;
      int twos = 0;
      
      for (int j = 0; j < array.length; j++) {
        if (array[j] == 1) ones++;
        else if (array[j] == 2) twos++;
      }
      
      for (int i = 1; i <= ones; i++) {
        sum += array.length - i;
      }
      
      sum += combination(ones, 2);
      sum += combination(twos, 2);
      return sum;
    }
    
    private static int combination(int n, int k) {
      int numerator = 1;
      int denominator = 1;
      for (int i = n; i > n-k; i--) {
        numerator = numerator * i;
      }
      for (int j = 1; j <= k; j++) {
        denominator = denominator * j;
      }
      return numerator/denominator;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(combination(1,2));
        int T = in.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = in.nextInt();
            int[] ar = new int[N];
            
            for (int n = 0; n < N; n++) {
              ar[n] = in.nextInt();
            }
            
            System.out.println(solution(ar));            
        }
        in.close();
    }
}