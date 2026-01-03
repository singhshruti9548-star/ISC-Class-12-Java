
import java.util.*;
class SymmetricMatrix
{
  public static void main(String args[])
  {
      int n, i,j,fl=0;
      Scanner sc= new Scanner (System.in);
      System.out.println("Enter size ");// taking size from user
      n= sc.nextInt();
     int  arr[][]=new int[n][n];// block creation
      for (i=0;i<n; i++)
      {                    // taking array element 
          for (j= 0; j<n ; j++)
          {
              System.out.println(" enter array element");
              arr[i][j] = sc.nextInt();
          }
      }
      for (i=0;i<n; i++)
      {                    // taking array element 
          for (j= 0; j<n ; j++)
          {
              if ( arr[i][j] != arr[j][i])
              { 
                  fl= 1;
                  break;
              }
         }
     }
     if (fl==1)
     System.out.println(" not a symmetric matrix");
     else
     System.out.println("  a symmetric matrix");
   }
} 
