import java.util.ArrayList;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class Pascal1 {

  /**
   * Given numRows, generate the first numRows of Pascal’s triangle.
   * @param a an integer representing the number of rows
   * @return  a 2 dimensional arraylist
   */
  public ArrayList<ArrayList<Integer>> generate(int a) {
    ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();

    for(int i = 0; i < a; i ++) {
      pascal.add(new ArrayList<Integer>());
      for(int j = 0; j <= i; j++) {
        if(pascal.size() > 1) {
          int toAdd1;
          int toAdd2;

          // Check to make sure that we are still in bounds
          try {
            toAdd1 = pascal.get(i - 1).get(j);
          } catch (IndexOutOfBoundsException e) {
            toAdd1 = 0;
          }

          // Check to make sure that we are still in bounds
          try {
            toAdd2 = pascal.get(i - 1).get(j - 1);
          } catch (IndexOutOfBoundsException e) {
            toAdd2 = 0;
          }

          //Add element to pascal object
          pascal.get(i).add(toAdd1 + toAdd2);
        }
        else {
          pascal.get(0).add(1);
        }
      }
    }

    return pascal;
  }
}
