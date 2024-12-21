import turtle as trtl
import random

painter = trtl.Turtle()
window = trtl.Screen()
window.colormode(255)


def universal(sides=2, length=100, x=0, y=400, pen_color="black", thickness=1, fill_color="white", filled=False):
    painter.penup()
    painter.goto(x, y)
    painter.pendown()
    painter.pensize(thickness)

    if filled:
        painter.fillcolor(fill_color)
        painter.begin_fill()
    painter.pencolor(pen_color)

    i = 0
    while i < sides:
        painter.fd(length)
        painter.rt(360 / sides)
        i = i + 1

    if filled:
        painter.end_fill()


universal(6, 50, 0, 400, "white", 0, "red", True)

window.mainloop()
