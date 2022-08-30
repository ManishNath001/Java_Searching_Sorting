import java.io.*;

public class SelectionSort 
{
    public static void main(String[] args)throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] s=br.readLine().split(",");

        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        
        int[] sortarr=new int[n];
        sortarr=selectionSort(arr);
        System.out.println("Sorted Array:");

        for(int j=0; j<n; j++)
        {
            System.out.print(sortarr[j]);
        }
    }    

    static int[] selectionSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min=i;
            
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
