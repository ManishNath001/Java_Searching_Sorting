import java.util.Scanner;

public class Linear_Search
{
    public static void main(String[] args)
    {
        int n, target;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements the array:");
        n=sc.nextInt(); //number of elements in the array

        int[] arr=new int[n+1];
        System.out.println("Enter the elements in the array:");
        for(int i=0; i<=n; i++) //entering elements in the array
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to be searched:");
        target=sc.nextInt(); //number to be searched

        int index=linSearch(arr, target); //index of the target elememts

        if(index==-1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.println("Item found at index:"+index);
        }
    }


    static int linSearch(int[] arr2,int num)
    {
        if(arr2.length==0) //checking if length of the array is 0
        {
            return -1;
        }
        for(int j=0; j<=arr2.length-1; j++)
        {
            if(arr2[j]==num) //checking for the number
            {
                return j;
            }
        }
        return -1;
    }
}