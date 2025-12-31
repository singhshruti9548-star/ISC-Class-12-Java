import java.util.*; 
class NumDude
{
  int num;
NumDude()
{
num=0;
}
void input() 
{
Scanner sc= new Scanner ( System.in);
System.out.println("enter a positive integer ="); 
num=sc.nextInt();
}
int sumDigits(int x) 
{
if(x==0)
return 0;
int b = x%10;
int sum= b+ sumDigits(x/10); 
return sum; 
}
void isDude() 
{ 
int x= sumDigits(num); 
if (num== x*x*x)
System.out.println(" the given number is dudeny number");
else
System.out.println("the given number is not a dudeny number");
} 
public static void main (String args[]) 
{
NumDude obj= new NumDude();
obj.input();
obj.isDude();
}
}
