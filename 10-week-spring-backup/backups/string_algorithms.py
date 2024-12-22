# common string algorithms

# generally looping through a string

# printing each letter of a string on a different line
# word = "whiteboard"
# #       0123456789   length: 10
# for letter in word:
#     print(letter)
#
# # makes i become all the indices of the string
# for i in range(len(word)):
#     print(word[i])

# string building in a loop
# word = "Hello"  # the string we begin with
# output = ""  # start with an empty string to add to
# for i in range(len(word)):
#     # new value of output is the old one + the letter at i
#     output = output + word[i]
# print(output)

# make a function using a loop to stretch the word
# "Hello" -> "H e l l o"


def stretch(str):
    output = ""
    for i in range(len(str)):
        output = output + str[i] + " "
    print(output)


# make a function using a loop to fancify the word
# "Hello" -> "[<H>][<e>][<l>][<l>][<o>]
def fancy(str):
    output = ""
    for i in range(len(str)):
        output = output + "[<" + str[i] + ">]"
    print(output)


# "Hello" -> "olleH"
def reverse(str):
    output = ""
    for i in range(len(str)):
        output = str[i] + output
    print(output)


# "Hello" -> "Hllo"
def remove_all_e(str):
    output = ""
    for i in range(len(str)):
        if str[i] != "e":
            output = output + str[i]
    print(output)


# "Hello" -> "Hillo"
def replace_e_with_i(str):
    output = ""
    for i in range(len(str)):
        if str[i] == "e":
            output = output + str.replace(str[i], "i")
    print(output)


replace_e_with_i("Heeeeello")


def capitalize_e(str):
    output = ""
    for i in range(len(str)):
        if str[i] == "e":
            output = output + "E"
        else:
            output = output + str[i]
    print(output)


# another common algorithm: counting matches

# make a function  to count all the e's in a string
def count_all_e(str):
    x = 0
    for i in range(len(str)):
        if str[i] == "e":
            x = x + 1
    print(x)


def count_all_vowels(str):
    x = 0
    for i in range(len(str)):
        if str[i] == "a" or str[i] == "e" or str[i] == "i" or str[i] == "o" or str[i] == "u":
            x = x + 1
    print(x)


def count_all_vowels_sep(str):
    a = 0
    t = 0
    g = 0
    c = 0
    for i in range(len(str)):
        if str[i] == "A":
            a += 1
        elif str[i] == "T":
            t += 1
        elif str[i] == "G":
            g += 1
        elif str[i] == "C":
            c += 1
    print(a, t, g, c)


count_all_vowels_sep("")


def has_more_e_than_i(str):
    e = 0
    j = 0
    for i in range(len(str)):
        if str[i] == "e":
            e += 1
        elif str[i] == "i":
            j += 1
    if e > j:
        print(True)
    else:
        print(False)


