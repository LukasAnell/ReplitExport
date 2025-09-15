/* Write a precondition for the grow method from our
* quiz's Cone class and a full Javadoc for the 
* insertSequence method from AP Classroom FRQ 2. */

public class JavadocActivity
{
  private double height;

  /**
  * Increases the cone's height by a factor.
  * @param factor The amount to grow by.
  * Precondition: Factor must be greater than one. 
  */
  public void grow(double factor)
  {
    height *= factor;
  }

  /** Inserts the string segment in the current sequence,
  *  starting at the index ind. Returns the new sequence.
  * (finish the Javadoc with tags and a Precondition)
  * @param segment String that represents a segment that is inserted    * in the sequence
  * @param ind int that represents an index where the the new 
  * segment is returned.
  * @return Returns a String with the String segment inserted     * at index ind.
  * Precondition: ind >= 0 and ind <= the length of the original string and segment cannot be null
  */
  public String insertSegment(String segment, int ind)
  { /* implementation not shown */ }

}