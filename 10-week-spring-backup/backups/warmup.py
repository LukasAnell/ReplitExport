# # 0 to 50
# for i in range(51):
#     print(i)
#
# # 7 to 50
# for i in range(7, 51):
#     print(i)
#
# # 100 to 200
# for i in range(100, 201):
#     print(i)
#
# # -30, -27, -24, -21, -18
# for i in range(-30, -17, 3):
#     print(i)
#
# # -30, -35, -40
# for i in range(-30, -41, -5):
#     print(i)


def div_by_9():
    number = input("Enter a number: ")
    sum_of_digits = sum(int(digit) for digit in str(number))
    sum_of_digits2 = sum(int(digit) for digit in str(sum_of_digits))
    sum_of_digits3 = sum(int(digit) for digit in str(sum_of_digits2))
    sum_of_digits4 = sum(int(digit) for digit in str(sum_of_digits3))

    if sum_of_digits4 == 9:
        print("Your number is divisible by 9!")
    else:
        print("Your number is not divisible by 9.")


div_by_9()
