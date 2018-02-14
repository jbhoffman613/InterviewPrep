import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class Pascal1Test {
  @Test
  public void generate() throws Exception {
    Pascal1 ex1 = new Pascal1();
    assertEquals(ex1.generate(3).toString(), "[[1], [1, 1], [1, 2, 1]]");
    assertEquals(ex1.generate(0).toString(), "[]");
    assertEquals(ex1.generate(1).toString(), "[[1]]");
    assertEquals(ex1.generate(5).toString(), "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
  }

}