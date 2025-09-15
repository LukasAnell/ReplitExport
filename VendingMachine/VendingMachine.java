public class VendingMachine {
  private double price;
  private int sodaCount;
  private double totalMoney;
  private static int totalSodaSold = 0;
  private static double totalRevenue = 0.0;
  private static final int MAX_SODAS = 50;

  /**
   * Initializes instance variables to initialize an object
   * Precondition: stock > 0 && stock <= 50
   * Precondition: cost > 0
   * 
   * @param stock the amount of sodas in the VendingMachine
   * @param cost  the amount of money that must be paid per soda
   */
  public VendingMachine(double cost, int stock) {
    if(stock > MAX_SODAS) {
      System.out.println("Error, too many sodas inserted. Current stock is " + MAX_SODAS + ".");
      sodaCount = MAX_SODAS;
    } else {
      sodaCount = stock;
    }
    sodaCount = stock;
    price = cost;
    totalMoney = 0;
  }

  /**
   * Initializes one instance variable to initialize an object
   * Precondition: stock > 0 && stock <= 50
   * 
   * @param stock the amount of sodas in the VendingMachine
   */
  public VendingMachine(int stock) {
    if(stock > MAX_SODAS) {
      System.out.println("Error, too many sodas inserted. Current stock is " + MAX_SODAS + ".");
      sodaCount = MAX_SODAS;
    } else {
      sodaCount = stock;
    }
    price = 2.00;
    totalMoney = 0;
  }

  /**
   * Initializes a vending machine with a default price
   * if no arguments are given in the constructor
   */
  public VendingMachine() {
    sodaCount = 5;
    price = 2.00;
    totalMoney = 0;
  }

  /**
   * Returns the price of a soda
   * 
   * @return The price as a double
   */
  public double getPrice() {
    return price;
  }

  /**
   * Sets the price of soda to the value of newPrice
   * Precondition: newPrice > 0
   * 
   * @param newPrice the new price of a soda
   */
  public void setPrice(double newPrice) {
    price = newPrice;
  }

  /**
   * Returns the amount of sodas
   * 
   * @return The amount as an int
   */
  public int getStock() {
    return sodaCount;
  }

  /**
   * Returns the total amount of money in the vending machine
   * 
   * @return The amount of money as a double
   */
  public double getMoneyInserted() {
    return totalMoney;
  }

  /**
   * Updates sodaCount with the desired number amount
   * Precondition: amount > 0
   * Precondition: amount + sodaCount <= 50
   * 
   * @param amount the amount of sodas added to the machine
   */
  public void restock(int amount) {
    if(sodaCount + amount > MAX_SODAS) {
      System.out.println("Error, too many sodas inserted. Current stock is " + MAX_SODAS + " sodas.");
      sodaCount = MAX_SODAS;
    } else {
      sodaCount += amount;
    }
  }

  /**
   * Updates the amount of money to be 0 && updates totalRevenue
   */
  public void emptyMoney() {
    totalRevenue += totalMoney;
    totalMoney = 0;
  }

  /**
   * Updates sodaCount to be one less and totalMoney is increased by the price of
   * a soda
   * Updates totalSodaSold if a soda is sold
   */
  public void sellSoda() {
    if (sodaCount <= 0) {
      System.out.println("Error 404, Soda not found.");
    } else {
      sodaCount--;
      totalMoney += price;
      totalSodaSold++;
    }
  }

  /**
   * With input moneyPaid, sellSoda checks if that amount is enough to buy a soda
   * for amount price. If yes, sodaCount is decremented, and totalMoney is
   * increased by price, and change is returned. If no, an error is printed, and
   * all of the money is returned. Updates totalSodaSold.
   * Precondition: moneyPaid >= 0
   * 
   * @param moneyPaid the amount of money that is put into the
   *                  vending machine
   */
  public void sellSoda(double moneyPaid) {
    if (moneyPaid >= price) {
      if (sodaCount <= 0) {
        System.out.println("Error 404, Soda not found.");
        System.out.println("$" + moneyPaid + " was returned to you.");
      } else {
        sodaCount--;
        totalMoney += price;
        totalSodaSold++;
         System.out.println("Your change is $" + (moneyPaid - price) + ".");
      }
    } else {
      System.out.println("Error, insufficient funds. \n$" + moneyPaid + " has been returned.");
    }
  }

  /**
   * Returns the total amount of sodas sold, across all VendingMachine objects.
   * 
   * @return The total sodas sold as an int
   */
  public static int getTotalSold() {
    return totalSodaSold;
  }

  /**
   * Returns the total amount of revenue across all VendingMachine objects.
   * 
   * @return The total revenue made as a double
   */
  public static double getTotalRevenue() {
    return totalRevenue;
  }

  /**
   * Returns a description of the VendingMachine, including the amount of sodas in
   * it and how much each costs.
   * 
   * @return A detailed description of the VendingMachine
   */
  public String toString() {
    return "The vending machine has " + sodaCount + " sodas left in it, and each costs $" + price + ".";
  }
}