package joelabs.nashorn;

import java.util.*;

public class Input {
  public final String[] names;
  public int age;

  public Input(final List<String> names, final int age) {
    this.age = age;
    this.names = names.toArray(new String[names.size()]);
  }
}
