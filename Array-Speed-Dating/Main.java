import java.util.Arrays;
class Main{
  public static void main(String[] args){
    int[] nums = {5, 6, 29, 17, 0, 21, 6};
    arraySpeedDatingQ4A(nums);
    System.out.println();
    String[] words = {"hello", "bye", "how", "yes", "no", "sebastian", "reeeee", "mr guiou"};
    arraySpeedDatingQ4B(words);
    System.out.println();
    System.out.println(Arrays.toString(arraySpeedDatingQ5(nums)));
    System.out.println();
    System.out.println(Arrays.toString(arraySpeedDatingQ6(words)));
    System.out.println();
    String[] myList = {"apple", "apple", "apple", "song", "song", "finch", "scrumptious", "finch"};
    arraySpeedDatingQ7(myList);
    String[] myList2 = {"apple", "apple", "apple", "song", "song", "finch", "scrumptious", "finch", "apple"};
    arraySpeedDatingQ7(myList2);
  }
  
  public static void arraySpeedDatingQ4A(int[] nums){
    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i]);
      if(i != nums.length - 1) {
        System.out.print("/\\/\\/\\");
      }
    }
  }
  
  public static void arraySpeedDatingQ4B(String[] exclamations) {
    for(String word : exclamations) {
      System.out.println(word + "!!!");
    }
  }
  
  public static int[] arraySpeedDatingQ5(int[] nums) {
    int temp = nums[5];
    nums[5] = 0;
    for(int i = 6; i < nums.length - 1; i++) {
      int tempNum = nums[i];
      nums[i] = nums[i + 1];
      nums[i + 1] = tempNum;
    }
    return nums;
  }
  
  public static String[] arraySpeedDatingQ6(String[] nonsense) {
    for(int i = 3; i < nonsense.length - 1; i++) {
      nonsense[i + 1] = nonsense[i];
    }
    nonsense[3] = "snarf";
    return nonsense;
  }
  
  public static void arraySpeedDatingQ7(String[] myList) {
    String previous = myList[0];
    int count = 0;
    for(int i = 1; i < myList.length; i++) {
      if(myList[i] != previous) {
        previous = myList[i];
      } else {
        count++;
      }
    }
    System.out.println(count);
  }

  public static arraySpeedDatingQ8(Pokemon[] dex) {
    int count = 0;
    for(Pokemon pokemon : dex) {
      if(pokemon.getPrimaryType().equals("Ice")) {
        count++;
      }
    }
    System.out.println(count);
  }
}