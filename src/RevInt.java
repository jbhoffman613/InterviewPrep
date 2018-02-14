import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class RevInt {

  /**
   * Reverse digits of an integer
   * @param a Integer
   * @return  Integer or 0 if the result overflows and does not fit in a 32 bit signed integer
   */
  public int reverse(int a) {
    //Check if there is just one digit
    if(a < 10 && a > -10) {
      return a;
    }

    //Record if a is negative or not
    boolean negative = false;
    String asStr;

    // Given the above if statement, it is an invariant that a has at least 2 dihits.
    if(a < 0) {
      negative = true;
      asStr = Integer.toString(a);
      asStr = asStr.substring(1, asStr.length());
    }
    else {
      asStr = Integer.toString(a);
    }

    // Make it a list and reverse
    String reversed;
    ArrayList<String> collectionStr = new ArrayList<String>(Arrays.asList(asStr.split("")));
    Collections.reverse(collectionStr);
    reversed = String.join("", collectionStr);
    int finalString;
    try {
      finalString = Integer.parseInt(reversed);
    } catch (NumberFormatException e) {
      finalString = 0;
    }


    if(negative) {
      finalString = finalString * -1;
    }

    return finalString;
  }
}
