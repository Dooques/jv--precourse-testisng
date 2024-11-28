package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.TestObjects.Song;
import test.classPackages.FixingBugsClasses;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistDurationTest {

    private final Song s1 = new Song("Song1", 180, true);
    private final Song s2 = new Song("Song2", 240, true);
    private final Song s3 = new Song("Song3", 210, false);
    private final Song s4 = new Song("Song4", 300, true);
    private final Song s5 = new Song("Song5", 190, false);

    @Test
    @DisplayName("Playlist Duration Test 1")
    public void PlaylistDurationTest1() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s1));
        int expectedResult = 180;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Playlist Duration Test 2")
    public void PlaylistDurationTest2() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s2));
        int expectedResult = 240;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Playlist Duration Test 3")
    public void PlaylistDurationTest3() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s1, s2, s4));
        int expectedResult = 720;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Playlist Duration Test 4")
    public void PlaylistDurationTest4() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s1, s2, s4, s4));
        int expectedResult = 1020;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Playlist Duration Test 5")
    public void PlaylistDurationTest5() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s2, s3, s4));
        int expectedResult = 540;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Playlist Duration Test 6")
    public void PlaylistDurationTest6() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s1, s2, s4, s4, s1, s2));
        int expectedResult = 1440;
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Playlist Duration Test 7")
    public void PlaylistDurationTest7() {
        int result = FixingBugsClasses.PlaylistDuration.solve(List.of(s1, s2, s3, s4, s5));
        int expectedResult = 720;
        assertEquals(expectedResult, result);
    }
}
