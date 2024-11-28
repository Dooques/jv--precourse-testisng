package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetWordLengthsTest {

    @Test
    @DisplayName("Word Length Test 1")
    public void GetWordLengthsTest1() {
        ArrayList<Integer> result = ExerciseClasses.GetWordLengths.solve("");
        ArrayList<Integer> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Word Length Test 2")
    public void GetWordLengthsTest2() {
        ArrayList<Integer> result = ExerciseClasses.GetWordLengths.solve("hello");
        ArrayList<Integer> expectedResult = new ArrayList<>(List.of(5));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Word Length Test 3")
    public void GetWordLengthsTest3() {
        ArrayList<Integer> result = ExerciseClasses.GetWordLengths.solve("hello everyone");
        ArrayList<Integer> expectedResult = new ArrayList<>(List.of(5, 8));
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Word Length Test 4")
    public void GetWordLengthsTest4() {
        ArrayList<Integer> result = ExerciseClasses.GetWordLengths.solve("this is a sentence");
        ArrayList<Integer> expectedResult = new ArrayList<>(List.of(4, 2, 1, 8));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Word Length Test 5")
    public void GetWordLengthsTest5() {
        ArrayList<Integer> result = ExerciseClasses.GetWordLengths.solve("I am writing some Java today");
        ArrayList<Integer> expectedResult = new ArrayList<>(List.of(1, 2, 7, 4, 4, 5));
        assertEquals(expectedResult, result);
    }
}
