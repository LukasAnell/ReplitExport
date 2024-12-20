import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    String[] array = {"hello", "bye", "yellow", "william"};
    System.out.println(findIndex("bye", array));
  }

  // O(n)
  public static int findIndex(String target, String[] array) {
    for(int i = 0; i < array.length; i++) {
      if(array[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  // O(log(n))
}