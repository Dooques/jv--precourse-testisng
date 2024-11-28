package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.TestObjects.Person;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FindFirstDentistTest {

        @Test
        @DisplayName("Dentist Test")
        public void findFirstDentistTest() {
            String result = ExerciseClasses.FindFirstDentist.solve(new ArrayList<>());
            assertNull(result);

            String result2 = ExerciseClasses.FindFirstDentist.solve(new ArrayList<>(List.of(
                    new Person("Callum", false)
            )));
            assertNull(result2);

            String result3 = ExerciseClasses.FindFirstDentist.solve(new ArrayList<>(Arrays.asList(
                    new Person("Callum", false),
                    new Person("Diane", false)
            )));
            assertNull(result3);

            String result4 = ExerciseClasses.FindFirstDentist.solve(new ArrayList<>(Arrays.asList(
                    new Person("Callum", false),
                    new Person("Diane", false),
                    new Person("Egbert", true)
            )));
            assertEquals("Egbert", result4);

            String result5 = ExerciseClasses.FindFirstDentist.solve(new ArrayList<>(Arrays.asList(
                    new Person("Callum", false),
                    new Person("Diane", false),
                    new Person("Egbert", true),
                    new Person("Francesco", true)
            )));
            assertEquals("Egbert", result5);
        }
}
