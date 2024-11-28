package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlipBooleansTest {

    @Test
    @DisplayName("Flip Booleans")
    public void FlipBooleans() {
        boolean[] result = ExerciseClasses.FlipBooleans.solve(new boolean[]{true, false, false, true});
        assertArrayEquals(new boolean[]{ false, true, true, false}, result);

        boolean[] result2 = ExerciseClasses.FlipBooleans.solve(new boolean[]{ false, false, false, false, false});
        assertArrayEquals(new boolean[]{ true, true, true, true, true}, result2);

        boolean[] result3 = ExerciseClasses.FlipBooleans.solve(new boolean[]{ true, false, true, false});
        assertArrayEquals(new boolean[]{ false, true, false, true}, result3);
    }
}
