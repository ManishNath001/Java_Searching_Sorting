import java.io.*;

public class MergeSort {
    public static void main(String[] args)throws IOException
    {
        int n;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        n=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        
        int[] arr=new int[n];
        
        for(int i=0; i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }

        
        merge( arr, 0, n-1 );
        
        System.out.println();
        
        for(int j=0; j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }

    static void merge(int arr[], int l, int r)
    {

        if(l<r)
        {
            int mid=l+((r-l)/2);

            merge(arr, l, mid);
            merge(arr, mid+1, r);
            mergeSort(arr, l, mid, r);
        }
    }

    static void mergeSort(int arr[], int l, int mid, int r)
    {
        int indx1=l;
        int indx2=mid+1;
        int m=0;
        
        
        int[] arr1=new int[r-l+1];

        while(indx1<=mid && indx2<=r)
        {
            if(arr[indx1]<arr[indx2])
            {
                arr1[m++]=arr[indx1++];
            }
            else
            {
                arr1[m++]=arr[indx2++];
            }
        }

        while(indx1<=mid)
        {
            arr1[m++]=arr[indx1++];
        }

        while(indx2<=r)
        {
            arr1[m++]=arr[indx2++];
        }

        for(int i=0, j=l; i<arr1.length; i++, j++)
        {
            arr[j]=arr1[i];
        }
    }
}
