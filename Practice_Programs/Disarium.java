import java.util.*;
class Disarium
{
int num,size;
Disarium(int nn)
{
    num= nn;
    size= 0;
}
void countDigit()
{
    int p = num;
    while(p>0)
    {
        size++;
        p=p/10;
    }
}
int SumofDigits(int n, int p)
{
    if (n == 0)
    return 0;
    else
    return SumofDigits(n/10,p-1)+(int)Math.pow(n%10,p);
}
void check()
{
    if(num== SumofDigits(num,size))
    System.out.println(" it is a disarium number");
    else
    System.out.println(" it is not  a disarium number");
    
}
public static void main(String args[])
{
    int m;
    Scanner sc= new Scanner (System.in);
    System.out.println("enter a number=");
    m= sc.nextInt();
    Disarium obj= new Disarium(m);
    obj.countDigit();
    obj.check();
}
}
