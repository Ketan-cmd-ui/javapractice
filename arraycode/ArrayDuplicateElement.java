public class ArrayDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {12, 45, 7, 89, 23,45};

      boolean isduplicate=false;
      for(int i=0;i<arr.length;i++)
      {
        for(int j =i+1 ;j<arr.length;j++)
        {  
            if(arr[i]==arr[j])
            {
                isduplicate=true;
                break;
            }
        }
        if(isduplicate)
        {
            break;
        }

      }
      if(isduplicate)
      {
        System.out.println("the duplicate found");
      }
      else{
        System.out.println("duplicate not found");
      }

    }
}
/*
#27 – Check if an Array Contains Duplicate Elements

Given:

int[] arr = {12, 45, 7, 89, 23, 45};
Expected Output
Duplicate Found

Another example:

int[] arr = {12, 45, 7, 89, 23};
Expected Output
No Duplicate Found
Rules
✅ Do not sort the array.
✅ Do not use HashSet, ArrayList, or any Collections.
✅ Use loops only.
✅ Stop checking as soon as you find a duplicate. */