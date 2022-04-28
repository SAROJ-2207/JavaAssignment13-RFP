public class MaxNumPosition {
  // determines the largest of three Comparable objects
  public static <M extends Comparable<M>> M maximum(M x, M y, M z) {
    M max = x; // assume x is initially the largest

    if (y.compareTo(max) > 0)
      max = y; // y is the largest so far

    if (z.compareTo(max) > 0)
      max = z; // z is the largest

    return max; // returns the largest object
  } // end method maximum

  public static void main(String args[]) {
 
    System.out.print("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 5.5, 4.4, 9.9 , maximum(5.5,4.4,9.9));
   
  }
}