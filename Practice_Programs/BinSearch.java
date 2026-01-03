import java.util.*;
class BinSearch
{
    int arr[];
    int n;
    BinSearch(int nn)
    {
        n= nn;
        
    }
    void fillarray()
    {
        arr= new int[n];// block creation
        for(int i=0; i<n; i++)// taking array elemts
        {
            Scanner sc= new Scanner(System.in);
            System.out.println(" enter array element");
            arr[i] = sc.nextInt();
        }
    }
    void sort()// selection sort
    {
        for(int i= 0; i<n-1; i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int t;
                if(arr[i]>arr[j])
                {
                    t= arr[i];
                    arr[i]= arr[j];
                    arr[j]=t;
                }
            }
        }
    }
    int bin_search(int l,int u,int v)//binary search
    {
        int m= (l+u)/2;// assuming there are odd no. of entries
        if(arr[m] == v)// special case value found mid way
        return m;
        else
        if(l>u)//fall through case value not found 
        return -1;
        else
        if(arr[m]> v)//found to thr left of array { general case}
        return bin_search(l,m-1,v);
        else // or present at right of array { general case}
        return bin_search(m+1,u,v);
        
    }
    public static void main (String args[])
    {
        BinSearch obj= new BinSearch(4);
        obj.fillarray();
        obj.sort();
        if(obj.bin_search(0,3,20)== -1)
        System.out.println("the element not found ");
        else 
         System.out.println("the element found at position  "+ obj.bin_search(0,3,20)+ " of sorted array");
        
    }
}
