class Main {
  public static void main(String[] args) {
    Cone trafficCone = new Cone(2, 3);
    System.out.println(trafficCone.getVolume());
    trafficCone.grow(7.5);
    System.out.println(trafficCone.getVolume());
  }
}