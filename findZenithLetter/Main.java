class Main {
  public static void main(String[] args) {
    System.out.println(findZenithLetter("Hello everyone!"));
  }
  public static String findZenithLetter(String str) {
        if(str.length() == 1) {
            return str.substring(0, 1);
        } if(str.substring(0, 1).compareTo(str.substring(1, 2)) > 0) {
            return findZenithLetter(str.charAt(0) + str.substring(2));
        } else {
            return findZenithLetter(str.substring(1));
        }
    }
}