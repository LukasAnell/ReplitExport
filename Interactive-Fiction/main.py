import random
import time
from colorama import Fore, Back, Style
def intro():
  print("You are walking to work when you hear a strange sound coming from your right. \n You see an alleyway with a few abandoned storefronts. Will you continue to \n work or peel off into the alley to investigate the sound?\n\n")
  answer = input("You can choose to continue or investigate: ").lower()
  if answer == "continue": 
      print("You chose to continue")
      continue_scene()
  elif answer == "investigate":
      print("You chose to investigate")
      investigate_scene()
  else:
      print("I don't understand.")
      print(answer + " isn't an option.\n")
      intro()

def continue_scene():
  print("You continue to work, the sound getting quieter. You continue walking past storefronts with \nexotic items, whistling an upbeat tune. You arrive at work, where there is a group of men \ndressed in black garbs, holding sharp objects.")
  answer = input("Will you walk towards them or run away?\n").lower()
  if answer == "walk towards them":
    print("You walk towards them confidently, looking at your co-workers and their scared faces. Not fazed by the mood, you try to nudge past the men in black. They swarm around you and put a damp bag \nover your head, grunting loudly in the process. You are knocked out while being dragged away, \nand wake up in a cylindrical room.") # correct
    kidnapping_scene()
  elif answer == "run away":
    print("You try to run away, but one of the men throws an axe at your head and you die. The end.\n") # die
    intro()
  elif answer == "rubber duck":
    if random.random() < 0.01:
        print("You walk straight past them, continuing to work. You finish your workday and go home, ready to \nrelax. At home, you have dinner with your family and go on to live a fulfilling life. The end!")
    else:
      continue_scene()
      
  else:
      print("I don't understand.")
      print(answer + " isn't an option.")
      continue_scene()

def investigate_scene():
  print("You are led down an alleyway, where you see an abandoned storefront.")
  answer = input("Will you walk in or walk away?\n").lower()
  if answer == "walk in":
    print("You stroll into the shop, the door roughly closing behind you. You find yourself in a \ncylindrical room, with stone walls and a faint beam of light coming from above.") #correct
    stuck_scene()
  elif answer == "walk away":
    print("You try to walk away, but a piano is dropped onto you, effectively killing you. The end.\n") # die
    intro()
  else:
    print("I don't understand.")
    print(answer + " isn't an option.")
    investigate_scene()

def kidnapping_scene():
  print("You look around, taking in your surroundings. You must have been out for a while, because the \nfaint beam of light coming from the ceiling is now orange. Confused, you get up, but are hit by a wave of dizziness and nausea.")
  answer = input("Will you go back to sleep or explore the room?\n").lower()
  if answer == "go back to sleep":
    print("You go back to sleep, having wild dreams of living in the upper class, partying and having fun all the time. Unfortunately, your nausea was caused by a deadly drug, so you die in your sleep. The end. \n") #die
    intro()
  elif answer == "explore the room":
    print("You get up, fighting back the nausea. As you struggle to stand, a shiny box catches your eye. You hobble over to it, using the wall as support, and open it. Inside, there are three items: a pill, a syringe, and a knife.") 
    # correct
    box_scene()
  else:
    print("I don't understand.")
    print(answer + " isn't an option.")
    kidnapping_scene()

def stuck_scene():
  print("You look behind you, but the door has been replaced by a smooth wall of stone. Walking around,\n you notice scratches on the walls, as if they were made by a creature with large claws. You \ncontinue to look around, and notice a shiny box. Looking inside, you see a pill, a syringe, and a knife.")
  answer = input("Which item will you take: the pill, the syringe, or the knife?\n").lower()
  if answer == "pill":
    print("You pick up the pill, but don't have a place to put it. You being a smart individual, decide to put it in your mouth. Unfortunately, the pill is easily broken and releases a deadly toxin into your mouth, killing you instantly. The end.\n") # die
    intro()
  elif answer == "syringe":
    print("You take the syringe, carefully examining it. You don't have anywhere to put, so you inject yourself. What you don't know is that the syringe has a new form of adrendaline in it, designed to \naccelerate nail growth. As your fingernails start rapidly growing, you remember the scratches, \nand scream in pain, realizing your terrible fate. An alarm blares, and armored men shuffle into the room, armed with guns. They start shooting you, hitting you all over your body. You die, the end.\n") # die
    intro()
  elif answer == "knife":
    print("You grab the knife, swinging it around, and head back to the chair. Approaching the chair, you \nare intrigued by a an irregularity in the grain, so you start picking at it. As soon as you \nbegin, an alarm starts blaring.")
    # correct
    wood_scene()
  else:
    print("I don't understand.")
    print(answer + " isn't an option")
    stuck_scene()

