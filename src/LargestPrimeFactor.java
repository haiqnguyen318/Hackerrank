import java.util.Scanner;


public class LargestPrimeFactor {
  private static boolean isPrime(long n) { 
    if (n % 2 == 0) return false;
    else {
      long divisor = 3;
      while (divisor <= Math.sqrt(n)) {
        if (n % divisor == 0) return false;
        divisor += 2;
      }
      return true;
    }
  }
  
  private static long largestPrimeFactor(long n) {
    if (isPrime(n)) return n;
    else {
      if (n % 2 == 0) return largestPrimeFactor (n/2);
      else {
        long divisor = 3;
        while (n % divisor != 0)
          divisor += 2;
        return largestPrimeFactor(n/divisor);
      }
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int t = 0; t < T; t++) {
      long N = in.nextLong();
      System.out.println(largestPrimeFactor(N));
    }
  }

}
