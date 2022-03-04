import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
        int n, target;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements the array:");
        n=sc.nextInt(); //number of elements in the array

        int[] arr=new int[n+1];
        System.out.println("Enter the elements in the array in either ascending or descending order:");
        for(int i=0; i<=n; i++) //entering elements in the array
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to be searched:");
        target=sc.nextInt(); //number to be searched

        int index=binSearch(arr, target); //index of the target elememts

        if(index==-1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.println("Item found at index:"+index);
        }
    }
    static int binSearch(int[] arr2,int target)
    {
        int start=0; //setting start value
        int end= arr2.length-1; //setting end value
        boolean isAsc=arr2[start]<arr2[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2; //calculating mid value

            if(arr2[mid]==target)
            {
                return mid; //returning the index of the target value if present
            }

            if(isAsc==true) //if the array is in ascending order
            {
                if (target < arr2[mid])
                {
                    end=mid-1;
                }
                else if(target > arr2[mid])
                {
                    start=mid+1;
                }
            }
            else if(isAsc==false) //if the array is in descending order
            {
                if (target > arr2[mid])
                {
                    end=mid-1;
                }
                else if(target < arr2[mid])
                {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
