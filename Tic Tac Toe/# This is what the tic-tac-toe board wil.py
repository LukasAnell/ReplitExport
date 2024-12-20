# This is what the tic-tac-toe board will look like when empty:
#   board = [
#     [0, 0, 0],  0
#     [0, 0, 0],  1
#     [0, 0, 0]   2
#      0  1  2
#   ]
# As each player takes their turns, the 0s will be replaced with -1s or 1s for X's and O's.


from re import X


def is_winner(board, symbol):
    '''Checks if the symbol (-1 for X, 1 for O) won.
    Returns true if that player won, false if they haven't'''
    # horizontal winner  board[0][0] == symbol makes sure it doesn't trigger when all 3 are empty (0s)
    if board[0][0] == board[0][1] and board[0][1] == board[0][2] and board[0][0] == symbol:
        return True
    elif board[0][0] == board[1][1] and board[1][1] == board[2][2] and board[0][0] == symbol:
        return True
    elif board[2][0] == board[1][1] and board[1][1] == board[0][2] and board[2][0] == symbol:
        return True
    elif board[1][0] == board[1][1] and board[1][1] == board[1][2] and board[1][0] == symbol:
        return True
    elif board[0][0] == board[1][0] and board[1][0] == board[2][0] and board[0][0] == symbol:
        return True
    elif board[0][1] == board[1][1] and board[1][1] == board[2][1] and board[0][1] == symbol:
        return True
    elif board[0][2] == board[1][2] and board[1][2] == board[2][2] and board[0][2] == symbol:
        return True
    elif board[2][0] == board[2][1] and board[2][1] == board[2][2] and board[2][0] == symbol:
        return True
    else:
        return False


def tic_tac_toe():
    board = [
        [0, 0, 0],
        [0, 0, 0],
        [0, 0, 0]
    ]
    symbol = -1  # -1 is for x
    turn = 0
    winner = ""  # no current winner
    print_board(board)

    # keeps going until a winner or out of turns
    while winner == "" or turn < 9:
        # if the turn is even, it's x's turn
        # if it's odd, it's o's turn
        row, col = get_move(board, symbol)
        if turn % 2 == 0:
            symbol = -1
            board[row][col] = "X"
        elif turn % 2 != 0:
            symbol = 1
            board[row][col] = "O"
        turn += 1
        print_board(board)
    # TODO: after the loop, print if there was a winner
    #  or if there was a draw. Say who won if there was a winner
        if is_winner(board, symbol):
            if symbol == -1:
                winner = "X"
            elif symbol == 1:
                winner = "O"
            print(winner + "is the winner!")
        elif turn == 9:
            print("It is a draw!")


def get_move(board, symbol):
    row = int(input("Please enter the row: "))
    col = int(input("Please enter the column: "))
    # row >= 0 and row <= 2 and columns and not taken
    # ask again if: row < 0 or row > 2 or col or taken
    while row > 2 or row < 0:
        print("Invalid move, try again!")
        get_move(board, symbol)
        # is a space that is already taken
        # ask for more input
    return row, col


def print_board(board):
    for row in range(len(board)):
        for col in range(len(board[0])):
            if board[row][col] == 0:
                print(" ", end="")
            elif board[row][col] == -1:
                print("X", end="")
            else:
                print("O", end="")
            if col != 2:
                print("|", end="")
        if row != 2:
            print("\n-----")
    print()


tic_tac_toe()
