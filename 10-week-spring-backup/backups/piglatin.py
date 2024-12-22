def to_pig_latin():
    n = input("Enter a word: ")
    print(n[1:] + n[:1] + "ay")


to_pig_latin()


def decode_pig_latin():
    n = input("Enter a word in pig latin: ")
    print(n[len(n)-3] + n[:len(n)-3])


decode_pig_latin()
