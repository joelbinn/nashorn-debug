package joelabs.nashorn;

import java.util.*;

public class Input {
  public final String[] names;

  public Input(final List<String> names) {
    this.names = names.toArray(new String[names.size()]);
  }
}
