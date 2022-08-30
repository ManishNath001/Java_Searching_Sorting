import java.io.*;

public class BubbleSort 
{
    public static void main(String[] args)throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] s=br.readLine().split(",");
        
        for(int i=0; i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }

        int[] sortedarr=new int[n];
        sortedarr=bubbleSort(arr);
        System.out.println();
        for(int j=0; j<n; j++)
        {
            System.out.print(sortedarr[j]+" ");
        }
    }

    static int[] bubbleSort(int[] arr)
    {
       int n=arr.length;
       for(int i=0; i<n-1; i++)
       {
            for(int j=0; j<n-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
       } 
       return arr;
    }
}
