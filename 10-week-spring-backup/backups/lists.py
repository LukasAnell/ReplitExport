import random

# list is just a group of numbers, strings, or other objects
# adjective1 = "blue"
# adjective2 = "green"
# adjective3 = "yellow"

# having a different variable name for each one
# gets cumbersome quickly

# since these are all related, group them in a single list
# and like strings, each item has its own index
# adjectives = ["blue", "green", "yellow"]
#                0       1         2

# can access & slice up lists like strings
# print(adjectives)
# print(adjectives[0])  # first item
# print(adjectives[0:2])  # first 2 items
# print(adjectives[len(adjectives)-1])  # last item
# random.randint(x, y) picks a number from x to y INCLUSIVE
# index = random.randint(0, len(adjectives)-1)
# print(index)
# print(adjectives[index])

# colors = ["blue", "green", "yellow", "red", "purple",
#           "black", "white", "salmon", "chartreuse", "brown"]
#
# emotions = ["happy", "sad", "angry", "hangry", "depressed",
#             "desolate", "excited", "ebullient"]
#
# animals = ["shark", "smelt", "turtle", "human", "quokka",
#            "koala", "blobfish"]
# # a \ will let you go to the next line in python
# color = colors[random.randint(0, len(colors)-1)]
# color = color[0].upper() + color[1:]
# emotion = emotions[random.randint(0, len(emotions)-1)]
# emotion = emotion[0].upper() + emotion[1:]
# animal = animals[random.randint(0, len(animals)-1)]
# animal = animal[0].upper() + animal[1:]
#
# filename = color + emotion + animal
#
# print(filename)

# 3 common list algorithms

# sum the elements in a list
nums = [1, 2, 3, 4, 5]
total = 0
for i in range(len(nums)):
    # add the current elements in the total
    total += nums[i]  # remember nums[i] is the current element
print(total)

# counting matches (for this case, numbers less than 3)
nums = [1, 2, 3, 4, 5]
# loop through the list
count = 0
for i in range(len(nums)):
    # check if its a match
    if nums[i] < 3:
        # add one if it is
        count += 1
print(count)

# selecting matches
nums = [1, 2, 3, 4, 5]
# print a list of all the numbers under 3
matches = []  # start with an empty list
# loop through the list
for i in range(len(nums)):
    # check if it is a match
    if nums[i] < 3:
        # add the match to the list
        matches += [nums[i]]  # add a list to a lsit to extend
        # or nums.append(nums[i]) to also add to the end
# then print out our matches
print(matches)
