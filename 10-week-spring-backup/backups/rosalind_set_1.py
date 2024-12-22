def nucleotides(str):
    a = 0
    c = 0
    g = 0
    t = 0
    for i in range(len(str)):
        if str[i] == "A":
            a += 1
        elif str[i] == "C":
            c += 1
        elif str[i] == "G":
            g += 1
        elif str[i] == "T":
            t += 1
    print(a, c, g, t)


def dna_to_rna(str):
    output = ""
    for i in range(len(str)):
        if str[i] == "T":
            output = output + "U"
        else:
            output = output + str[i]
    print(output)


def reverse(str):
    output = ""
    for i in range(len(str)):
        output = str[i] + output
    print(output)


reverse("")