def box_scene():
  answer = input("Which item will you take: the pill, the syringe, or the knife?\n").lower()
  if answer == "pill":
    print("You pick up the pill, but don't have a place to put it. You being a smart individual, decide to put it in your mouth. Unfortunately, the pill is easily broken and releases a deadly toxin into your mouth, killing you instantly. The end.\n") # die
    intro()
  elif answer == "syringe":
    print("You take the syringe, carefully examining it. You don't have anywhere to put, so you inject yourself. What you don't know is that the syringe has a new form of adrendaline in it, designed to \naccelerate nail growth. As your fingernails start rapidly growing, you remember the scratches, \nand scream in pain, realizing your terrible fate. An alarm blares, and armored men shuffle into the room, armed with guns. They start shooting you, hitting you all over your body. You die, the end.\n") # die
    intro()
  elif answer == "knife":
    print("You grab the knife, swinging it around, and head back to the chair. Approaching the chair, you \nare intrigued by a an irregularity in the grain, so you start picking at it. As soon as you \nbegin, an alarm starts blaring.")
    # correct
    wood_scene()
  else:
    print("I don't understand.")
    print(answer + " isn't an option")
    stuck_scene()

def wood_scene():
  answer = input("Will you dig deeper into the wood or will you look up?\n").lower()
  if answer == "dig deeper":
    print("You dig deeper into the wood, exploring the grains and divots in it. As you cut deep \ngrooves into the grain, you notice a pattern going against the grain. Following it with the tip of your knife, you reach a dead end. Searching for more, you search a different part of the \nchair, and find another pattern. You find the point where they intersect and start stabbing it. Glancing up, you see a line of men standing in front of you, holding guns and wearing riot gear. But they are not attacking, just standing and staring at you.") # correct
    intersection_scene()
  elif answer == "look up":
    print("You look up and find yourself in a new room. Confused, you look around, confirming that your \nsurroundings have changed. You are in a lavishly decorated suite, surrounded by gold lining and leather couches. Your eyes bug out, you've never seen anything close to this level of luxury. \nYou're alone so you relax, running around the large rooms and jumping on the various beds and \ncouches. You venture into the kitchen, and find a large platter of food with a note on it.") # correct
    food_scene() 
  else:
    print("I don't understand.")
    print(answer + " isn't an option")
    wood_scene()

def intersection_scene():
  answer = input("Will you approach the men or continue picking at the chair?\n").lower()
  if answer == "approach the men": 
    print("You stand up and slowly walk over to the men, eyeing them \ncuriously. They seem to be frozen in midair, their bodies barely vibrating as they struggle to escape. You see their beady eyes following \nyou across the room, and the hair on your arms stands up. As you get closer, \nyou notice a frequency being played from behind them. ") # correct
    frequency_scene()
  elif answer == "continue picking":
    print("You dig even deeper into the wood, and feel a scraping sound, as if it is metal. Moving your \nknife out of the way, you have a glimpse of a metal object. As you work through the hours, you get closer to \nextracting the metal device. Finally, you pick away the last large piece of wood and pull out a shiny metal sphere.") # correct
    sphere_scene()
  else:
    print("I don't understand.")
    print(answer + " isn't an option")
    intersection_scene()

