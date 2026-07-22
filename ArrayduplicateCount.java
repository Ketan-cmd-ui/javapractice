public class ArrayduplicateCount {
    public static void main(String[] args) {
      int[] arr = {12, 45, 7, 45, 23, 12, 12};
      
      int duplicatecount=0;
      
     
      for(int i=0;i<arr.length;i++)
      {  int count=1;
          boolean isduplicate=false;
          for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isduplicate = true;
                    break;
                }
            }

            if(isduplicate)
            {
                continue;
            }

        for(int j=i+1;j<arr.length;j++)
        {
            if (arr[i]==arr[j]) {
                isduplicate=true;
                 count++;
                
            }
          
       
       
     }
    
    System.out.println(arr[i]+ " ouccurs time " +count);
      
    }
}
}

/*
Problem #28 – Count Duplicate Elements (Difficulty: 9.5/10)

This is a level above today's problem.

Given:

int[] arr = {12, 45, 7, 45, 23, 12, 12};

Expected Output:

12 occurs 3 times
45 occurs 2 times
7 occurs 1 time
23 occurs 1 time */