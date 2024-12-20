import numpy as np


def main():
    board = board_init()
    print(board)


def board_init():
    board = np.zeros(shape=(8, 16), dtype=np.chararray)
    count = 0
    for i in range(0, len(board)):
        for j in range(0, len(board[0])):
            replacement = hex(int(str(count), 10)).replace("0x", "")
            if len(replacement) < 2:
                replacement = "0" + replacement
            board[len(board) - i - 1][j] = replacement
            count += 1
    return board


def translate_board_string():
    print()


if __name__ == '__main__':
    main()
