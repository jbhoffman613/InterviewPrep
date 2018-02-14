import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoshHoffman on 2/13/18.
 */
public class Pascal1Test {
  @Test
  public void generate() throws Exception {
    assertEquals(1, 1);

    Pascal1 ex1 = new Pascal1();
    System.out.println(ex1.generate(3));
  }

}