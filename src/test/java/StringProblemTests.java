import org.junit.Test;
import stringStuff.RunLengthEncoder;
import stringStuff.StringProblems;

import static org.junit.Assert.*;

public class StringProblemTests {

    @Test
    public void testPalindrome(){
        StringProblems sp = new StringProblems();
        assertFalse(sp.isPalindrome("Raymond"));
        assertTrue(sp.isPalindrome("anna"));
        assertTrue(sp.isPalindrome("Gutug"));
        assertFalse(sp.isPalindrome("Gutag"));
    }

    @Test
    public void testValidIPs(){
        StringProblems sp = new StringProblems();
        assertEquals(sp.validIpAddresses("19216811").size(), 9);
        assertEquals(sp.validIpAddresses("1001").size(), 1);
        assertEquals(sp.validIpAddresses("1001").get(0), "1.0.0.1");
    }
    @Test
    public void testStringLengthEncoding(){
        RunLengthEncoder rle = new RunLengthEncoder();
        assertEquals("3a5b2c", rle.encode("aaabbbbbcc"));
        assertEquals("aaabbbbbcc", rle.decode("3a5b2c"));


    }


}
