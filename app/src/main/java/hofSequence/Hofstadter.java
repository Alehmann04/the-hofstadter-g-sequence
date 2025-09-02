package hofSequence;

abstract class Hofstadter {

  // Your implementations of the sequence goes here.
  // Recall that you can calculate the nth term, G(n), using:
  // G(n) = n - G(G(n-1))
  // G(0) = 0
  public abstract Integer gSequence(Integer n);
}