def food_scene():
  answer = input("Will you read the note or eat the food?\n").lower()
  if answer == "read the note":
    print('The text on the note says "You are currently in the Upper Mons District, in the largest estate on Mars. It is packed with the \nhighest technology security system, so do not try to escape. You have 24 hours to \nlive your life to the fullest before we come and kill you for intruding on us." ') # correct
    escape_scene()
  elif answer == "eat the food":
    print("You devour the food, eating meat, vegetables (though not as many as your mom would like), potatoes, and fruits. \nAfter you are sated, you discover that the note was eaten during your feast. Not troubled, you lay down on a couch and take a nap to \nsleep off the food. When you wake up, you start exploring more, searching for a way out. You find your way to a balcony, and see the lower caste \nbuildings below. You fling yourself off. The end.\n") # die
    intro()
  else:
    print("I don't understand.")
    print(answer + " isn't an option.")
    food_scene()

def frequency_scene():
  answer = input("Approach the sound or try to wake up one of the men?\n").lower()
  if answer == "approach the sound":
    print("You approach the sound in a cautioned stance, ready to run away at the slightest bit of \ndanger.  As soon as you cross the line of men, the sound explodes into your ears. You try to run away, but you are stuck in place. As the sound drones on, the \nvibrations become unbearable and you die. The end.") # die
    intro()
  elif answer == "try to wake up one of the men":
    print("You grab one of the men by his pants, gently tugging on him to wake him up or get him out of this frozen state. \nYou feel a steady vibration pulsing through the man, so you back up and grab the chair. You pick up the chair and throw it at the man, \nknocking him out of the frozen state. He stands up hastily, losing his balance. You rush over to support him, and he thanks you. You question him, \nasking about the guard situation. He denies hostility, saying that they were there to protect the rest of the facility from you in case you turned hostile. \nYou lunge at him, overtaken by pure instinct: to kill; to eat. You chase him around him around the room, growling and foaming. He turns around and shoots you in the head, killing you. The end.\n") # die
    intro()
  else:
    print("I don't understand.")
    print(answer + " isn't an option.")
    frequency_scene()

def sphere_scene():
  answer = input("Will you open the sphere or throw it?\n").lower()
  if answer == "open the sphere":
    print("You crack open the sphere, and are teleported away.")
    food_scene()
  elif answer == "throw the sphere":
    print("You chuck the sphere across the room, using all of your strength to get a lot of impact force. \nIt opens up, spilling out a purple gas, which then ignites. The end\n") # die
    intro()
  else:
    print("I don't understand.")
    print(answer + " isn't an option.")
    sphere_scene()

def escape_scene():
  answer = input("Will you try to escape or live your life?\n").lower()
  if answer == "try to escape":
    print("You start scouting out the compound, marking the positions of security cameras, drawing a schematic\n of the house, and finding power sources for devices. You spend 12 hours doing this, so you must hurry if you want to execute your plan. You gather all necessary materials: a wrench, toilet paper (just in case), a plunger, a hammer, a spoon (to eat with), and knife. \nWith these you will be able to break out of the house, but first, you must eat. You feast on your favorite food, Cocoa Puff cereal. You eat your fill, and spring up, ready to escape. \nWith 4 hours left, you carefully avoid every security camera, refrencing the map that you made hours before. You walk over to the weakest part of the fence, and throw a rock on it to test the \nstrength. It goes through, meaning you are able to pass it with minor injuries. Mustering up your courage, you go headfirst, and come out the other side completely unscathed. You still have a \nlarge wall to get over and a group of guards to sneak past, so you start working. With your hammer, you drive nails into the wall, slowly making your way to the top. When you get up, \nthere are only 2 hours left. You throw your toilet paper at the guards around you, blinding them. You get away, and live the rest of your life in secrecy, hiding out in the upper district.")
    wait = 2
    print("...")
    time.sleep(wait)
    print(Fore.RED + "You" + Fore.BLUE + " won!" + Style.RESET_ALL + "\nThe end...") #winner!
  elif answer == "live your life":
    print("You relax, eating whatever you want, sleeping, gaming, and watching the view. You stay in the \nhouse until the men come to get you the next day. You are taken away in a limousine to an executin center. \nThere you are strapped into an electric chair and zapped to death. The end.\n") # die
    intro()
  else:
    print("I don't understand.")
    print(answer + " isn't an option.")
    escape_scene()
  


intro()