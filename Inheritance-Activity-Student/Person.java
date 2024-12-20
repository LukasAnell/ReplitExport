public class Person {
  private String name;
  private int age;
  
  public Person(String n, int a) {
    name = n;
    age = a;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public int getAge() {
    return age;
  }

  public void birthday() {
    age++;
  }

  public String toString() {
    return name + " is " + age + " years old";
  }
}