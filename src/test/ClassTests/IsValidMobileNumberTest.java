package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidMobileNumberTest {

    @Test
    @DisplayName("Valid Number Test 1")
    public void IsValidNumberTest1() {
        boolean result = ExerciseClasses.IsValidMobileNumber.solve("07726");
        assertFalse(result);
    }


    @Test
    @DisplayName("Valid Number Test 2")
    public void IsValidNumberTest2() {
        boolean result = ExerciseClasses.IsValidMobileNumber.solve("07123456789");
        assertTrue(result);
    }


    @Test
    @DisplayName("Valid Number Test 3")
    public void IsValidNumberTest3() {
        boolean result = ExerciseClasses.IsValidMobileNumber.solve("+447123456789");
        assertTrue(result);
    }


    @Test
    @DisplayName("Valid Number Test 4")
    public void IsValidNumberTest4() {
        boolean result = ExerciseClasses.IsValidMobileNumber.solve("00447123456789");
        assertTrue(result);
    }


    @Test
    @DisplayName("Valid Number Test 5")
    public void IsValidNumberTest5() {
        boolean result = ExerciseClasses.IsValidMobileNumber.solve("0712345678!");
        assertFalse(result);
    }


    @Test
    @DisplayName("Valid Number Test 6")
    public void IsValidNumberTest6() {
        boolean result = ExerciseClasses.IsValidMobileNumber.solve("07123456789!");
        assertFalse(result);
    }
}
