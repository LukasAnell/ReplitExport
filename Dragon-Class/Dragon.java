public class Dragon {
  private String name;
  private int age;
  private double breathTemperature;
  private String origin;
  public Dragon(String n, int a, double b, String o) {
    name = n;
    age = a;
    breathTemperature = b;
    origin = o;
  }
  public String getName() {
    return name;
  }
  public void setName(String newName) {
    name = n;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int newAge) {
    age = a;
  }
  public double getBreathTemperature() {
    return breathTemperature;
  }
  public void setBreathTemperature(double newTemp) {
    breathTemperature = b;
  }
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String newOrigin) {
    origin = o;
  }
  public int getHumanAge() {
    return age / 25;
  }
}