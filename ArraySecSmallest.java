public class ArraySecSmallest {
    public static void main(String[] args) {
     int[] arr = {12, 7, 7, 8, 23};

      int smallest=arr[0];
      int secondSmallest=arr[0];
      for(int i=0;i < arr.length;i++)
      {
        if (arr[i]<smallest)
        {
            secondSmallest=smallest;
            smallest=arr[i];
        }
       else if (arr[i] > smallest && arr[i] < secondSmallest)
        {
            secondSmallest=arr[i];
        }
      }
      System.out.println(" the smallest  is :" + smallest);
      System.out.println("the second smallest is : "+ secondSmallest);
    }
}

/*
Problem #25 – Find the Second Smallest Element

Given:

int[] arr = {12, 45, 7, 89, 23};
Expected Output
Smallest = 7
Second Smallest = 12
Rules
✅ Use one for loop.
✅ Do not sort the array.
✅ Do not use built-in methods.
✅ Use two variables:
smallest
secondSmallest
 */