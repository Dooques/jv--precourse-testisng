package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.TestObjects.PersonCity;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TallyPeopleInManchesterTest {

    @Test
    @DisplayName("Tally People Test 1")
    public void TallyPeopleTest1() {
        int result = ExerciseClasses.TallyPeopleInManchester.solve(new ArrayList<>(List.of(new PersonCity("Callum", "Edinburgh", false))));
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Tally People Test 2")
    public void TallyPeopleTest2() {
        int result = ExerciseClasses.TallyPeopleInManchester.solve(new ArrayList<>(Arrays.asList(new PersonCity("Callum", "Edinburgh", false), new PersonCity("Diane", "Manchester", false))));
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Tally People Test 3")
    public void TallyPeopleTest3() {
        int result = ExerciseClasses.TallyPeopleInManchester.solve(new ArrayList<>(Arrays.asList(new PersonCity("Callum", "Edinburgh", false), new PersonCity("Diane", "Manchester", false), new PersonCity("Egbert", "Manchester", true))));
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Tally People Test 4")
    public void TallyPeopleTest4() {
        int result = ExerciseClasses.TallyPeopleInManchester.solve(new ArrayList<>(Arrays.asList(new PersonCity("Callum", "Edinburgh", false), new PersonCity("Diane", "Manchester", false), new PersonCity("Egbert", "Manchester", true), new PersonCity("Francesco", "Liverpool", true))));
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }
}
