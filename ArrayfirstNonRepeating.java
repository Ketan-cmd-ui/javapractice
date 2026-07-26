public class ArrayfirstNonRepeating {
    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 2, 1, 4, 5};

        boolean isUnique = false;

        for (int i = 0; i < arr.length; i++) {

            isUnique = true;

            for (int j = 0; j < arr.length; j++) {

                // Ignore comparing the element with itself
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First Non-Repeating Element = " + arr[i]);
                break;
            }
        }
    }
}

/*Problem #19: Find the First Non-Repeating Element

Input:

int[] arr = {4, 5, 1, 2, 1, 4, 5};

Expected Output:

First Non-Repeating Element = 2
 */