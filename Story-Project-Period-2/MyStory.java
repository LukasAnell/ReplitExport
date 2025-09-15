//Write your own adventure story here!

public class MyStory
{
    //Your story needs at least one instance variable
    //based off of which the ending changes.
  private int timesPunched;
  private int timesRestarted;

    //Your story needs a constructor which gets called
    //in the Main method.
  public MyStory() {
    timesPunched = 0;
    timesRestarted = 0;
  }

    //Write several methods that print your story out, like
    //in the ShorrStory example!
  public void start() {
    System.out.println("\nYou are walking to work when you hear a strange sound coming from your right. You see an alleyway with a few abandoned storefronts.");
    wait(500);
    System.out.println("\nWill you continue to work or peel off into the alley to investigate the sound?");
    String input = UserInput.getValidInput("work", "continue", "continue to work", "peel off", "peel off into the alley", "peel off into the alley to investigate", "peel off into the alley to investigate the sound", "investigate");
    if(input.equals("work") || input.equals("continue") || input.equals("continue to work")) {
      wait(500);
      work();
    }
    else {
      wait(500);
      investigate();
    }
  }
  private void work() {
    System.out.println("\nYou continue to work, the sound getting quieter. You continue walking past storefronts with \nexotic items, whistling an upbeat tune. You arrive at work, where there is a group of men dressed in black garbs, holding sharp objects.");
    wait(500);
    System.out.println("\nWill you walk towards them or run away?");
    String input = UserInput.getValidInput("walk towards them", "walk", "run", "run away");
    if(input.equals("walk towards them") || input.equals("walk")) {
      wait(500);
      kidnapping();
    }
    else {
      wait(500);
  System.out.println("\nYou try to run away, but one of the men throws an axe at your head and you die. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
  }
  private void kidnapping() {
    System.out.println("\nYou look around, taking in your surroundings. You must have been out for a while, because the faint beam of light coming from the ceiling is now orange. Confused, you get up, but are hit by a wave of dizziness and nausea.");
    wait(500);
    System.out.println("\nWill you go back to sleep or explore the room?");
    String input = UserInput.getValidInput("go back to sleep", "sleep", "go back", "explore", "explore the room");
    if(input.equals("go back to sleep") || input.equals("sleep") || input.equals("go back")) {
      wait(500);
      System.out.println("\nYou go back to sleep, having wild dreams of living in the upper class, partying and having fun all the time. Unfortunately, your nausea was caused by a deadly drug, so you die in your sleep. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      box();
    }
  }
  private void box() {
    System.out.println("\nYou get up, fighting back the nausea. As you struggle to stand, a shiny box catches your eye. You hobble over to it, using the wall as support, and open it. Inside, there are three items: a pill, a syringe, and a knife.");
    wait(500);
    System.out.println("\nWhich item will you take: the pill, the syringe, or the knife?");
    String input = UserInput.getValidInput("the pill", "pill", "the syringe", "syringe", "the knife", "knife");
    if(input.equals("the pill") || input.equals("pill")) {
      wait(500);
      System.out.println("\nYou pick up the pill, but don't have a place to put it. You being a smart individual, decide to put it in your mouth. Unfortunately, the pill is easily broken and releases a deadly toxin into your mouth, killing you instantly. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else if(input.equals("the syringe") || input.equals("syringe")) {
      wait(500);
      System.out.println("\nYou take the syringe, carefully examining it. You don't have anywhere to put, so you inject yourself. What you don't know is that the syringe has a new form of adrendaline in it, designed to accelerate nail growth. As your fingernails start rapidly growing, you remember the scratches, and scream in pain, realizing your terrible fate. An alarm blares, and armored men shuffle into the room, armed with guns. They start shooting you, hitting you all over your body. You die, the end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      wood();
    }
  }
  private void wood() {
    System.out.println("\nYou grab the knife, swinging it around, and head back to the chair. Approaching the chair, you \nare intrigued by a an irregularity in the grain, so you start picking at it. As soon as you begin, an alarm starts blaring.");
    wait(500);
    System.out.println("\nWill you dig deeper into the wood or will you look up?");
    String input = UserInput.getValidInput("dig deeper", "dig", "deeper", "dig deeper into the wood", "wood", "dig into the wood", "look up", "up", "look");
    if(input.equals("look up") || input.equals("look") || input.equals("up")) {
      wait(500);
      food();
    }
    else {
      wait(500);
      intersection();
    }
  }
  private void food() {
    System.out.println("\nYou look up and find yourself in a new room. Confused, you look around, confirming that your surroundings have changed. You are in a lavishly decorated suite, surrounded by gold lining and leather couches. Your eyes bug out, you've never seen anything close to this level of luxury. You're alone so you relax, running around the large rooms and jumping on the various beds and couches. You venture into the kitchen, and find a large platter of food with a note on it.");
    wait(500);
    System.out.println("\nWill you read the note or eat the food?");
    String input = UserInput.getValidInput("read the note", "read", "note", "eat", "eat the food", "food");
    if(input.equals("eat the food") || input.equals("eat") ||input.equals("food")) {
      wait(500);
      System.out.println("\nYou devour the food, eating meat, vegetables (though not as many as your mom would like), potatoes, and fruits. After you are sated, you discover that the note was eaten during your feast. Not troubled, you lay down on a couch and take a nap to sleep off the food. When you wake up, you start exploring more, searching for a way out. You find your way to a balcony, and see the lower caste buildings below. You fling yourself off. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      escape();
    }
  }
  private void escape() {
    System.out.println("\nThe text on the note says \"You are currently in the Upper Mons District, in the largest estate on Mars. It is packed with the highest technology security system, so do not try to escape. You have 24 hours to live your life to the fullest before we come and kill you for intruding on us.\"");
    wait(500);
    System.out.println("\nWill you try to escape or live your life?");
    String input = UserInput.getValidInput("escape", "try to escape", "live your life", "live my life", "live");
    if(input.equals("live your life") || input.equals("live my life") || input.equals("live")) {
      wait(500);
      System.out.println("\nYou relax, eating whatever you want, sleeping, gaming, and watching the view. You stay in the house until the men come to get you the next day. You are taken away in a limousine to an executin center. There you are strapped into an electric chair and zapped to death. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      toiletPaper();
    }
  }
  private void intersection() {
    System.out.println("\nYou dig deeper into the wood, exploring the grains and divots in it. As you cut deep grooves into the grain, you notice a pattern going against the grain. Following it with the tip of your knife, you reach a dead end. Searching for more, you search a different part of the chair, and find another pattern. You find the point where they intersect and start stabbing it. Glancing up, you see a line of men standing in front of you, holding guns and wearing riot gear. But they are not attacking, just standing and staring at you.");
    wait(500);
    System.out.println("\nWill you approach the men or continue picking at the chair?");
    String input = UserInput.getValidInput("approach", "approach the men", "continue", "continue picking", "continue picking at the chair");
    if(input.equals("continue") || input.equals("continue picking") || input.equals("continue picking at the chair")) {
      wait(500);
      sphere();
    }
    else {
      wait(500);
      frequency();
    }
  }
  private void sphere() {
    System.out.println("\nYou dig even deeper into the wood, and feel a scraping sound, as if it is metal. Moving your knife out of the way, you catch a glimpse of a metal object. As you work through the hours, you get closer to extracting the metal device. Finally, you pick away the last large piece of wood and pull out a shiny metal sphere.");
    wait(500);
    System.out.println("\nWill you open the sphere or throw it?");
    String input = UserInput.getValidInput("open the sphere", "open", "sphere", "throw it", "throw", "throw the sphere");
    if(input.equals("throw it") || input.equals("throw") || input.equals("throw the sphere")) {
      wait(500);
      System.out.println("\nYou chuck the sphere across the room, using all of your strength to get a lot of impact force. It opens up, spilling out a purple gas, which then ignites. The end");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      food();
    }
  }
  private void frequency() {
    System.out.println("\nYou stand up and slowly walk over to the men, eyeing them curiously. They seem to be frozen in midair, their bodies barely vibrating as they struggle to escape. You see their beady eyes following you across the room, and the hair on your arms stands up. As you get closer, you notice a frequency being played from behind them.");
    wait(500);
    System.out.println("\nApproach the sound or try to wake up one of the men?");
    String input = UserInput.getValidInput("approach", "approach the sound", "sound", "try to wake up one of the men", "wake up", "try to wake up");
    if(input.equals("approach") || input.equals("approach the sound") || input.equals("sound")) {
      wait(500);
      System.out.println("\nYou approach the sound in a cautioned stance, ready to run away at the slightest bit of danger.  As soon as you cross the line of men, the sound explodes into your ears. You try to run away, but you are stuck in place. As the sound drones on, the vibrations become unbearable and you die. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      System.out.println("\nYou grab one of the men by his pants, gently tugging on him to wake him up or get him out of this frozen state. You feel a steady vibration pulsing through the man, so you back up and grab the chair. You pick up the chair and throw it at the man, knocking him out of the frozen state. He stands up hastily, losing his balance. You rush over to support him, and he thanks you. You question him, asking about the guard situation. He denies hostility, saying that they were there to protect the rest of the facility from you in case you turned hostile. You lunge at him, overtaken by pure instinct: to kill; to eat. You chase him around him around the room, growling and foaming. He turns around and shoots you in the head, killing you. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
  }
  private void investigate() {
    System.out.println("\nYou are led down an alleyway, where you see an abandoned storefront.");
    wait(500);
    System.out.println("\nWill you walk in or walk away?");
    String input = UserInput.getValidInput("walk in", "walk away");
    if(input.equals("walk away")) {
      wait(500);
      System.out.println("\nYou try to walk away, but a piano is dropped onto you, effectively killing you. The end.");
    }
    else {
      wait(500);
      stuck();
    }
  }
  private void stuck() {
    System.out.println("\nYou stroll into the shop, the door roughly closing behind you. You find yourself in a cylindrical room, with stone walls and a faint beam of light coming from above.");
    wait(500);
    System.out.println("\nYou look behind you, but the door has been replaced by a smooth wall of stone. Walking around, you notice scratches on the walls, as if they were made by a creature with large claws. You continue to look around, and notice a shiny box. Looking inside, you see a pill, a syringe, and a knife.");
    System.out.println("\nWhich item will you take: the pill, the syringe, or the knife?");
    String input = UserInput.getValidInput("the pill", "pill", "the syringe", "syringe", "the knife", "knife");
    if(input.equals("the pill") || input.equals("pill")) {
      wait(500);
      System.out.println("\nYou pick up the pill, but don't have a place to put it. You being a smart individual, decide to put it in your mouth. Unfortunately, the pill is easily broken and releases a deadly toxin into your mouth, killing you instantly. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else if(input.equals("the syringe") || input.equals("syringe")) {
      wait(500);
      System.out.println("\nYou take the syringe, carefully examining it. You don't have anywhere to put, so you inject yourself. What you don't know is that the syringe has a new form of adrendaline in it, designed to accelerate nail growth. As your fingernails start rapidly growing, you remember the scratches, and scream in pain, realizing your terrible fate. An alarm blares, and armored men shuffle into the room, armed with guns. They start shooting you, hitting you all over your body. You die, the end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      wood();
    }
  }
  private void toiletPaper() {
    System.out.println("\nYou start scouting out the compound, marking the positions of security cameras, drawing a schematic of the house, and finding power sources for devices. You spend 12 hours doing this, so you must hurry if you want to execute your plan. You gather all necessary materials: a wrench, toilet paper (just in case), a plunger, a hammer, a spoon (to eat with), and knife. With these you will be able to break out of the house, but first, you must eat. You feast on your favorite food, Cocoa Puff cereal. You eat your fill, and spring up, ready to escape. With 4 hours left, you carefully avoid every security camera, refrencing the map that you made hours before. You walk over to the weakest part of the fence, and throw a rock on it to test the strength. It goes through, meaning you are able to pass it with minor injuries. Mustering up your courage, you go headfirst, and come out the other side completely unscathed. You still have a large wall to get over and a group of guards to sneak past, so you start working. With your hammer, you drive nails into the wall, slowly making your way to the top. When you get up, there are only 2 hours left. You throw your toilet paper at the guards around you, in an attempt to blind them.");
    System.out.println("\nYour attempt fails, so now there is 6 guards looking directly at you.");
    System.out.println("\nWill you jump down and fight them or try to run away?");
    String input = UserInput.getValidInput("jump", "jump down", "jump down and fight them", "fight", "run away", "run");
    if(input.equals("run away") || input.equals("run")) {
      wait(500);
      System.out.println("\nYou try to run away, but the guards activate a lockdown of the facility, so guns come out of the walls. You try to dodge the bullets but you get hit and die. The end.");
      timesRestarted++;
      wait(500);
      start();
    }
    else {
      wait(500);
      fight();
    }
  }
  private void fight() {
    timesPunched = (int) Math.random() * 10 + 2;
    System.out.println("\nYou jump down to fight the guards, confident in your fists. As you land, the guards start running towards you. You ready yourself for the onslaught of attacks coming, and start waving your fists everywhere.");
    System.out.println("\nYou come out of a pile of guards on the floor, having successuflly gotten past all of them, and clutch your chest and arms. You are hurt, and took " + timesPunched + " punches.");
    if(timesPunched >= 6) {
      System.out.println("\nYou try to walk away, but you collapse in pain from the damage caused by the punches, and die. The end.");
      timesRestarted++;
      wait(500);
      start();
    } else {
      System.out.println("\nYou are barely able to get away, but you overcome your injuries and are able to live the rest of your life hiding out in the Upper Mons District.");
      wait(2000);
      System.out.println("\nYou win!");
      wait(1000);
      System.out.println("You restarted " + timesRestarted + " times");
      System.out.println("\nStory created by Lukas Anell and Brandon Chung");
    }
  }


    /** This method is provided for you to use to make
    *  the text pause. It causes a delay for the number
    *  of milliseconds provided as an argument. */
    private void wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
}
