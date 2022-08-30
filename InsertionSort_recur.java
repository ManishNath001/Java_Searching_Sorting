import java.io.*;

public class InsertionSort_recur 
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

        insertionRecur(arr, n);
        System.out.println();

        for(int j=0; j<n; j++)
        {
            System.out.print(arr[j]+" ");
        }    
    }
    
    static void insertionRecur(int[] arr, int n)
    {
        if(n<=1)
        {
            return;
        }
        insertionRecur(arr, n-1);

        int last=arr[n-1];
        int j=n-2;

        while(j>=0 && arr[j]>last)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    } 
}
