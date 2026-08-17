package String;
public class StringAnagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        // Step 1: Length check
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        boolean[] used = new boolean[s2.length()];
        boolean isAnagram = true;

        // Step 2: Traverse s1
        for (int i = 0; i < s1.length(); i++) {

            boolean found = false;

            // Step 3: Search current character in s2
            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i) == s2.charAt(j) && !used[j]) {

                    used[j] = true;
                    found = true;
                    break;
                }
            }

            // Character was not found
            if (!found) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
/*
#6: Anagram Check

This is one of the top Java interview questions.

Problem

Check whether two strings are anagrams.

Two strings are anagrams if they contain the same characters with the same frequency, but possibly in a different order.

Example 1
String s1 = "listen";
String s2 = "silent";

Output:

Anagram
Example 2
String s1 = "hello";
String s2 = "world";

Output:

Not Anagram */