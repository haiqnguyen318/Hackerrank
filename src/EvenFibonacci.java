import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenFibonacci {

  private static BigInteger calculate(long N) {
    if (N < 2) return new BigInteger("0");
    BigInteger[] array = new BigInteger[83];
    array[0] = new BigInteger("1");
    array[1] = new BigInteger("2");
    BigInteger sum = new BigInteger("0");
    
    for (int i = 2; i < 83; i++) {
        array[i] = array[i-1].add(array[i-2]);
        if (array[i].longValue() > N) break;
    }
      
    int i = 1;
    while (array[i] != null && array[i].longValue() < N) {
        sum = sum.add(array[i]);
        i += 3;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long T = in.nextLong();
    for (long t = 0; t < T; t++) {
      long N = in.nextLong();
      BigInteger b = calculate(N);
      System.out.println(b.toString());
    }
  }
}
