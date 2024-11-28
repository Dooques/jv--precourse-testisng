package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.TestObjects.EnglishStudent;
import test.TestObjects.FrenchStudent;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslateKeyTest {

    @Test
    @DisplayName("Translate Key Test 1")
    public void TranslateKeyTest1() {
        EnglishStudent result = ExerciseClasses.TranslateKey.solve(new FrenchStudent("Carla", 21, "Paris"));
        EnglishStudent expectedResult = new EnglishStudent("Carla", 21, "Paris");
        ArrayList<String> resultList = new ArrayList<>(List.of(result.name, String.valueOf(result.age), result.location));
        ArrayList<String> expectedList = new ArrayList<>(List.of(expectedResult.name, String.valueOf(expectedResult.age), expectedResult.location));
        out.println(result);
        out.println(expectedResult);
        assertEquals(expectedList, resultList);
    }

    @Test
    @DisplayName("Translate Key Test 2")
    public void TranslateKeyTest2() {
        EnglishStudent result = ExerciseClasses.TranslateKey.solve(new FrenchStudent("Simone", 28, "Nice"));
        EnglishStudent expectedResult = new EnglishStudent("Simone", 28,"Nice");
        ArrayList<String> resultList = new ArrayList<>(List.of(result.name, String.valueOf(result.age), result.location));
        ArrayList<String> expectedList = new ArrayList<>(List.of(expectedResult.name, String.valueOf(expectedResult.age), expectedResult.location));
        assertEquals(expectedList, resultList);
    }

    @Test
    @DisplayName("Translate Key Test 3")
    public void TranslateKeyTest3() {
        EnglishStudent result = ExerciseClasses.TranslateKey.solve(new FrenchStudent("Gini", 51, "Marseille"));
        EnglishStudent expectedResult = new EnglishStudent("Gini", 51, "Marseille");
        ArrayList<String> resultList = new ArrayList<>(List.of(result.name, String.valueOf(result.age), result.location));
        ArrayList<String> expectedList = new ArrayList<>(List.of(expectedResult.name, String.valueOf(expectedResult.age), expectedResult.location));
        assertEquals(expectedList, resultList);
    }
}
