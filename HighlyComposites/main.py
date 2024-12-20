factor_list = []


def main():
    num: int = int(input("Enter a number: "))
    loop(num)
    print(f"The number {num}'s factors are {make_output_factors()}")


def loop(n):
    for i in range(1, int(n / 2)):
        if n % i == 0:
            factor_list.append(i)


def make_output_factors():
    out = ""
    for i in range(len(factor_list)):
        if i != len(factor_list) - 1:
            out += str(factor_list[i]) + ", "
        else:
            out += str(factor_list[i])


if __name__ == '__main__':
    main()
