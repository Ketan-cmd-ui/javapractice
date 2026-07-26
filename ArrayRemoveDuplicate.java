public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
      int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};  
      int index=0;
   
      for(int i=0;i<arr.length-1;i++)
      {
         if(arr[i]==arr[i+1])
         {
            /*skip */
         }
         else{
            index++; /* initial at 0 */
            arr[index] = arr[i+1];
           
         }
   
      }
            
         for (int i = 0; i <= index; i++) {
    System.out.print(arr[i] + " ");
}
    }
}
/*Problem #19: Remove Duplicates from a Sorted Array 
Input
int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
Expected Output
1 2 3 4 5
Another Example
Input
int[] arr = {10, 10, 20, 30, 30, 40, 40, 40, 50};
Expected Output
10 20 30 40 50
 Rules
 Do not use HashSet, ArrayList, or any Collections.
 Do not create another array.
 Solve it using the same array.
 Time Complexity target: O(n).
 */