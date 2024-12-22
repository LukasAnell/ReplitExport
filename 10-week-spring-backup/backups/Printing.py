# print hello
# print("hello")

# print hello 75 times
# definite loop
# for varName in collection/list
# for i in range(100):
#     print("hello")

# to repeat something x times:
# for i in range(x):

# print each number i in range(5)
# for i in range(5):
#     print(i)

# # print 0 to 99
# for i in range(100):
#     print(i)
#
# # print 1 to 100
# for i in range(1, 101):
#     print(i)
#
# # print 1 to 100 but only odd numbers
# for i in range(1, 101, 2):
#     print(i)
#
# # alternative
# for i in range(1, 100):
#     # if it is odd
#     if i % 2 != 0:
#         print(i)
#
# # print 1 to 100 but only even numbers
# for i in range(2, 101, 2):
#     print(i)
#
# # print 10 to 1 and say blastoff after
# for i in range(10, 0, -1):
#     print(i)
#     if i == 1:
#         print("blastoff")


# make a function called fizzbuzz
# 1. print out the answers to fizzbuzz between and 100 inclusive
# 2. put a parameter into the function fizzbuzz(end)
#    so that it prints out the answers to fizzbuzz
#    between 1 and end inclusive
# 3. format it nicely so that it prints fizzbuzz answers like this:
# 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, 10,
# 11, fizz, etc...
# every 10 numbers it goes to the next line


# def FizzBuzz(n):
# #     for i in range(1, n + 1):
# #         if i % 15 == 0:
# #             print("FizzBuzz", end=", ")
# #         elif i % 3 == 0:
# #             print("Fizz", end=", ")
# #         elif i % 5 == 0:
# #             print("Buzz", end=", ")
# #         else:
# #             print(i, end=", ")
# #
# #         if i % 10 == 0:
# #             print()
# #
# #
# # FizzBuzz(100)

# we can print numbers in ranges and stuff... but what about
# letters in a for loop?

# Hello
# H
# e
# l
# l
# o

# user_input = input("Enter a word: ")
#
# for letter in user_input:
#     print(letter)

# every string has a range of numbers behind it that gives
# an address (or index) to each letter

# word = "Hello"
# # #       01234
# # print(word[1])  # prints an e because the e is at index 1
# # print(word[4])


phrase = "How to cook for forty humans"

print(phrase[0:12] + phrase[22:28])
print(phrase[0:16] + phrase[22:28])
print(phrase[0:12] + phrase[16:28])
print(phrase)
