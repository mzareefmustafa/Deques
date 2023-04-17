import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();
    @Test
    public void testEqualChars() {
        assertTrue(offByOne.equalChars('b', 'c'));
        assertTrue(offByOne.equalChars('a', 'b'));
        assertTrue(offByOne.equalChars('y', 'z'));
        assertFalse(offByOne.equalChars('a', 'n'));
        assertFalse(offByOne.equalChars('m', 'x'));
        assertTrue(offByOne.equalChars('@', 'A'));
        assertFalse(offByOne.equalChars(' ', '"'));
        assertTrue(offByOne.equalChars('%', '&'));

    }
    // Your tests go here.
}
