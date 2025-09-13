class Main {
  public static void main(String[] args) {
    String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
    for(String word : words) {
      if(word.indexOf("ing") == word.length() - 3) {
        System.out.println(word);
      }
    }
  }

  public double computeBonusThreshold() {
    double sum = 0;
    int max = itemsSold[0];
    int min = itemsSold[0];
    for(int items : itemsSold) {
      sum += items;
      max = Math.max(max, items);
      min = Math.min(min, items);
    }
    return (sum - max - min) / (itemsSold.length - 2);
    }

  public void computeWages(double fixedWage, double perItemWage) {
    double bonusThreshold = computeBonusThreshold();
    for(int i = 0; i < wages.length; i++) {
      if(itemsSold[i] >= bonusThreshold) {
        wages[i] = (fixedWage + perItemWage * itemsSold[i]) * 1.1;
      } else {
        wages[i] = fixedWage + perItemWage * itemsSold[i];
      }
    }
  }
}