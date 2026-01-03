
import java.util.*;
class Trans
{
    int arr[][] , m;
    Trans(int mm)
    {
        m= mm;
    }
    void fillarray()
    {
        Scanner sc= new Scanner( System.in);
        arr= new int[m][m];
        for (int i= 0; i< m ; i++)
        {
            for ( int j = 0; j< m ; j++)
            {
                System.out.println( " enter array element");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void transpose()
    {
        int t;
        for (int i= 0; i< m ; i++)
        {
            for ( int j = i+1; j< m ; j++)
            {
               t=  arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i]= t;
            }
        }
    }
    void display()
    {
        System.out.println(" the original matrix = ");
        for (int i= 0; i< m ; i++)
        {
            for ( int j = 0; j< m ; j++)
            {
                System.out.print(arr[i][j]+ "  ");
            }
          System.out.println() ;
        }
        transpose();
        System.out.println(" the transpose of given matrix");
         for (int i= 0; i< m ; i++)
        {
            for ( int j = 0; j< m ; j++)
            {
                System.out.print(arr[i][j]+ "  ");
            }
          System.out.println() ;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter size of array");
       int  mm = sc.nextInt();
        
        Trans obj= new Trans(mm);
        obj.fillarray();
        obj.display();
    }
}
        
    
