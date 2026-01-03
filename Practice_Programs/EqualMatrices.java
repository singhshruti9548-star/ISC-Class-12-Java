import java.util.*;
class EquiMat
{
    int a[][],m,n;
    EquiMat(int mm, int nn)
    {
        m= mm;
        n= nn;
    }
    void readarray()
    {
        a= new int [m][n];
        Scanner sc= new Scanner( System.in);
        for(int i= 0; i<m; i++)
        {
            for (int j= 0; j<n ;j++)
            {
                
                System.out.println(" enter array elements=");
                a[i][j]= sc.nextInt();
            }
        }
    }
    int check(EquiMat P,EquiMat Q)
    {
       for(int i= 0; i<P.m; i++)
        {
            for (int j= 0; j<P.n ;j++) 
            {
                if(P.a[i][j]!=Q.a[i][j])
                return 0;
            }
        }
            return 1;
    }
    void print()
    {
        for (int i= 0; i< m ; i++)
        {
            for ( int j = 0; j< n; j++)
            {
                System.out.print(a[i][j]+ "  ");
            }
          System.out.println() ;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter no,of rows=");
        int mm= sc.nextInt();
        System.out.println(" enter no,of columns=");
        int nn= sc.nextInt();
        EquiMat P= new EquiMat(mm,nn);
        EquiMat Q= new EquiMat(mm,nn);
        System.out.println("enter elemts of first matrix");
        P.readarray();
        System.out.println("enter elemts of second matrix");
        Q.readarray();
        System.out.println(" first matrix");
         P.print();
          System.out.println(" second  matrix");
        Q.print();
        int x= P.check(P,Q);  // "this "keyword refering to current object is not used in static methods therefore we use objects  (P or Q) in this case
        if(x==1)
        System.out.println(" these are Equal matrix");
        else 
        System.out.println("  these are not Equal matrix");
        
        
    }
        
    }  
        
    
