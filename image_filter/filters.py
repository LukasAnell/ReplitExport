def darken(pixel, amount=100):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])
    r -= amount
    g -= amount
    b -= amount

    if r < 0:
        r = 0
    if g < 0:
        g = 0
    if b < 0:
        b = 0

    return [r, g, b]


def lighten(pixel, amount=100):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])
    r += amount
    g += amount
    b += amount

    if r > 255:
        r = 255
    if g > 255:
        g = 255
    if b > 255:
        b = 255

    return [r, g, b]


def redden(pixel, factor):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])
    r *= factor

    if r > 255:
        r = 255

    return [r, g, b]


def bluify(pixel, factor):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])
    b *= factor

    if b > 255:
        b = 255

    return [r, g, b]


def grayscale_avg(pixel):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])
    avg = (r + g + b) / 3

    return [avg, avg, avg]


def grayscale_luminosity(pixel):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])
    L = 0.21 * r + 0.72 * g + 0.07 * b

    return [L, L, L]


def blend(pixel):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])

    color = [120, 25, 91]

    average_red = (r + color[0]) / 3
    average_green = (g + color[1]) / 3
    average_blue = (b + color[2]) / 3

    return [average_red, average_green, average_blue]


def invert(pixel):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])

    new_red = 0 + (255 - r)
    new_green = 0 + (255 - g)
    new_blue = 0 + (255 - b)

    return [new_red, new_green, new_blue]


def sepia(pixel):
    r = int(pixel[0])
    g = int(pixel[1])
    b = int(pixel[2])

    new_red = 0.393 * r + 0.769 * g + 0.189 * b
    new_green = 0.349 * r + 0.686 * g + 0.168 * b
    new_blue = 0.272 * r + 0.534 * g + 0.131 * b

    if new_red > 255:
        new_red = 255
    if new_green > 255:
        new_green = 255
    if new_blue > 255:
        new_blue = 255

    return [new_red, new_green, new_blue]
