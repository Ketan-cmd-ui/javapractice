package String;

public class StringCount {
    public static void main(String[] args) {

        String str = "Java is very easy";
        int countword = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countword++;
            }
        }
        System.out.println(countword);
    }
}
/*
 * String Problem #7 — Count Words in a String
 * 
 * Given:
 * 
 * String str = "Java is very easy";
 * Expected output
 * Number of words = 4
 * 
 * Another example:
 * 
 * String str = "I love Java";
 * 
 * Output:
 * 
 * Number of words = 3
 * Your task
 * 
 * Don't use:
 * 
 * split()
 * 
 * Use a loop.
 * 
 * Think about what separates one word from another.
 * 
 * For:
 * 
 * Java is very easy
 * ↑ ↑ ↑
 * spaces
 * Tell me your algorithm first:
 * How will you traverse the string?
 * What character will you look for?
 * When will you increase the word count?
 */