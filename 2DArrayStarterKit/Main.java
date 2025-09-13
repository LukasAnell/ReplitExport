public class Main {
  public static void main(String[] args) {
    int[][] data = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    /* Write loops that print the elements of data
    in different orders!*/
    System.out.println("row-major:");
    for(int r = 0; r < data.length; r++) {
      for(int c = 0; c < data[0].length; c++) {
        System.out.print(data[r][c] + " ");
      }
    }
    System.out.println("\n");
    
    System.out.println("column-major:");
    for(int c = 0; c < data[0].length; c++) {
      for(int r = 0; r < data.length; r++) {
        System.out.print(data[r][c] + " ");
      }
    }
    System.out.println("\n");

    System.out.println("reverse row-major:");
    for(int r = data.length - 1; r >= 0; r--){
      for(int c = data[0].length - 1; c >= 0; c--) {
        System.out.print(data[r][c] + " ");
      }
    }
    System.out.println("\n");

    System.out.println("reverse column-major:");
    for(int c = data[0].length - 1; c >= 0; c--) {
      for(int r = data.length - 1; r >= 0; r--) {
        System.out.print(data[r][c] + " ");
      }
    }
    System.out.println("\n");

    System.out.println("the descending diagonal:");
    for(int i = 0; i < data.length; i++) {
      System.out.print(data[i][i] + " ");
    }
    System.out.println("\n");

    System.out.println("the ascending diagonal:");
    for(int r = data.length - 1; r >= 0; r--) {
      System.out.print(data[r][data.length - 1 - r] + " ");
    }
    System.out.println();
  }
}