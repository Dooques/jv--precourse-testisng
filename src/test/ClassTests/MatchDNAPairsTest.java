package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatchDNAPairsTest {

    @Test
    @DisplayName("Match DNA Char Values Test")
    public void MatchDNACharValues() {
        ArrayList<String> charValues = new ArrayList<>(List.of("", "G", "C", "T", "A", "g", "c", "t", "a"));
        ArrayList<ArrayList<String>> expectedResults = new ArrayList<>(List.of(
                new ArrayList<>(List.of()),
                new ArrayList<>(List.of("GC")),
                new ArrayList<>(List.of("CG")),
                new ArrayList<>(List.of("TA")),
                new ArrayList<>(List.of("AT")),
                new ArrayList<>(List.of("GC")),
                new ArrayList<>(List.of("CG")),
                new ArrayList<>(List.of("TA")),
                new ArrayList<>(List.of("AT"))));
        ArrayList<ArrayList<String>> testResults = new ArrayList<>();
        for (String item : charValues) {
            ArrayList<String> result = ExerciseClasses.MatchDNAPairs.solve(item);
            testResults.add(result);
        }
        out.println(testResults);
        out.println(expectedResults);

        assertEquals(expectedResults, testResults);
    }

    @Test
    @DisplayName("Match DNA Pairs String Value 1")
    public void MatchDNAStringValues1() {
        ArrayList<String> result = ExerciseClasses.MatchDNAPairs.solve("GAT");
        ArrayList<String> expectedResult = new ArrayList<>(List.of("GC", "AT", "TA"));
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Match DNA Pairs String Value 2")
    public void MatchDNAStringValues2() {
        ArrayList<String> result = ExerciseClasses.MatchDNAPairs.solve("GYTC");
        ArrayList<String> expectedResult = new ArrayList<>(List.of("GC", "TA", "CG"));
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Match DNA Pairs String Value 3")
    public void MatchDNAStringValues3() {
        ArrayList<String> result = ExerciseClasses.MatchDNAPairs.solve("gat");
        ArrayList<String> expectedResult = new ArrayList<>(List.of("GC", "AT", "TA"));
        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Match DNA Pairs String Value 4")
    public void MatchDNAStringValues4() {
        ArrayList<String> result = ExerciseClasses.MatchDNAPairs.solve("gxat");
        ArrayList<String> expectedResult = new ArrayList<>(List.of("GC", "AT", "TA"));
        assertEquals(expectedResult, result);
    }
}
