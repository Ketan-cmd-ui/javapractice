package String;

public class StringfirstNonReapting {
    public static void main(String[] args) {
        String str = "swiss";
        boolean isUnique = false;
        for (int i = 0; i < str.length(); i++) {
            isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("first non-repeating " + str.charAt(i));
                break;
            }
        }
    }

}
/*
 * 
 * String Problem #6 — Find the First Non-Repeating Character
 * 
 * This is similar to the array problem you already solved, so this should be
 * much easier.
 * 
 * Problem
 * 
 * Given:
 * 
 * String str = "swiss";
 * 
 * Find the first character that appears only once.
 * 
 * Expected output
 * w
 * 
 * Because:
 * 
 * s → appears 3 times
 * w → appears 1 time
 * 
 * So w is the first non-repeating character.
 * 
 * Another example
 * String str = "aabbcdde";
 * 
 * Output:
 * 
 * c
 * 
 * Because:
 * 
 * a → 2
 * b → 2
 * c → 1
 * Your approach
 * 
 * You already solved this exact pattern with arrays.
 * 
 * Think:
 * 
 * for (int i = 0; i < str.length(); i++) {
 * 
 * // assume current character is unique
 * 
 * for (int j = 0; j < str.length(); j++) {
 * 
 * // compare current character
 * }
 * 
 * // if unique → print it and stop
 * }
 * Important
 * 
 * Don't write code yet.
 */