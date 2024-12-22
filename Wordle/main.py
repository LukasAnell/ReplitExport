import random
from colorama import Fore, Back, Style


def load_dictionary():
    return open("words.txt").readlines()


def get_word(words, length):
    matches = []
    for i in range(len(words)):
        words[i] = words[i].rstrip()
        if len(words[i]) == length:
            matches += [words[i]]
    return matches[random.randint(0, len(matches) - 1)]


def count_letter(letter, word):
    letter_count = 0
    for i in range(len(word)):
        if word[i] == letter:
            letter_count += 1
    return letter_count


def check_answer(guess, word):
    result = ""
    for i in range(len(guess)):
        if guess[i] == word[i]:
            result += Back.YELLOW + Fore.BLACK + guess[i] + Style.RESET_ALL
            guess = guess[0:i] + "*" + guess[i+1:]
            word = word[0:i] + "*" + word[i+1:]
        elif guess[i] in word and count_letter(guess[i], guess[i:]) <= count_letter(guess[i], word):
            result += Back.BLUE + Fore.WHITE + guess[i] + Style.RESET_ALL
            guess = guess.replace(guess[i], "1", 1)
        else:
            result += Back.BLACK + Fore.WHITE + guess[i] + Style.RESET_ALL
    return result


def display_answers(guesses):
    print(*guesses, sep="\n")


def wordle():
    words = load_dictionary()
    word = get_word(words, 5)
    # print(word)
    guesses_left = 6
    guesses = []

    guess = input("Enter a 5 letter word: ")
    guesses_left -= 1

    while guesses_left > 0 and guess != word:
        result = check_answer(guess, word)
        guesses += [result]
        display_answers(guesses)
        guesses_left -= 1
        guess = input("Enter a 5 letter word: ")

    if guess == word:
        print("You won!")
    else:
        print("Sorry, you lost. The word was " + word + ".")


wordle()
