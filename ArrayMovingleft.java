public class ArrayMovingleft {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int temp = arr[0];

        // Shift every element one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place the first element at the end
        arr[arr.length - 1] = temp;

        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*Problem #17: Left Rotate Array by One

Example:

Input:
{10,20,30,40,50}

Output:
{20,30,40,50,10}7 */