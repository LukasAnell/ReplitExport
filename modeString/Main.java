import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("Yo");
    list.add("Hello");
    list.add("Sup");
    list.add("Hello");
    list.add("Brandon");
    list.add("William");
    list.add("Shake");
    list.add("Spear");
    list.add("Sup");
    list.add("Hello");
    list.add("Util");
    System.out.println(modeString(list));
  }

  public static String modeString(ArrayList<String> list) {
    int highestCount = 0;
    int currentCount = 0;
    String out = "";
    for(int i = 0; i < list.size(); i++) {
      for(int j = i; j < list.size(); j++) {
        if(list.get(i).equals(list.get(j))) {
          currentCount++;
        }
      }
      if(currentCount > highestCount) {
        highestCount = currentCount;
        out = list.get(i);
      }
      currentCount = 0;
    }
    return out;
  }
}