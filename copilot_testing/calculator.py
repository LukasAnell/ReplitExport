# write a function that can make a password of given length
# with random alphanumeric characters with a minimum of 2 numbers and 2 letters

import random
import string

def generate_password(length):
    password = ''
    for i in range(length):
        # random.choice() returns a random element from a given sequence
        # random.choices() returns a list with a random selection from a given sequence
        # random.sample() returns a list with a random selection from a given sequence without replacement
        # random.choices() returns a list with a random selection from a given sequence with replacement
        password += random.choice(string.ascii_letters + string.digits)
    return password

def generate_password2(length):
    password = ''
    for i in range(length):
        if i < 2:
            password += random.choice(string.ascii_letters)
        else:
            password += random.choice(string.ascii_letters + string.digits)
    return password

def generate_password3(length):
    password = ''
    for i in range(length):
        password += random.choice(string.ascii_letters + string.digits)
    password = password[:2] + random.choice(string.ascii_letters) + password[3:]
    return password

def generate_password4(length):
    password = ''
    for i in range(length):
        password += random.choice(string.ascii_letters + string.digits)
    password = password[:2] + random.choice(string.ascii_letters) + password[3:]
    password = password[:3] + random.choice(string.digits) + password[4:]
    return password

def generate_password5(length):
    password = ''
    for i in range(length):
        password += random.choice(string.ascii_letters + string.digits)
    password = password[:2] + random.choice(string.ascii_letters) + password[3:]
    password = password[:3] + random.choice(string.digits) + password[4:]
    password = password[:4] + random.choice(string.ascii_letters) + password[5:]
    return password

def generate_password6(length):
    password = ''
    for i in range(length):
        password += random.choice(string.ascii_letters + string.digits)
    password = password[:2] + random.choice(string.ascii_letters) + password[3:]
    password = password[:3] + random.choice(string.digits) + password[4:]
    password = password[:4] + random.choice(string.ascii_letters) + password[5:]
    password = password[:5] + random.choice(string.digits) + password[