import java.util.*;
class Rearrange
{
    String Txt,Cxt;
    int len;
    Rearrange()
    {
        Cxt=" ";
        Txt=" ";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word in UpperCase=");
        Txt=sc.next().toUpperCase();
        len=Txt.length();
    }
}
