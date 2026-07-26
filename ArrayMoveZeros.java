public class ArrayMoveZeros {
    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 12, 0, 7};

        int index = 0;

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill the remaining positions with 0
        for (int j = index; j < arr.length; j++) {
            arr[j] = 0;
        }

        // Step 3: Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*


Problem #30 – Move All Zeros to the End

Given:

int[] arr = {0, 5, 0, 3, 12, 0, 7};

Expected output:

5 3 12 7 0 0 0
Rules
 Don't create another array.
 Modify the same array.
 Use loops only.
 Don't use sorting.*/