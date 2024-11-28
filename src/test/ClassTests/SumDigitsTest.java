package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitsTest {

    @Test
    @DisplayName("Sum Digits Test 1")
    public void SumDigitsTest1() {
        int result = ExerciseClasses.SumDigitsFromString.solve("");
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Digits Test 2")
    public void SumDigitsTest2() {
        int result = ExerciseClasses.SumDigitsFromString.solve("1");
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Digits Test 3")
    public void SumDigitsTest3() {
        int result = ExerciseClasses.SumDigitsFromString.solve("168");
        int expectedResult = 15;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Digits Test 4")
    public void SumDigitsTest4() {
        int result = ExerciseClasses.SumDigitsFromString.solve("northcoders");
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Digits Test 5")
    public void SumDigitsTest5() {
        int result = ExerciseClasses.SumDigitsFromString.solve("01010101");
        int expectedResult = 4;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Digits Test 6")
    public void SumDigitsTest6() {
        int result = ExerciseClasses.SumDigitsFromString.solve("x0d1e0t1s0a1g0e1");
        int expectedResult = 4;
        assertEquals(expectedResult, result);

    }
}
