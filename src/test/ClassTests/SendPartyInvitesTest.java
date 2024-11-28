package test.ClassTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.classPackages.FixingBugsClasses;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendPartyInvitesTest {

    @Test
    @DisplayName("Send Party Invites Test 1")
    public void SendPartyInvitesTest1() {
        List<String> result = FixingBugsClasses.SendPartyInvites.solve(List.of("Alice", "Bob", "Charlie", "David"));
        List<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Send Party Invites Test 2")
    public void SendPartyInvitesTest2() {
        List<String> result = FixingBugsClasses.SendPartyInvites.solve(List.of("Paul", "Bob", "Charlie", "David"));
        List<String> expectedResult = List.of("Paul");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Send Party Invites Test 3")
    public void SendPartyInvitesTest3() {
        List<String> result = FixingBugsClasses.SendPartyInvites.solve(List.of("Paul", "John", "George", "Ringo"));
        List<String> expectedResult = List.of("Paul", "John", "George");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Send Party Invites Test 4")
    public void SendPartyInvitesTest4() {
        List<String> result = FixingBugsClasses.SendPartyInvites.solve(List.of("Jurgen", "Virgil", "Luis", "Darwin"));
        List<String> expectedResult = List.of("Jurgen", "Virgil", "Luis", "Darwin");
        assertEquals(expectedResult, result);
    }
}
