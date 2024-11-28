package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetPugOwnersTest {

    @Test
    @DisplayName("Palindromes Test 1")
    public void PalindromesTest1() {
        ArrayList<String> result = ExerciseClasses.GetPalindromes.solve(new ArrayList<>());
        ArrayList<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Palindromes Test 2")
    public void PalindromesTest2() {
        ArrayList<String> result = ExerciseClasses.GetPalindromes.solve(new ArrayList<>(List.of("racecar")));
        ArrayList<String> expectedResult = new ArrayList<>(List.of("racecar"));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Palindromes Test 3")
    public void PalindromesTest3() {
        ArrayList<String> result = ExerciseClasses.GetPalindromes.solve(new ArrayList<>(List.of("zracecar")));
        ArrayList<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Palindromes Test 4")
    public void PalindromesTest4() {
        ArrayList<String> result = ExerciseClasses.GetPalindromes.solve(new ArrayList<>(List.of("dog", "dud", "car", "mum")));
        ArrayList<String> expectedResult = new ArrayList<>(List.of("dud", "mum"));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Palindromes Test 5")
    public void PalindromesTest5() {
        ArrayList<String> result = ExerciseClasses.GetPalindromes.solve(new ArrayList<>(List.of("apple", "orange", "banana", "mum")));
        ArrayList<String> expectedResult = new ArrayList<>(List.of("mum"));
        assertEquals(expectedResult, result);
    }
}
