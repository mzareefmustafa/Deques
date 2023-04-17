import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }
    @Test
    public void testIsPalindrome() {
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("a"));
        assertFalse(palindrome.isPalindrome("cat"));
        assertTrue(palindrome.isPalindrome("racecar"));
        assertTrue(palindrome.isPalindrome("noon"));
        assertFalse(palindrome.isPalindrome("horse"));
        assertFalse(palindrome.isPalindrome("rancor"));
        assertFalse(palindrome.isPalindrome("aaaaab"));
        assertFalse(palindrome.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeComp() {
        CharacterComparator check = new OffByOne();
        assertTrue(palindrome.isPalindrome("", check));
        assertTrue(palindrome.isPalindrome("zyzy", check));
        assertTrue(palindrome.isPalindrome("f", check));
        assertTrue(palindrome.isPalindrome("flake", check));
       // assertTrue(palindrome.isPalindrome("", check));
        assertFalse(palindrome.isPalindrome("zxzx", check));
        assertFalse(palindrome.isPalindrome("bb", check));
        assertFalse(palindrome.isPalindrome("rancor", check));
        assertFalse(palindrome.isPalindrome("aaaaab", check));
        assertFalse(palindrome.isPalindrome(null, check));
    }

}   //Uncomment this class once you've created your Palindrome class.
