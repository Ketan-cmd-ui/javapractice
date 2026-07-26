public class ArrayMoveRight {
   public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
  int temp=arr[4];
  for(int i=arr.length-1;i>0;i--)
  {
    arr[i]=arr[i-1];
  }
  arr[arr.length-5]=temp;
    // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
   } 
}

/*
Problem #18: Right Rotate Array by One 
Input
int[] arr = {10, 20, 30, 40, 50};
Expected Output
50 10 20 30 40
*/