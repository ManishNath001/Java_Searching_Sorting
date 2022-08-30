import java.io.*;

public class InsertionSort 
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

        int[] sortedarr=new int[n];
        sortedarr=insertionSort(arr);
        System.out.println();

        for(int j=0; j<n; j++)
        {
            System.out.print(arr[j]+" ");
        }
    }

    static int[] insertionSort(int arr[])
    {
        int n=arr.length;
        for(int i=1; i<n-1; i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
