public class Student extends Person {
  private int gradeLevel;
  
  public Student(String n, int a, int g) {
    super(n, a);
    gradeLevel = g;
  }

  public int getGradeLevel() {
    return gradeLevel;
  }

  public void summer() {
    gradeLevel++;
  }

  public String toString() {
    return super.toString() + " and is in grade " + gradeLevel;
  }
}