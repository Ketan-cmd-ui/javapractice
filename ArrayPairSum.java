public class ArrayPairSum {
    public static void main(String[] args) {
      int[] arr = {2, 7, 4, 5, 3, 1};
      int target = 6; 
      for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                   System.out.println(arr[i]+ "+"+ arr[j] +"="+ target);
                }
            }
        } 
    }
}
/*

#29 – Find All Pairs with a Given Sum

Given:

int[] arr = {2, 7, 4, 5, 3, 1};
int target = 6;

Expected Output:

2 + 4 = 6
5 + 1 = 6*/