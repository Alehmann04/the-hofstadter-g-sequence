package hofSequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImprovedHofstadterTest {

  ImprovedHofstadter hofstadter = new ImprovedHofstadter();

  // from https://oeis.org/A005206
  int[] first100 = {
    0,
    1,
    1,
    2,
    3,
    3,
    4,
    4,
    5,
    6,
    6,
    7,
    8,
    8,
    9,
    9,
    10,
    11,
    11,
    12,
    12,
    13,
    14,
    14,
    15,
    16,
    16,
    17,
    17,
    18,
    19,
    19,
    20,
    21,
    21,
    22,
    22,
    23,
    24,
    24,
    25,
    25,
    26,
    27,
    27,
    28,
    29,
    29,
    30,
    30,
    31,
    32,
    32,
    33,
    33,
    34,
    35,
    35,
    36,
    37,
    37,
    38,
    38,
    39,
    40,
    40,
    41,
    42,
    42,
    43,
    43,
    44,
    45,
    45,
    46,
    46,
    47,
  };

  @Test
  void itReturnsTheZerothElementInTheSequence() {
    int result = this.hofstadter.gSequence(0);
    try {
      assertEquals(first100[0], result);
    } catch (java.lang.AssertionError error) {
      System.out.println(
        "Calculated: " + result + "  Expected: " + first100[0]
      );
    }
  }

  @Test
  void itReturnsTheTenthElementInTheSequence() {
    int result = this.hofstadter.gSequence(10);
    try {
      assertEquals(first100[9], result);
    } catch (java.lang.AssertionError error) {
      System.out.println(
        "Calculated: " + result + "  Expected: " + first100[9]
      );
    }
  }

  @Test
  void itReturnsTheTwentiethElementInTheSequence() {
    int result = this.hofstadter.gSequence(20);
    try {
      assertEquals(first100[19], result);
    } catch (java.lang.AssertionError error) {
      System.out.println(
        "Calculated: " + result + "  Expected: " + first100[19]
      );
    }
  }

  @Test
  void itReturnsTheThirtiethElementInTheSequence() {
    int result = this.hofstadter.gSequence(30);
    try {
      assertEquals(first100[29], result);
    } catch (java.lang.AssertionError error) {
      System.out.println(
        "Calculated: " + result + "  Expected: " + first100[29]
      );
    }
  }

  @Test
  void itReturnsTheFourtiethElementInTheSequence() {
    int result = this.hofstadter.gSequence(40);
    try {
      assertEquals(first100[39], result);
    } catch (java.lang.AssertionError error) {
      System.out.println(
        "Calculated: " + result + "  Expected: " + first100[39]
      );
    }
  }

  @Test
  void itReturnsTheFiftiethElementInTheSequence() {
    int result = this.hofstadter.gSequence(50);
    try {
      assertEquals(first100[49], result);
    } catch (java.lang.AssertionError error) {
      System.out.println(
        "Calculated: " + result + "  Expected: " + first100[49]
      );
    }
  }
}
