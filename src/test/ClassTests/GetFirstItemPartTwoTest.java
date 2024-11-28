package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.FixingBugsClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetFirstItemPartTwoTest {

    @Test
    @DisplayName("Get First Item Part 2")
    public void getFirstItemPart2() {
        String result = FixingBugsClasses.GetFirstItemPartTwo.solve(new ArrayList<>());
        assertNull(result);
        
        String result2 = FixingBugsClasses.GetFirstItemPartTwo.solve(new ArrayList<>(List.of("apple", "orange", "banana", "pomegranate")));
        assertEquals("apple", result2);
    }

    @Test
    @DisplayName("Get First Item Part 1 Test 3")
    public void GetFirstItemP2T3() {
        String result = FixingBugsClasses.GetFirstItemPartTwo.solve(new ArrayList<>(List.of("banana", "orange", "apple", "pomegranate")));
        String expectedResult = "banana";
        assertEquals(expectedResult, result);
    }
}
