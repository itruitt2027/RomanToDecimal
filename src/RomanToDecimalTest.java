import static org.junit.Assert.*;
/**
 * A junit test for testing different types of user entry. (Emiliano showed me what JUnit tests are.)
 */
public class RomanToDecimalTest {

    @org.junit.Test
    /*
      Putting in the tests for each of the values that are logical and non-logical.
     */
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("I"),1);
        assertEquals(RomanToDecimal.romanToDecimal("II"),2);
        assertEquals(RomanToDecimal.romanToDecimal("III"),3);
        assertEquals(RomanToDecimal.romanToDecimal("IV"),4);
        assertEquals(RomanToDecimal.romanToDecimal("V"),5);
        assertEquals(RomanToDecimal.romanToDecimal("X"),10);
        assertEquals(RomanToDecimal.romanToDecimal("XV"),15);
        assertEquals(RomanToDecimal.romanToDecimal("XVI"),16);
        assertEquals(RomanToDecimal.romanToDecimal("XVII"),17);
        assertEquals(RomanToDecimal.romanToDecimal("XVIII"),18);
        assertEquals(RomanToDecimal.romanToDecimal("XX"),20);
        assertEquals(RomanToDecimal.romanToDecimal("XI"),11);
        assertEquals(RomanToDecimal.romanToDecimal("XII"),12);
        assertEquals(RomanToDecimal.romanToDecimal("XV"),25);
        assertEquals(RomanToDecimal.romanToDecimal("XXX"),30);
        assertEquals(RomanToDecimal.romanToDecimal("ur mom"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("NO"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("potato"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("goblin"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("IXHAHA"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("poop"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("coding"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("0102012"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("COOL"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("WOW"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("VOOBER"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("Basketball"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("Soccer"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("WaterPolo"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("Tennis"),-1);
        }
}