public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
    
        int reverse=arr[4];
        for(int i=arr.length-1;i>=0;i--)
        {
           System.out.println(arr[i]); 
        }
        
    }
}
/*(Difficulty: 8/10)

Let's increase the difficulty slightly.

Problem #20 – Reverse an Array (Print Only)

Given:

int[] arr = {12, 45, 7, 89, 23};

Expected output:

23
89
7
45
12
Rules
Use one for loop.
Do not create a second array.
Just print the elements in reverse order. */