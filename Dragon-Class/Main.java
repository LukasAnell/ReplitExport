class Main {
  public static void main(String[] args) {
    Dragon dragon1 = new Dragon("Larry", 381, 918.48, "the hills of Bangladesh");
    System.out.println(dragon1.getName() + " the dragon is " + dragon1.getAge() + " years old.");
      System.out.println(dragon1.getName() + " comes from " + dragon1.getOrigin() + ".");
    System.out.println("His breath is " + dragon1.getBreathTemperature() + " degrees Celcius.");
    System.out.println("Human age: " + dragon1.getHumanAge() + " years old.");
  }
}