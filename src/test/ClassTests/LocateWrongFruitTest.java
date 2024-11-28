package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocateWrongFruitTest {

    @Test
    @DisplayName("Fruit Test 1")
    public void LocateWrongFruitTest1() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>());
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Fruit Test 2")
    public void LocateWrongFruitTest2() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>(List.of("apple", "apple", "apple", "apple", "elppa", "apple")));
        int expectedResult = 4;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Fruit Test 3")
    public void LocateWrongFruitTest3() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>(List.of("apple", "apple", "elppa")));
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Fruit Test 4")
    public void LocateWrongFruitTest4() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>(List.of("apple", "elppa", "apple")));
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Fruit Test 5")
    public void LocateWrongFruitTest5() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>(List.of("banana", "ananab", "banana", "banana")));
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Fruit Test 6")
    public void LocateWrongFruitTest6() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>(List.of("ananab", "ananab", "banana", "ananab")));
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Fruit Test 7")
    public void LocateWrongFruitTest7() {
        int result = ExerciseClasses.LocateWrongFruit.solve(new ArrayList<>(List.of("apple", "elppa")));
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }
}
