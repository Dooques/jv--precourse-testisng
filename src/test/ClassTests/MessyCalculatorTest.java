package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.RefactoringClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessyCalculatorTest {

    @Test
    @DisplayName("Messy Calculator Addition Test")
    public void MessyCalculatorAdditionTest() {
        double result = RefactoringClasses.MessyCalculator.checkFunctionChoice(1, 2, 2);
        double expectedResult = 4;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Messy Calculator Subtraction Test")
    public void MessyCalculatorSubtractionTest() {
        double result = RefactoringClasses.MessyCalculator.checkFunctionChoice(2, 7, 4);
        double expectedResult = 3;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Messy Calculator Multiplication Test")
    public void MessyCalculatorMultiplicationTest() {
        double result = RefactoringClasses.MessyCalculator.checkFunctionChoice(3, 4, 4);
        double expectedResult = 16;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Messy Calculator Mutliply By Zero Test")
    public void MessyCalculatorMultiplyByZeroTest() {
        double result = RefactoringClasses.MessyCalculator.checkFunctionChoice(3, 4, 0);
        double expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Messy Calculator Division Test")
    public void MessyCalculatorDivisionTest() {
        double result = RefactoringClasses.MessyCalculator.checkFunctionChoice(4, 32, 4);
        double expectedResult = 8;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Messy Calculator Invalid Choice Test")
    public void MessyCalculatorInvalidChoiceTest() {
        double result = RefactoringClasses.MessyCalculator.checkFunctionChoice(5, 4, 4);
        double expectedResult = 0;
        assertEquals(expectedResult, result);
    }
}
