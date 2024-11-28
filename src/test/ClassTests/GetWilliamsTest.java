package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetWilliamsTest {

    @Test
    @DisplayName("Get Williams Test 1")
    public void GetWilliamsTest1() {
        ArrayList<String> result = ExerciseClasses.GetWilliams.solve(new ArrayList<>());
        ArrayList<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get Williams Test 2")
    public void GetWilliamsTest2() {
        ArrayList<String> result = ExerciseClasses.GetWilliams.solve(new ArrayList<>(List.of("David Williams")));
        ArrayList<String> expectedResult = new ArrayList<>(List.of("David Williams"));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get Williams Test 3")
    public void GetWilliamsTest3() {
        ArrayList<String> result = ExerciseClasses.GetWilliams.solve(new ArrayList<>(List.of("David Williams", "Sarah Williams")));
        ArrayList<String> expectedResult = new ArrayList<>(List.of("David Williams", "Sarah Williams"));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get Williams Test 4")
    public void GetWilliamsTest4() {
        ArrayList<String> result = ExerciseClasses.GetWilliams.solve(new ArrayList<>(List.of("Kirsty February")));
        ArrayList<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get Williams Test 5")
    public void GetWilliamsTest5() {
        ArrayList<String> result = ExerciseClasses.GetWilliams.solve(new ArrayList<>(List.of("Kirsty February", "Sam Williams")));
        ArrayList<String> expectedResult = new ArrayList<>(List.of("Sam Williams"));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get Williams Test 6")
    public void GetWilliamsTest6() {
        ArrayList<String> result = ExerciseClasses.GetWilliams.solve(new ArrayList<>(List.of("William David", "Cole Williamson", "Williams Jameson")));
        ArrayList<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }
}
