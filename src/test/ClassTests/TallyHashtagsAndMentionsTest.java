package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.ExerciseClasses;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TallyHashtagsAndMentionsTest {

    @Test
    @DisplayName("Hashtag Mentions Test 1")
    public void HashtagMentionsTest1() {
        Map<String, Integer> result = ExerciseClasses.TallyHashtagsAndMentions.solve("So excited to start at @northcoders on Monday! #learntocode #codingbootcamp");
        Map<String, Integer> expectedResult = Map.of("mentions", 1, "hashtags", 2);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Hashtag Mentions Test 2")
    public void HashtagMentionsTest2() {
        Map<String, Integer> result = ExerciseClasses.TallyHashtagsAndMentions.solve("So excited to start at @northcoders on Monday! #codingbootcamp");
        Map<String, Integer> expectedResult = Map.of("mentions", 1, "hashtags", 1);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Hashtag Mentions Test 3")
    public void HashtagMentionsTest3() {
        Map<String, Integer> result = ExerciseClasses.TallyHashtagsAndMentions.solve("Hey @coolperson! You should come join a #codingbootcamp @northcoders");
        Map<String, Integer> expectedResult = Map.of("mentions", 2, "hashtags", 1);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Hashtag Mentions Test 4")
    public void HashtagMentionsTest4() {
        Map<String, Integer> result = ExerciseClasses.TallyHashtagsAndMentions.solve("Having a nice sandwich for lunch");
        Map<String, Integer> expectedResult = Map.of("mentions", 0, "hashtags", 0);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Hashtag Mentions Test 5")
    public void HashtagMentionsTest5() {
        Map<String, Integer> result = ExerciseClasses.TallyHashtagsAndMentions.solve("Having a nice sandwich for lunch #whocares #lunch #sandwich #icare #hashtag");
        Map<String, Integer> expectedResult = Map.of("mentions", 0, "hashtags", 5);
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Hashtag Mentions Test 6")
    public void HashtagMentionsTest6() {
        Map<String, Integer> result = ExerciseClasses.TallyHashtagsAndMentions.solve("");
        Map<String, Integer> expectedResult = Map.of("mentions", 0, "hashtags", 0);
        assertEquals(expectedResult, result);
    }
}
