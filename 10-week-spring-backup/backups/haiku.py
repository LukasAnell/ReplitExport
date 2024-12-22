import random
from colorama import Fore, Back, Style


def generate_haiku():
    one_syll_adj = ["hot", "cold", "warm", "bright", "dark", "green", "red", "brown", "white", "tall", "short"]
    two_syll_adj = ["yellow", "orange", "phony", "dreamy", "fluffy", "sussy", "dirty", "healthy"]
    three_syll_adj = ["annoying", "dangerous", "important", "musical", "natural", "uniform", "innocent"]
    one_syll_verb = ["gulp", "watch", "swerve", "love", "sing", "die", "age", "hurt", "kill", "laugh", "eat", "jump"]
    two_syll_verb = ["travel", "admit", "agree", "argue", "borrow", "deceive", "escape", "explain", "explode", "exist"]
    three_syll_verb = ["understand", "represent", "overcome", "undertake", "disagree", "entertain", "overthrow"]
    one_syll_noun = ["air", "life", "death", "heart", "world", "you", "me", "day", "ring", "man", "phone", "bell"]
    two_syll_noun = ["woman", "mountain", "people", "water", "heaven", "christmas", "angel", "nature", "sugar"]
    three_syll_noun = ["chocolate", "banana", "funeral", "apartment", "basketball"]

    foreground = [Fore.YELLOW, Fore.BLUE, Fore.CYAN, Fore.GREEN, Fore.RED, Fore.MAGENTA]
    background = [Back.BLUE, Back.WHITE, Back.BLACK, Back.RED, Back.GREEN, Back.YELLOW]

    line_one = (one_syll_adj[random.randint(0, len(one_syll_adj) - 1)] + " " +
                two_syll_noun[random.randint(0, len(two_syll_noun) - 1)] + " " +
                two_syll_verb[random.randint(0, len(two_syll_verb) - 1)]) \

    line_two = (two_syll_adj[random.randint(0, len(two_syll_adj) - 1)] + " " +
                two_syll_noun[random.randint(0, len(two_syll_noun) - 1)] + " " +
                three_syll_verb[random.randint(0, len(three_syll_verb) - 1)])

    line_three = (one_syll_adj[random.randint(0, len(one_syll_adj) - 1)] + " " +
                  three_syll_noun[random.randint(0, len(three_syll_noun) - 1)] + " " +
                  one_syll_verb[random.randint(0, len(one_syll_verb) - 1)])

    print(foreground[random.randint(0, len(foreground) - 1)] + background[random.randint(0, len(background) - 1)] +
          line_one + Style.RESET_ALL + "\n" + foreground[random.randint(0, len(foreground) - 1)] +
          background[random.randint(0, len(background) - 1)] + line_two + Style.RESET_ALL + "\n" +
          foreground[random.randint(0, len(foreground) - 1)] + background[random.randint(0, len(background) - 1)] +
          line_three + Style.RESET_ALL)


generate_haiku()
