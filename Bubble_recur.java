import java.io.*;

public class Bubble_recur 
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

        bubbleRecur(arr, n);
        System.out.println();

        for(int j=0; j<n; j++)
        {
            System.out.print(arr[j]+" ");
        }
    }    

    static void bubbleRecur(int[] arr, int n)
    {
        
        if(n==1)
        {
            return;
        }

        int count=0;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        if(count==0)
        {
                return;
        }
        bubbleRecur(arr, n-1);
    }
}
