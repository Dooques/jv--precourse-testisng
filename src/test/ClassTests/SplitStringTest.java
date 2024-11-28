package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.FixingBugsClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringTest {

    @Test
    @DisplayName("Split String Test 1")
    public void SplitStringTest1() {
        char[] result = FixingBugsClasses.SplitString.solve(null);
        char[] expectedResult = new char[0];
        assertEquals(expectedResult.length, result.length);
    }

    @Test
    @DisplayName("Split String Test 2")
    public void SplitStringTest2() {
        char[] result = FixingBugsClasses.SplitString.solve("banana");
        char[] expectedResult = new char[]{'b', 'a', 'n', 'a', 'n', 'a'};

        String resultString = new String(result);
        String expectedString = new String(expectedResult);

        assertEquals(expectedString, resultString);
    }

    @Test
    @DisplayName("Split String Test 3")
    public void SplitStringTest3() {
        char[] result = FixingBugsClasses.SplitString.solve("apple");
        char[] expectedResult = new char[]{'a', 'p', 'p', 'l', 'e'};

        String resultString = new String(result);
        String expectedString = new String(expectedResult);

        assertEquals(expectedString, resultString);
    }

    @Test
    @DisplayName("Split String Test 4")
    public void SplitStringTest4() {
        char[] result = FixingBugsClasses.SplitString.solve("cake");
        char[] expectedResult = new char[]{'c', 'a', 'k', 'e'};

        String resultString = new String(result);
        String expectedString = new String(expectedResult);

        assertEquals(expectedString, resultString);
    }
}
