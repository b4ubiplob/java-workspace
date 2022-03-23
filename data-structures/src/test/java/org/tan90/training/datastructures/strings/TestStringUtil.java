package org.tan90.training.datastructures.strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestStringUtil {

    @Test
    public void testIsUnique() {
        String str = "abcdefgh";
        boolean result = StringUtil.isUnique(str);
        assertTrue(result);

        str = "abcdefghabc";
        result = StringUtil.isUnique(str);
        assertFalse(result);
    }

    @Test
    public void testIsPermutation() {

        String str1 = "abcdefg";
        String str2 = "agedcfb";    

        boolean result = StringUtil.isPermutation(str1, str2);
        assertTrue(result);

        str1 = "abcdefg";
        str2 = "agedc";    

        result = StringUtil.isPermutation(str1, str2);
        assertFalse(result);

        str1 = "abcdefg";
        str2 = "agedcwq";    

        result = StringUtil.isPermutation(str1, str2);
        assertFalse(result);
    }

    @Test
    public void testUrlify() {
        String str = "Mr John Smith";
        String expectedResult = "Mr%20John%20Smith";
        String result = StringUtil.urlify(str);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCheckIfPermutationPalidrome() {
        String str = "abcdedcba";
        assertTrue(StringUtil.checkIfPermutionPalindrome(str));

        str = "aannddeccccbb";
        assertTrue(StringUtil.checkIfPermutionPalindrome(str));

        str = "aannddeccccbbv";
        assertFalse(StringUtil.checkIfPermutionPalindrome(str));

        str = "abcd";
        assertFalse(StringUtil.checkIfPermutionPalindrome(str));
    }
    
    
    @Test
    public void testLengthOfLongestSubstring() {
    	String str = "abcabcbb";
    	assertEquals(3, StringUtil.lengthOfLongestSubstring(str));
    	
    	str = "bbbbb";
    	assertEquals(1, StringUtil.lengthOfLongestSubstring(str));
    	
    	str = "pwwkew";
    	assertEquals(3, StringUtil.lengthOfLongestSubstring(str));
    	
    	str = "dvdf";
    	assertEquals(3, StringUtil.lengthOfLongestSubstring(str));
    }
}
