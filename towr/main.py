#   Modify this code in replit to alternate the colors of the
#   floors every three floors
import turtle as trtl

painter = trtl.Turtle()
painter.speed(0)
painter.pensize(5)

# starting location of the tower
x = -150
y = -150

# height of tower and a counter for each floor
num_floors = 81
num_floors2 = 65
num_floors3 = 37
floor = 0

# make the tower rotate through 3 colors all the way up
# make a 2nd and 3rd tower to the right of the first that
# also rotates through 4 and 5 colors respectively.

# iterate
while floor < num_floors:
    # set placement and color of turtle
    painter.penup()
    painter.goto(x, y)
    y = y + 5  # location of next floor
    floor = floor + 1
    if floor % 3 == 0:
        painter.color("gray")
    elif floor % 3 == 1:
        painter.color("red")
    else:
        painter.color("blue")
    # draw the floor
    painter.pendown()
    painter.forward(50)

x = -50
y = -150
floor = 0
while floor < num_floors2:
    painter.penup()
    painter.goto(x, y)
    y = y + 5
    floor = floor + 1
    if floor % 4 == 0:
        painter.color("yellow")
    elif floor % 4 == 1:
        painter.color("green")
    elif floor % 4 == 2:
        painter.color("orange")
    else:
        painter.color("gray")

    painter.pendown()
    painter.forward(50)

x = 50
y = -150
floor = 0
while floor < num_floors3:
    painter.penup()
    painter.goto(x, y)
    y = y + 5
    floor = floor + 1
    if floor % 5 == 0:
        painter.color("magenta")
    elif floor % 5 == 1:
        painter.color("orange")
    elif floor % 5 == 2:
        painter.color("purple")
    elif floor % 5 == 3:
        painter.color("aqua")
    else:
        painter.color("black")

    painter.pendown()
    painter.forward(50)

wn = trtl.Screen()
wn.mainloop()