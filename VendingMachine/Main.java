class Main {
  public static void main(String[] args) {
    VendingMachine mach = new VendingMachine(3.5, 3);
    System.out.println("toString() check");
    System.out.println(mach);

    System.out.println("\nCheck money, sell soda, then check again");
    System.out.print("Expected: 0.0 Actual: ");
    System.out.println(mach.getMoneyInserted()); //should be 0
    mach.sellSoda();
    System.out.print("Expected: "+mach.getPrice()+" Actual: ");
    System.out.println(mach.getMoneyInserted());

    System.out.println("\nSell soda with $1.50 change, sell again with too little money");
    System.out.print("Expected: 1.5 Actual: ");
    mach.sellSoda(5.0);
    System.out.println("Expected: error message, then 3.0 Actual: ");
    mach.sellSoda(3); //should be $3.00 in change and an error message

    System.out.println("\nCheck stock, try to sell two more");
    System.out.print("Expected: 1 Actual: ");
    System.out.println(mach.getStock()); //should print 1
    mach.sellSoda();
    System.out.println("Expected: out of stock error message w/ change Actual: ");
    mach.sellSoda(4.0); //should print an out of stock error message and then return money
    
    System.out.println("\nCheck money in machine, empty, check again");
    System.out.print("Expected: "+mach.getPrice()*3+ " Actual: ");
    System.out.println(mach.getMoneyInserted()); //should be $10.50
    mach.emptyMoney();
    System.out.print("Expected: 0.0 Actual: ");
    System.out.println(mach.getMoneyInserted());
    System.out.print("Expected: "+mach.getPrice()*3+ " Actual: ");
    System.out.println(VendingMachine.getTotalRevenue());

    System.out.println("\nCheck restock");
    System.out.print("Expected: nothing Actual: ");
    mach.restock(10);
    System.out.print("\nExpected: error message Actual: ");
    mach.restock(100);

    System.out.println("\nCheck static variables/methods");
    VendingMachine mach2 = new VendingMachine();
    VendingMachine mach3 = new VendingMachine();
    mach.sellSoda();
    mach2.sellSoda();
    mach3.sellSoda();
    mach.emptyMoney();
    mach2.emptyMoney();
    mach3.emptyMoney();
    System.out.print("Expected: 6 Actual: ");
    System.out.println(VendingMachine.getTotalSold());
    System.out.print("\nExpected: 18.0 Actual: ");
    System.out.println(VendingMachine.getTotalRevenue());
  }
}
