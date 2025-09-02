package hofSequence;

import java.util.HashMap;

public class ImprovedHofstadter extends Hofstadter {

  HashMap<Integer, Integer> dic = new HashMap<Integer, Integer>();

  // Your implementations of the sequence goes here.
  // Recall that you can calculate the nth term, G(n), using:
  // G(n) = n - G(G(n-1))
  // G(0) = 0
  public Integer gSequence(Integer n) {
    if (n == 0) {
      return 0;
    }
    if (this.dic.containsKey(n)) {
      return this.dic.get(n);
    } else {
      Integer result = (n - gSequence(gSequence(n - 1)));
      dic.put(n, result);
      return result;
    }
  }
}
