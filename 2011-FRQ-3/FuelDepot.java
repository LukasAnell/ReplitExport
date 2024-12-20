public class FuelDepot {
  /** The robot used to move the filling mechanism */
 private FuelRobot filler;
 
  /** The list of fuel tanks */
 private List<FuelTank> tanks;
 
  /** Determines and returns the index of the next tank to be filled.
 * @param threshold fuel tanks with a fuel level £ threshold may be filled
 * @return index of the location of the next tank to be filled
 * Postcondition: the state of the robot has not changed
 */
 public int nextTankToFill(int threshold) {
   int smallestIndex = -1;
   int smallest = threshold;
   for(int i = 0; i < tanks.size(); i++) {
     if(tanks.get(i).getFuelLevel() <= smallest) {
       smallest = tanks.get(i).getFuelLevel();
       smallestIndex = i;
     }
   }

   if(smallestIndex == -1) {
     return filler.currentIndex();
   }
   return smallestIndex;
 }
  
 /** Moves the robot to location locIndex.
 * @param locIndex the index of the location of the tank to move to
 * Precondition: 0 £ locIndex < tanks.size()
 * Postcondition: the current location of the robot is locIndex
 */
 public void moveToLocation(int locIndex) {
   int robotLocation = filler.currentIndex();
   if(!filler.isFacingRight()) {
     filler.changeDirection();
   }
   if(locIndex < currentIndex) {
     filler.changeDirection();
   }
   filler.moveForward(Math.abs(locIndex - currentIndex));
 }
  
 // There may be instance variables, constructors, and methods that are not shown.
}