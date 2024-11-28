package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.FixingBugsClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetFristItemPartOneTest {

    @Test
    @DisplayName("Get First Item Part 1 Test 1")
    public void GetFirstItemP1T1() {
        String result = FixingBugsClasses.GetFirstItemPartOne.solve(new ArrayList<>(List.of("apple", "orange", "banana", "pomegranate")));
        String expectedResult = "apple";
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get First Item Part 1 Test 2")
    public void GetFirstItemP1T2() {
        String result = FixingBugsClasses.GetFirstItemPartOne.solve(new ArrayList<>(List.of("banana", "orange", "apple", "pomegranate")));
        String expectedResult = "banana";
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Get First Item Part 1 Test 3")
    public void GetFirstItemP1T3() {
        int result = FixingBugsClasses.GetFirstItemPartOne.solve(new ArrayList<>(List.of(2, 3, 4, 5)));
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }
}
