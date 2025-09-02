package hofSequence;

public class NaiveHofstadter extends Hofstadter {

  // Your implementations of the sequence goes here.
  // Recall that you can calculate the nth term, G(n), using:
  // G(n) = n - G(G(n-1))
  // G(0) = 0
  public Integer gSequence(Integer n) {
    if (n == 0) {
      return 0;
    } else {
      Integer result = (n - gSequence(gSequence(n - 1)));
      return result;
    }
  }
}
