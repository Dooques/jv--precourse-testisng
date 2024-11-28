package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    @Test
    @DisplayName("Number Test 1")
    public void LargestNumberTest1() {
        int result = ExerciseClasses.LargestNumber.solve(3);
        int expectedResult = 3;
        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("Number Test 2")
    public void LargestNumberTest2() {
        int result = ExerciseClasses.LargestNumber.solve(123);
        int expectedResult = 321;
        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("Number Test 3")
    public void LargestNumberTest3() {
        int result = ExerciseClasses.LargestNumber.solve(937486);
        int expectedResult = 987643;
        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("Number Test 4")
    public void LargestNumberTest4() {
        int result = ExerciseClasses.LargestNumber.solve(43);
        int expectedResult = 43;
        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("Number Test 5")
    public void LargestNumberTest5() {
        int result = ExerciseClasses.LargestNumber.solve(100);
        int expectedResult = 100;
        assertEquals(result, expectedResult);
    }


    @Test
    @DisplayName("Number Test 6")
    public void LargestNumberTest6() {
        int result = ExerciseClasses.LargestNumber.solve(195723853);
        int expectedResult = 987553321;
        assertEquals(result, expectedResult);
    }
}
