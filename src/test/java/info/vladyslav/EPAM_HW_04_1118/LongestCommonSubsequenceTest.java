package info.vladyslav.EPAM_HW_04_1118;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    public void testNotNull() {
        assertNotNull(longestCommonSubsequence);
    }

    @Test
    public void testSubstring1() {
        assertEquals(longestCommonSubsequence.substring("ace", "acer"), "ace");
    }

    @Test
    public void testSubstring2() {
        assertEquals(longestCommonSubsequence.substring("asdfdstzzz", "fdsttyuu"), "fdst");
    }

    @Test
    public void testSubstringShortLength() {
        assertEquals(longestCommonSubsequence.substring("asdfdstzzz", "aftyuu"), "");
    }

}