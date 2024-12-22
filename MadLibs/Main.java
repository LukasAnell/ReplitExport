class Main {
  public static void main(String[] args) {
    String n = "Quandale Dingle";
    String vb = "tag";
    String adj1 = "smelly";
    String f = "bed";
    String adj2 = "humorous";
    String t = "bookshelf";
    String ingV = "tampering";
    String advb = "quickly";
    madLibs(n, vb, adj1, f, adj2, t, ingV, advb);
  }
  public static void madLibs(String name, String verb, String adjective1, String furniture, String adjective2, String thing, String ingVerb, String adverb) {
    System.out.println();
    System.out.println(name + " was walking down a dimly lit street, when he suddenly saw a " + adjective1 + " figure lurking in the shadows.\n");
      System.out.print(name + " called out, \"Who's there?\", but no one answered. All " + name + " saw was a " + thing + " bouncing on the ground, as if someone had just thrown it. ");
    System.out.println(name + " moved closer, " + ingVerb + " " + adverb + ", he noticed a "  + furniture + " out of the corner of his eye. " + name + " wondered how it had gotten there. Looking back at the " + thing + ", " + name + " was " + adjective2 + ".\n");
    System.out.println("As " + name + " walked away, he planned for tomorrow. He was going to go back tomorrow and " + verb + " in the alleyway, and try to find whoever threw the " + thing + " and left the " + furniture + ".");
  }
}