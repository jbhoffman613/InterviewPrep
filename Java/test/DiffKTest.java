import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class DiffKTest {
  @org.junit.Test
  public void diffPossible() throws Exception {
    DiffK ex1 = new DiffK();
    ArrayList<Integer> num1 = new ArrayList<>();
    num1.add(1);
    num1.add(2);
    num1.add(3);
    assertEquals(ex1.diffPossible(num1, 1), 1);
    assertEquals(ex1.diffPossible(num1, 2), 1);
    assertEquals(ex1.diffPossible(num1, 5), 0);
    assertEquals(ex1.diffPossible(num1, 3), 0);
    assertEquals(ex1.diffPossible(num1, 10), 0);

    ArrayList<Integer> num2 = new ArrayList<>();
    num2.add(1);
    num2.add(2);
    num2.add(2);
    num2.add(3);
    num2.add(4);
    assertEquals(ex1.diffPossible(num1, 1), 1);
  }

}