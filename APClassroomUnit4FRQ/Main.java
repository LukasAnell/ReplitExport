class Main {
  public static void main(String[] args) {
    longestStreak("CCAAAAATTT!");
  }

  // Question #1
  public static void longestStreak(String str) {
    int currentMax = 0;
    int currentCount = 1;
    String currentMaxChar = "";
    for(int i = 0; i < str.length(); i++) {
      for(int j = i + 1; j < str.length(); j++) {
        if(str.charAt(i) == str.charAt(j)) {
          currentCount++;
        } else {
          break;
        }
      }
      if(currentMax < currentCount) {
        currentMax = currentCount;
        currentMaxChar = str.substring(i, i + 1);
      }
      currentCount = 1;
    }
    System.out.println(currentMaxChar + " " + currentMax);
  }


  // Question #2a
  public int getPlayer2Move(int round) {
        int result;
        if(round % 3 == 0) {
            result = 3;
        } else if(round % 2 == 0) {
            result = 2;
        } else {
            result = 1;
        }
        return result;
    }

  public int getPlayer1Move() {
    return 1;
  }
  
  // Question #2b
  public void playGame() {
    int startingCoins = 0;
    int maxRounds = 0;
        int player1Balance = startingCoins, player2Balance = startingCoins;
        int i = 0;
        while(i < maxRounds || player1Balance >= 3 || player2Balance >= 3) {
            player1Balance -= getPlayer1Move();
            player2Balance -= getPlayer2Move(i);
            i++;
        }
        if(player1Balance > player2Balance) {
            System.out.println("player 1 wins");
        } else if(player2Balance > player1Balance){
            System.out.println("player 2 wins");
        } else {
            System.out.println("tie game");
        }
    }
}