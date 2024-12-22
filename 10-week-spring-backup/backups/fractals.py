# https://towardsdatascience.com/creating-fractals-with-python-d2b663786da6

import turtle
import random

MINIMUM_BRANCH_LENGTH = 5
colors = ("red", "blue", "green", "dodgerblue", "yellow", "orange")


def build_tree(t, branch_length, shorten_by, angle):
    if branch_length > MINIMUM_BRANCH_LENGTH:
        t.color(random.choice(colors))
        t.forward(branch_length)
        new_length = branch_length - shorten_by
        t.left(angle)
        build_tree(t, new_length, shorten_by, angle)
        t.right(angle * 2)
        build_tree(t, new_length, shorten_by, angle)
        t.left(angle)
        build_tree(t, new_length, shorten_by, angle)
        t.backward(branch_length)


tree = turtle.Turtle()
tree.hideturtle()
turtle.Screen().tracer(0)

tree.speed(0)
tree.setheading(90)
build_tree(tree, 50, 5, 95)
turtle.mainloop()

# to make the tree have less branches, you can lower the branch_length parameter
# to make the tree have more branches, you can increase the branch_length parameter
# to make the tree very narrow and tall, you can lower the angle parameter
# to make the tree so wide that it goes into itself, you can make the angle parameter greater than 90 degrees
# to make each branch a different color, you can add a list of colors that are randomly chosen from
# to add another branch to the tree, you can add another recursive function within the build_tree function, so it builds another tree
