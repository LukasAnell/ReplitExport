public class RouteCipher {
 /** A two-dimensional array of single-character strings, instantiated in the constructor */
 private String[][] letterBlock;
 /** The number of rows of letterBlock, set by the constructor */
 private int numRows;
 /** The number of columns of letterBlock, set by the constructor */
 private int numCols;
 /** Places a string into letterBlock in row-major order.
 * @param str the string to be processed
 * Postcondition:
 * if str.length() < numRows * numCols, "A" is placed in each unfilled cell
 * if str.length() > numRows * numCols, trailing characters are ignored
 */
 private void fillBlock(String str) {
   int j = 0;
   for(int r = 0; r < numRows; r++) {
     for(int c = 0; c < numCols; c++) {
       if(j < str.length()) {
         letterBlock[r][c] = str.substring(j, j + 1);
         j++;
       } else {
         letterBlock[r][c] = "A";
       }
     }
   }
 }
 /** Extracts encrypted string from letterBlock in column-major order.
 * Precondition: letterBlock has been filled
 * @return the encrypted string from letterBlock
 */
 private String encryptBlock()
 { /* implementation not shown */ }
 /** Encrypts a message.
 * @param message the string to be encrypted
 * @return the encrypted message;
 * if message is the empty string, returns the empty string
 */
 public String encryptMessage(String message) {
   if(message.equals("")) {
     return "";
   }
   String out = "";
   int size = numRows * numCols;
   for(int i = 0; i < message.length() - size; i+=size) {
     if(message.length() - i < size) {
       fillBlock(message.substring(i));
     } else {
       fillBlock(message.substring(i, i + size));
     }
     out += encryptBlock();
   }
   return out;
 }
 // There may be instance variables, constructors, and methods that are not shown.
}