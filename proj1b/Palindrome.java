public class Palindrome {

    public Deque<Character> wordToDeque(String word) {
        ArrayDeque<Character> filler = new ArrayDeque<>();
        for (int letter = 0; letter < word.length(); letter++) {
            filler.addLast(word.charAt(letter));
        }
        return filler;
    }

    public boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        Deque<Character> normal = wordToDeque(word);
        /*if (word.length() == 0 || word.length() == 1) {
            return true;
        } else {*/
        while (normal.size() > 1) {
            if (normal.removeFirst() != normal.removeLast()) {
                return false;
            }
        }
        return true;
    }

    /*Deque<Character> normal = wordToDeque(word);
    if (normal == null) {
        return false;
    } else if (word.length() == 0 || word.length() == 1) {
        return true;
    } else {
        ArrayDeque<Character> backwards = new ArrayDeque<Character>();
        for (int letter = 0; letter < word.length(); letter++) {
            backwards.addFirst(word.charAt(letter));
        }
        if (normal.equals(backwards)) {
            return true;
        } else {
            return false;
        }
    }*/
    public boolean isPalindrome(String word, CharacterComparator cc) {
        if (word == null) {
            return false;
        } else if (word.length() == 1 || word.length() == 0) {
            return true;
        }
        int i = 0;
        while (i < (word.length() / 2)) {
            char beginning = word.charAt(i);
            char ending = word.charAt(word.length() - (i + 1));
            i++;
            if (cc.equalChars(beginning, ending)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

