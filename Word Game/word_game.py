import random


# example:
# word = "hello"
# guesses = "aeio"
# output --> "_e__o"
def format_word(word, guesses):
    # think string building like dna to rna transcription
    # make a variable to store the output
    output = ""
    # loop through the whole word
    # if the current letter in the word is in guesses or is a space, apostrophe, or exclamation mark
    # add that letter to the output
    # otherwise, add a _ to the output because it wasn't guessed
    for i in range(len(word)):
        if word[i] in guesses or word[i] in [" ", "'", "!"]:
            output += word[i]
        else:
            output += "_"

    # return the formatted word
    return output


def game():
    # TODO: print an introduction to the game
    print("Welcome to the word game!")
    # TODO: optional: ask what difficulty they want and pick a word based on that below
    word = pick_random_word()
    guesses_left = 7
    guessed_letters = ""
    print()
    # TODO: optional: print the current ascii image representing the number of guesses left
    print()
    # TODO: get the formatted word, store it in a variable
    formatted_word = format_word(word, guessed_letters)
    # TODO: print the formatted word
    print(formatted_word)
    # TODO: the game loop continues as long as the formatted word doesn't match the current word
    # and there are guesses still remaining
    # TODO: get the user input and store it in a variable
    # TODO:  check if the letter isn't in the word
    # TODO: if not, subtract a guess and print how many guesses are left
    while formatted_word != word and guesses_left > 0:
        user_input = input("Guess a letter: ")
        if user_input not in word:
            guesses_left -= 1

        # TODO: add the letter to the guessed_letters string
        guessed_letters += user_input
        # TODO: update the formatted word variable
        formatted_word = format_word(word, guessed_letters)
        print()
        # TODO: optional: print the current ascii image representing the number of guesses left
        print()
        # TODO: print the formatted word
        print(formatted_word)

        print()
    # after the game loop is over, we need to see if they won or lost
    # TODO: if the formatted word matches the actual word, we know they won
    # TODO: print a winning message
    if formatted_word == word:
        print("You won!")
    # TODO: otherwise, print a losing message as well as reveal what the word was
    else:
        print("You lost. The word was: " + word)

    # TODO: ask if they want to play again. restart the function if they do, otherwise print an end message
    answer = input("Would you like to play again?\nyes/no: ")
    if answer == "yes":
        game()
    else:
        print("Goodbye!")


def pick_random_word():
    return random.choice(load_dictionary())


def load_dictionary():
    return open("scrabble_words.txt").read().splitlines()


def get_single_letter_input(guessed_letters):
    answer = input("You've guessed: " + guessed_letters + " so far. Enter a letter: ").upper()
    while len(answer) != 1 or answer in guessed_letters:
        answer = input("Invalid input. Please enter a single letter you haven't guessed before: ").upper()
    return answer
