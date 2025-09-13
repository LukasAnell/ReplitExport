public class NumberSystem {
  public static void main(String[] args) {
    reduceFraction(30, 3);
    reduceFraction(8, 20);
    reduceFraction(24, 9);
    reduceFraction(7, 3);
  }
  
  /** Precondition: a and b are positive integers.
  * Returns the greatest common factor of a and b, as described in part (a).
  */
  public static int gcf(int a, int b) {
    if(a % b != 0) {
      return gcf(b, a % b);
    }
    return b;
  }
  /** Precondition: numerator and denominator are positive integers.
  * Reduces the fraction numerator / denominator
  * and prints the result, as described in part (b).
  */
  
  public static void reduceFraction(int numerator, int denominator) {
    if(numerator % denominator == 0) {
      System.out.println(numerator + "/" + denominator + " reduces to " + numerator / denominator);
    } else {
      int gcf = gcf(numerator, denominator);
      System.out.println(numerator + "/" + denominator + " reduces to " + numerator / gcf + "/" + denominator / gcf);
    }
  }
}