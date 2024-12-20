public class Main {

  //Use to test out your binary search method.
  public static void main(String[] args) {
    int[] nums = {0, 4, 6, 9, 13, 19, 27, 29, 33, 44, 51, 67, 88, 91, 94, 101};
    System.out.println(binarySearch(19, nums)); // 5
    System.out.println(binarySearch(28, nums)); // -1
    System.out.println(binarySearch(101, nums)); // 15
    System.out.println(binarySearch(0, nums)); // 0
    System.out.println(binarySearch(103, nums)); // -1
    System.out.println(binarySearch(-2, nums)); // -1
  }

  /** Implements binary search to return an index 
  * at which target can be found. If target is not 
  * found, returns -1.
  * Precondition: array is not null.
  * Precondition: The elements of array are in numerical order.
  */
  public static int binarySearch(int target, int[] array) {
    int hi = array.length - 1;
    int lo = 0;

    while(hi >= lo) {
      int average = (hi + lo) / 2;

      if(array[average] == target) {
        return average;
      }
      if(array[average] > target) {
        hi = average - 1;
      }
      if(array[average] < target) {
        lo = average + 1;
      }
    }
    return -1;
  }
}