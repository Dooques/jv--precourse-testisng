package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetFactorialsTest {

    @Test
    @DisplayName("Factorials Test")
    public void getFactorialsTest() {
        ArrayList<Integer> result = ExerciseClasses.GetFactorials.solve(new ArrayList<>());
        ArrayList<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, result);

        ArrayList<Integer> result2 = ExerciseClasses.GetFactorials.solve(new ArrayList<>(List.of(4)));
        ArrayList<Integer> expectedList2 = new ArrayList<>(List.of(24));
        assertEquals(expectedList2, result2);

        ArrayList<Integer> result3 = ExerciseClasses.GetFactorials.solve(new ArrayList<>(List.of(3, 4)));
        ArrayList<Integer> expectedList3 = new ArrayList<>(List.of(6, 24));
        assertEquals(expectedList3, result3);

        ArrayList<Integer> result4 = ExerciseClasses.GetFactorials.solve(new ArrayList<>(List.of(3)));
        ArrayList<Integer> expectedList4 = new ArrayList<>(List.of(6));
        assertEquals(expectedList4, result4);

        ArrayList<Integer> result5 = ExerciseClasses.GetFactorials.solve(new ArrayList<>(List.of(1, 5, 2)));
        ArrayList<Integer> expectedList5 = new ArrayList<>(List.of(1, 120, 2));
        assertEquals(expectedList5, result5);
    }
}
