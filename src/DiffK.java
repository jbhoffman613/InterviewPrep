import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class DiffK {

  /**
   * Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
   * @param a An ArrayList of Integers
   * @param b an integer
   * @return 1 if the above is true and 0 if the above is false.
   */
  public int diffPossible(ArrayList<Integer> a, int b) {
    HashMap<Integer, Integer> pairs = new HashMap<>();

    for(int i = 0; i < a.size(); i++) {
      pairs.put(a.get(i) + b, i);
    }

    System.out.println(pairs);
    for(int j = 0; j < a.size(); j++) {
      if(pairs.get(a.get(j)) != null && pairs.get(a.get(j)) != j) {
        return 1;
      }
    }

    return 0;

  }
}
