import java.util.*;
class DeciHex
{
    int num;
    String hexa;
    DeciHex()
    {
        num = 0;
        hexa= " ";
    }
    void getNum()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter a integer number=");
        num=sc.nextInt();
        
    }
    void convert(int n)
    {
        char arr[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(n>0)
      {
        int b = n %16;
        convert(n/16);
        hexa =hexa +arr[b];
        
       }
    }
    void display()
    {
        System.out.println("the decimal number is " +num);
        convert(num);
         System.out.println("the decimal number is " +hexa);
    }
    public static void main(String args[])
    {
        DeciHex obj= new DeciHex();
        obj.getNum();
        obj.display();
    }
}
    
        
    

    

