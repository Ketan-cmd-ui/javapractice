public class ArrayMinOd {
    public static void main(String[] args) {
     int[] arr = {2, 4, 6, 9, 11};
        int Minimumodd=Integer.MAX_VALUE;;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0  && arr[i]<Minimumodd)

                {
                    Minimumodd=arr[i];
                }
            }
            System.out.println("the minimum odd is : " +Minimumodd);
        }
    }

/*#24 – Find the Minimum Odd Number

Given:

int[] arr = {12, 45, 8, 89, 22, 5, 7};

Expected Output:

Minimum Odd Number = 5
Rules
Use one for loop.
Do not sort the array.
Do not use built-in methods.
Combine:
Odd number check (% 2 != 0)
Smallest element logic */