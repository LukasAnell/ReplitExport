def reverse_complement(dna):
    complement = ""
    reverse = ""
    for i in range(len(dna)):
        if dna[i] == "A":
            complement = complement + "T"
        elif dna[i] == "T":
            complement = complement + "A"
        elif dna[i] == "G":
            complement = complement + "C"
        elif dna[i] == "C":
            complement = complement + "G"
    for j in range(len(complement)):
        reverse = complement[j] + reverse
    print(reverse)


reverse_complement("TTACAGCTTGTAGTGCCGTCTACAGGACATGTTATCGATGGGCCTCAGACCTGTCTGTAATCGCTAGGTGCTATCCATCACGTGGAGGCTCAAGCATAAGCCCTCGTACGGAGTTGCGGTGTTGGTGACGCCGCCCAGACCGGGTGCCTTCGGCCACTCCAACAAGCAACAAAACGGCACATTAAGCTCGCTGTACGGCCAGGTGTGATTTTGTGCATCTCTTTTACATTCTTGCGCAGACCCGCATTGTTTGCAAGTAGGCGTGGAACGACCGCACTAAGACCTAGCTACGCTATCTACGCGAAGGGTAACTAGGTTCGCGCGGTTCGAGGCTTCCGTTGGGATCTGGGCAGGGGTACGCTGCCCCGATTAGCGGTTGATACCTTGGTTGGTGTTGCCTCTTCTTTCTCTAGCTAAGTTCCATCGCCGTCATGACAGACAGTCCGGGTTCCAATACGCATTTAACATAGTGATATTCGGTACACCGCGGTGGCCTACGTAGGTGGATCTCATGTATACCTATTTCATCGGTTCGACAAGACAGTTTCAGCACATTACACGGAGCTGGCCGGATTTGATTAATGACTAGACGCTACAAGACTGTGAGAGCGATTGATTACACAGGCTCGCCCTCGGGCGGAGAAGTCCAACGATATGCAGTCACACCCCTGGGCCGAATGCACCCAAACATCTACGCAGGACACCCTCTCCTGAGAAAGACTGCATACTACCGGCACCGAATCCGTCGGAAAAGCGTGCGTACAAAGACCATTGTGTCATCAACAAAGGTATAACATTTGCCATATCTTTAACCTGTATCTATCTTTCAAAGGGGTCGCACTGCAGGGTCCGGGCGACATAGATTTATTAACCGTCCCCGGTTTTGCAGATCCGGAGAGTAGC")
