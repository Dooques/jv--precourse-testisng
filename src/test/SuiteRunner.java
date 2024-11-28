package test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.ClassTests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CountGroceriesTest.class,
        FindFirstDentistTest.class,
        FlipBooleansTest.class,
        GetFactorialsTest.class,
        GetFirstItemPartTwoTest.class,
        GetFirstItemPartTwoTest.class,
        GetPalindromesTest.class,
        GetPugOwnersTest.class,
        GetWilliamsTest.class,
        GetWordLengthsTest.class,
        IsValidMobileNumberTest.class,
        LargestNumberTest.class,
        LocateWrongFruitTest.class,
        MatchDNAPairsTest.class,
        MessyCalculatorTest.class,
        PlaylistDurationTest.class,
        ReplaceLetterWithXTest.class,
        SendPartyInvitesTest.class,
        SplitStringTest.class,
        SumDigitsTest.class,
        SumEvenNumbersTest.class,
        TallyHashtagsAndMentionsTest.class,
        TallyPeopleInManchesterTest.class,
        TranslateKeyTest.class
})

public class SuiteRunner {
}
