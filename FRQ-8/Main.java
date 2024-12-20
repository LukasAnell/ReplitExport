class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public Plot getHighestYield(String c) {
    Plot out = null;
    int highestYield = -1;
    
    for(Plot[] row : farmPlots) {
      for(Plot plot : row) {
        if(plot.getCropType().equals(c) && plot.getCropYield() > highestYield) {
          out = plot;
          highestYield = plot.getCropYield();
        }
      }
    }
    
    return out;
  }

  public boolean sameCrop(int col) {
    String firstCrop = farmPlots[0][col].getCropType();
    for(int row = 1; row < farmPlots.length; row++) {
      if(!farmPlots[row][col].getCropType().equals(firstCrop)) {
        return false;
      }
    }
    return true;
  }
}