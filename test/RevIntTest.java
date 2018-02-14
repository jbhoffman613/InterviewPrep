import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class RevIntTest {
  @Test
  public void reverse() throws Exception {

    // Before coding, the below 5 tests were designed in order to have a TDD process when implementing
    RevInt ex1 = new RevInt();
    assertEquals(ex1.reverse(1), 1);
    assertEquals(ex1.reverse(11), 11);
    assertEquals(ex1.reverse(123), 321);
    assertEquals(ex1.reverse(-123), -321);
    assertEquals(ex1.reverse(10000), 1);
    assertEquals(ex1.reverse(-1146467285), 0);
  }

}