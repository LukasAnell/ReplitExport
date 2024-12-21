# getting basic input
# variables in python: var_name = value
# name = input("Hi, what is your name?\n")
# # use + sign to join text and variables together: concatenation
# print("Hi, " + name + "!")

#  CODE A LITTLE, TEST A LOT

# functions: a list of steps that we can refer to using a single name
# syntax: def functionName(parameters):
def intro():
  # every step that belongs to the function is indented 
  print("Pick a color.")
  answer = input("You can choose red or blue: ")
  # use == to compare two values
  # is answer the same as "red"?
  if answer == "red":
    # anything indented here happens
    # only if the answer is red 
    print("You chose red.")
    print("Nice pick.")
    red_scene()
  # for more options, use elif
  # elif --> else if
  elif answer == "blue":
    print("You chose blue.")
    print("Good jorb.")
    blue_scene()
  # for anything else that was written
  else:
    print("I don't understand.")
    # <color they chose> isn't an option
    print(answer + " isn't an option.")
    # have them try again
    intro()

# story ends here
def red_scene():
  print("You appear in a giant tomato patch. The end.")

# story has one more choice but ends here, too
def blue_scene():
  print("You turn into a smurf. Smurftastic.")
  # can continue to the story here
  # ask for more input
  # do more if statements just like in the intro
  answer = input("What kind of smurf will you be? [regular] or [extra small]\n")
  if answer == "regular":
    print("You're a regular smurf. You blend in and enjoy a nice long smurf life. The end.")
  elif answer == "extra small":
    print("You're an especially tiny smurf. Smurfs think that's cool. You enjoy a long smurf life.")

# make our function run by calling it
intro()