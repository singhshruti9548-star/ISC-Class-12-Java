import java.util.*;
class combine
{
    int com[] ;
    int size;
    Combine(int nn)
    {
        size = nn;
        com = new int[size];
    }
    void inputarray()
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
        System.out.println("enter array element");
        com[i] = sc.nextInt();
        }
    }
    void sort()
    {
        for(int i =0; i< size-1;i++)// first element
        {
             for(int j =i+1; j< size ;j++)// second element
             {
                 if(com[i]> com[j])
                 {
                 int t = com[i];
                 com[i]=com[j];
                 com[j]=t;
                 }
             }
        }
    }
    }
