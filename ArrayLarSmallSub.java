public class ArrayLarSmallSub {
   public static void main(String[] args) {
    int[] arr = {10, 4, 15, 2, 20};
     int largest=arr[0];
     int smallest=arr[0];
  
    for(int i=0;i<arr.length;i++)
    {
      
       
        if(largest<arr[i])
        {
            largest=arr[i];
        }
        else if (smallest > arr[i])
        {
            smallest=arr[i];
        }
       
       
    }
    
    System.out.println("the largest is :" +largest);
    System.out.println("the smallest is : " +smallest);
    System.out.println("differnce : " + (largest - smallest));
   } 
}
/*
Find the Largest Difference

Given:

int[] arr = {10, 4, 15, 2, 20};

Find the difference between the largest and smallest element.

Expected Output
Largest = 20
Smallest = 2
Difference = 18
Algorithm (Think First)

Don't write code yet.

Tell me your approach.

For example:

Traverse the array.
Find the largest element.
Find the smallest element.
Subtract smallest from largest.
Print the result.
*/