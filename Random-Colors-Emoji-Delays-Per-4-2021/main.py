import random
import emoji
import time
from colorama import Fore, Back, Style

# import time is at the top
# random.random() returns 0 <= x < 1
# 0 ---> 0.9999999999999
# example: say something 30% of the time
if random.random() < 0.3:
    print("You win!")
else:
    print("You maybe didn't win!")

#######################################
# colorama import is at the top

print(Fore.RED + 'some red text ' + Fore.BLUE + 'some blue text ' +
      Style.RESET_ALL + 'some nomral text')

print(Back.GREEN + "white on green" + Fore.RED + " red on green" +
      Style.RESET_ALL + "back to normal")

print(Fore.YELLOW + Style.DIM + "dim text" + Style.RESET_ALL + Style.BRIGHT +
      " bright text" + Style.RESET_ALL)

# color options
#Fore: BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE, RESET.
#Back: BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE, RESET.
#Style: DIM, NORMAL, BRIGHT, RESET_ALL

#############################
# optional
# emoji import is at the top

# use the short names from this link:
# https://unicode.org/emoji/charts/full-emoji-list.html
print(emoji.emojize("This is a sentence with a :lobster: in the middle of it"))
# instead of spaces, use _ for the short names
print(emoji.emojize("Oh look, a :shooting_star::lobster:"))

################################
# time import is at the top

# define a couple of different wait time variables, when testing all our branches, we can temporarily set them to 0
normal_wait = 3
long_wait = 10
print("Dramatic...")
# the sleep argument is in seconds
time.sleep(long_wait)
print("pause.")
