package joelabs.nashorn;

import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class NashornDemoTest {
  @Test
  public void test() {
    final Nashorn n = new Nashorn(1);
    n.inc();
    assertThat(n.a(), is(equalTo(2)));
  }
}
