//This is the class that runs the story.
public class Main {
  public static void main(String[] args)
    {
        System.out.println("hi");
        
        System.out.println("hit enter to continue");
        UserInput.getLine();
        System.out.println("\n");
        
        //The following two lines of code start the example story.
        //You should comment them out and replace with your own!
        MyStory s = new MyStory();
        s.start();
    }
}