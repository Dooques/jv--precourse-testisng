package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceLetterWithXTest {

    @Test
    @DisplayName("Replace Text Test 1")
    public void ReplaceWithXTest1() {
        String result = ExerciseClasses.ReplaceLettersWithX.solve("");
        String expectedResults = "";
        assertEquals(expectedResults, result);
    }

    @Test
    @DisplayName("Replace Text Test 2")
    public void ReplaceWithXTest2() {
        String result = ExerciseClasses.ReplaceLettersWithX.solve("a");
        String expectedResults = "X";
        assertEquals(expectedResults, result);
    }

    @Test
    @DisplayName("Replace Text Test 3")
    public void ReplaceWithXTest3() {
        String result = ExerciseClasses.ReplaceLettersWithX.solve("A");
        String expectedResults = "X";
        assertEquals(expectedResults, result);
    }

    @Test
    @DisplayName("Replace Text Test 4")
    public void ReplaceWithXTest4() {
        String result = ExerciseClasses.ReplaceLettersWithX.solve("hello");
        String expectedResults = "XXXXX";
        assertEquals(expectedResults, result);
    }

    @Test
    @DisplayName("Replace Text Test 5")
    public void ReplaceWithXTest5() {
        String result = ExerciseClasses.ReplaceLettersWithX.solve("hello!");
        String expectedResults = "XXXXX!";
        assertEquals(expectedResults, result);
    }

    @Test
    @DisplayName("Replace Text Test 6")
    public void ReplaceWithXTest6() {
        String result = ExerciseClasses.ReplaceLettersWithX.solve("Do you like coding?");
        String expectedResults = "XX XXX XXXX XXXXXX?";
        assertEquals(expectedResults, result);
    }
}
