import random
first_name = input("What is your first name? ")
last_name = input("What is your last name? ")
fav_food = input("What is your favorite food? ")
fav_city = input("What city do you want to live in? ")
fav_car = input("What's a car that you want to drive? ")
fav_movie = input("What is your favorite movie? ")

star_wars_first_name = first_name[:3] + last_name[:2] + " "
star_wars_last_name = fav_food[:2] + fav_city[:3] + " "
star_wars_title1 = "the " + last_name[len(last_name)-1] + last_name[len(last_name)-2] + last_name[len(last_name)-3]
star_wars_title2 = fav_car[0:(len(fav_car)//2)] + " "
star_wars_place = "of " + first_name[len(first_name)-2:] + fav_movie[random.randint(0, 2):random.randint(4, 9)]

star_wars_full_name = star_wars_first_name + star_wars_last_name + star_wars_title1 + star_wars_title2 + star_wars_place
print(star_wars_full_name)
