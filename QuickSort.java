import java.io.*;
public class QuickSort 
{
    public static void main(String[] args)throws IOException 
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }

        quickSort(arr, 0, n-1);
        System.out.println();

        for(int j=0; j<n; j++)
        {
            System.out.print(arr[j]+" ");
        }        
    } 
    
    static void quickSort(int[] arr,int low,int high )
    {
        if(low<high)
        {
            int pivot=partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low; j<high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp1=arr[i];
        arr[i]=pivot;
        arr[high]=temp1;
        return i;
    }
}
