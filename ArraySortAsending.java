public class ArraySortAsending {
    public static void main(String[] args) {
        boolean isSorted=true;
     
        int[] arr = {10, 20, 30, 40, 50};
      for(int i=0;i<arr.length -1;i++)
        {
         if(arr[i] > arr[i + 1])
         {
           isSorted=false;
             break;
           }
        
        }
         if (isSorted)
         {
            System.out.println("the array is sorted ");
         }
         else
         {
            System.out.println("not sorrted ");
         }
        

         }
        
       
}

/*



(Difficulty: 9/10)

Problem #26 – Check if an Array is Sorted (Ascending)

Given:

int[] arr = {10, 20, 30, 40, 50};

Output:

Array is sorted

Given:

int[] arr = {10, 30, 20, 40, 50};

Output:

Array is not sorted

This is another classic interview question that teaches you how to compare adjacent elements.*/