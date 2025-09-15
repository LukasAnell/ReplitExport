public class Cone{
  private double radius;
  private double height;
  public Cone(double r, double h) {
    radius = r;
    height = h;
  }
  public void grow(double mult) {
    height *= mult;
  }
  public double getVolume() {
    return ((Math.pow(radius, 2) * Math.PI * height) / 3);
  }
}