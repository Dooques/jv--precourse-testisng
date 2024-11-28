package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.RefactoringClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CountGroceriesTest {

    @Test
    @DisplayName("Groceries Test")
    public void countGroceriesTest() {
        int result = RefactoringClasses.CountGroceries.solve(new String[]{"Apple", "Banana", "Orange", "Milk"});
        assertEquals(40, result);

        int result2 = RefactoringClasses.CountGroceries.solve(new String[]{"Banana", "Orange", "Milk"});
        assertEquals(30, result2);

        int result3 = RefactoringClasses.CountGroceries.solve(new String[]{"Apple", "Banana", "Orange", "Milk", "Milk", "Cheese"});
        assertEquals(60, result3);

        int result4 = RefactoringClasses.CountGroceries.solve(new String[]{"Apple"});
        assertEquals(10, result4);

        int result5 = RefactoringClasses.CountGroceries.solve(new String[]{});
        assertEquals(0, result5);
    }
}
