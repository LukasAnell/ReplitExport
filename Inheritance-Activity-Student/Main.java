class Main {
  public static void main(String[] args) {
    Student william = new Student("William", 15, 10);
    System.out.println(william.getAge());
    System.out.println(william.getName());
    william.birthday();
    System.out.println(william.getAge());
    william.setName("Will");
    System.out.println(william.getName());
    System.out.println(william.toString());
    System.out.println(william.getGradeLevel());
    william.summer();
    System.out.println(william.getGradeLevel());
  }
}