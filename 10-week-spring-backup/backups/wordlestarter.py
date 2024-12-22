# submission instructions
# uncomment all the tests and run it
# screenshot all the working tests
# copy your code and the screenshot into a google doc

from colorama import Fore, Back, Style
import string
import random


# given a list of words of varying length and a desired length,
# return a random word from a list
# of only the words that match that length
def get_word(words, length):
    # do the select matches algorithm to get a list of
    # length-letter words
    matches = []
    for i in range(len(words)):
        if len(words[i]) == length:
            matches += [words[i]]
    # return a random word from that matching list
    return matches[random.randint(0, len(matches) - 1)]


# given a word and a letter, return how many times that letter appears
# in that word
def count_letter(letter, word):
    letter_count = 0
    for i in range(len(word)):
        if word[i] == letter:
            letter_count += 1
    return letter_count


# given a list of guesses, print each guess on separate lines
def display_answers(guesses):
    print(*guesses, sep="\n")


# return False if any letter in the word is not in the string of
# valid letters, return True if all are valid
# helper functions that are given
def is_all_ascii(word):
    # can use the "in" keyword to see if the current letter
    # is in the list of letters:
    # examples:
    # "i" in "team" returns False
    # "i" in "aeiou" returns True
    valid_letters = string.ascii_uppercase[0:26]  # gives a string of letters "A...Z"
    if valid_letters[0] in word:
        return True
    else:
        return False


# come back to here

############### TEST DATA & FUNCTIONS ##################
##### Uncomment each section to test each function #####

# test display answers #
# guesses = ["abcde", "fghij", "klmno"]
# # display_answers(guesses)
# # print("Expected:\nabcde\nfghij\nklmno")
# end test display answers #

# test is_all_ascii
word1 = "hello"
print(is_all_ascii(word1))
print("Expected: True")
word2 = "h3ll0"
print(is_all_ascii(word2))
print("Expected: False")
word3 = "h ello"
print(is_all_ascii(word3))
print("Expected: False")
# end test is_all_ascii

# test count_letter
# letter = "e"
# word1 = "hello"
# print(count_letter(letter, word1))
# print("Expected: 1")
# word2 = "eieio"
# print(count_letter(letter, word2))
# print("Expected: 2")
# word3 = "blah"
# print(count_letter(letter, word3))
# print("Expected: 0")
# end test count_letter

# test get_word
# length_words = 5
# words_list = ["at", "hat", "that", "splat", "strat", "bobcat", "tophat", "muskrat"]
# print(get_word(words_list, length_words))
# print("Expected: <either splat or strat>")
# end test get_word
