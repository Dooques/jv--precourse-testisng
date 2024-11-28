package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.FixingBugsClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumEvenNumbersTest {

    @Test
    @DisplayName("Sum Even Numbers 1")
    public void SumEvenNumbersTest1() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(0, 0);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Sum Even Numbers 2")
    public void SumEvenNumbersTest2() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(0, 5);
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Even Numbers 3")
    public void SumEvenNumbersTest3() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(0, 10);
        int expectedResult = 30;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Even Numbers 4")
    public void SumEvenNumbersTest4() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(1, 10);
        int expectedResult = 30;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Even Numbers 5")
    public void SumEvenNumbersTest5() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(10, 12);
        int expectedResult = 22;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Even Numbers 6")
    public void SumEvenNumbersTest6() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(11, 12);
        int expectedResult = 12;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Even Numbers 7")
    public void SumEvenNumbersTest7() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(4, 8);
        int expectedResult = 18;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Sum Even Numbers 8")
    public void SumEvenNumbersTest8() {
        int result = FixingBugsClasses.SumEvenNumbers.solve(3, 8);
        int expectedResult = 18;
        assertEquals(expectedResult, result);
    }
}
