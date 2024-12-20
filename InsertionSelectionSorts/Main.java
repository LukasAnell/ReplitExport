public class Main {
  public static void main(String[] args) {
    int[] nums = {81, 71, 42, 50, 71, 54, 17, 61, 98};
    System.out.print("[ ");
    for(int num : nums)
    {
      System.out.print(num + " ");
    }
    System.out.print("]\n");

    //run either Insertion or Selection Sort!
    // insertionSort(nums);
    selectionSort(nums);
    
    // bogoSort(nums);
    // int shuffles = 201;
    // while(shuffles != 1) {
    //   int[] nums2 = {81, 71, 42, 50, 71, 54, 17, 61, 98};
    //   shuffles = bogoSort(nums2);
    //   if(shuffles < 20) {
    //     System.out.println("shuffles: " + shuffles);
    //   }
    // }
    // System.out.println("shuffles: " + shuffles);
    
    // prints the order
    System.out.print("[ ");
    for(int num : nums)
    {
      System.out.print(num + " ");
    }
    System.out.print("]\n");
  }


  /**
  * Implement Insertion Sort with an array of int. You do not 
  * need to return the array, simply reorder the elements in it.
  * Precondition: numbers is not null
  * Postcondition: The elements of numbers are in numerical order
  */
  public static void insertionSort(int[] numbers) {
    for(int i = 1; i < numbers.length; i++) {
      for(int j = i - 1; j >= 0; j--) {
        int k = j + 1;
        if(numbers[k] < numbers[j]) {
          int temp = numbers[j];
          numbers[j] = numbers[k];
          numbers[k] = temp;
        }
      }
    }
  }

  /**
  * Implement Selection Sort with an array of int. You do not 
  * need to return the array, simply reorder the elements in it.
  * Precondition: numbers is not null
  * Postcondition: The elements of numbers are in numerical order
  */
  public static void selectionSort(int[] numbers) {
    for(int i = 0; i < numbers.length; i++) {
      int s = i;
      for(int j = i + 1; j < numbers.length; j++) {
        if(numbers[j] < numbers[s]) {
          s = j;
        }
      }
      if(i != s) {
        int temp = numbers[s];
        numbers[s] = numbers[i];
        numbers[i] = temp;
      }
    }
  }

  public static int bogoSort(int[] numbers) {
    int count = 0;
    while(!isSorted(numbers)) {
      for(int i = 1; i < numbers.length; i++) {
        int rand = (int) (Math.random() * i);
        int temp = numbers[i];
        numbers[i] = numbers[rand];
        numbers[rand] = temp;
      }
      count++;
    }
    return count;
  }

  public static boolean isSorted(int[] array) {
    for (int i = 1; i < array.length; i++)
      if (array[i] < array[i - 1]) {
        return false;
      }
    return true;
  }
}