package hofSequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HofstadterTest {

  @Test
  void itReturnsTheZerothElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(0, h.gSequence(0));
  }
}
