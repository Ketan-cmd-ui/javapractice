package String;

public class StringCountDigitSpecialchar {
    public static void main(String[] args) {
        String str = "Java123@#";
        int Letters = 0;
        int digit = 0;
        int special = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                Letters++;
            } else if (Character.isDigit(str.charAt(i))) {
                digit++;
            } else {
                special++;
            }

        }
        System.out.println("the letters : " + Letters);
        System.out.println("the digit : " + digit);
        System.out.println("the special : " + special);
    }
}
/*
 * String Problem #8 — Count Digits, Letters and Special Characters
 * 
 * Given:
 * 
 * String str = "Java123@#";
 * 
 * Expected output:
 * 
 * Letters = 4
 * Digits = 3
 * Special Characters = 2
 * Your task
 * 
 * Use a loop and check each character.
 * 
 * Think about these Java methods:
 * 
 * Character.isLetter()
 * Character.isDigit()
 * 
 * Don't write the code yet.
 * 
 * Tell me your algorithm first:
 * 
 * What will you check first?
 * What will you check second?
 * When will you count a character as a special character?
 */