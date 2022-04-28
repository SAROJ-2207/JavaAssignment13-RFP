public class MaximumNumber {
  // determines the largest of three Comparable objects
  public static <M extends Comparable<M>> T maximum(M x, M y, M z) {
    M max = x; // assume x is initially the largest

    if (y.compareTo(max) > 0)
      max = y; // y is the largest so far

    if (z.compareTo(max) > 0)
      max = z; // z is the largest

    return max; // returns the largest object
  } // end method maximum

  public static void main(String args[]) {
    System.out.print("Maximum of %d, %d and %d is %d\n\n", 7, 2, 6, maximum(7, 2, 6));
  }
}