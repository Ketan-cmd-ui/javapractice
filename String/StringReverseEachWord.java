package String;

public class StringReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is easy";
        String eachwordreverse = "";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                eachwordreverse += str.charAt(i);

            } else {
                for (int j = eachwordreverse.length() - 1; j >= 0; j--) {
                    reverse += eachwordreverse.charAt(j);

                }
                reverse += " ";
                eachwordreverse = "";

            }

        }
        for (int j = eachwordreverse.length() - 1; j >= 0; j--) {
            reverse += eachwordreverse.charAt(j);
        }
        System.out.println(reverse);
    }
}
/*
 * String Problem #9 — Reverse Each Word
 * 
 * Now let's increase the difficulty slightly, not jump to another hard problem.
 * 
 * Given:
 * 
 * String str = "Java is easy";
 * 
 * Expected output:
 * 
 * avaJ si ysae
 * 
 * Another example:
 * 
 * "I love Java"
 * 
 * Output:
 * 
 * "I evol avaJ"
 * Think about what you already know
 * 
 * You already know how to:
 * 
 * Traverse a string
 * Detect spaces
 * Reverse a string using a loop
 * Count words
 * 
 * Now combine those ideas.
 */