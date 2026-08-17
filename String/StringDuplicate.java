package String;

public class StringDuplicate {
    public static void main(String[] args) {
        String str = "banana";
        boolean isDuplicate;
        int count;
        for (int i = 0; i < str.length(); i++) {
            isDuplicate = false;
            count = 1;
            for (int k = 0; k < i; k++) // this loop check duplicated appered
            {
                if (str.charAt(i) == str.charAt(k)) {
                    isDuplicate = true;
                    break;
                }
            }
            // Skip if already counted
            if (isDuplicate) {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);

        }
    }
}
/*
 * 
 * 4 – Count Character Frequency
 * 
 * This is a very common interview question.
 * 
 * Problem
 * 
 * Count how many times each character appears.
 * 
 * Example
 * String str = "banana";
 * Expected Output
 * b = 1
 * a = 3
 * n = 2
 */