

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
    void convert()
    {
        int fl=0;
        char s = Txt.charAt(0);
        
        if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
        {
        Cxt= Txt+ "Y";
        return;//fl=1; (this could also be written)
        }
        else   
        if(fl==0)
      {
         for(int i=0; i<len;i++)
         {
             char w = Txt.charAt(i);
             if(w=='A'||w=='E'||w=='I'||w=='O'||w=='U')
             {
                 fl=1;
                 String s1 = Txt.substring(i,len);
                 String s2 = Txt.substring(0,i);
                 Cxt= s1+s2+"C";
                 break;
             }
         }
      }
          
          if(fl==0)
          {
          Cxt=Txt+"N";
          }
    }
    void display()
    {
        System.out.println("the original word is="+Txt);
        System.out.println("the changed word is="+Cxt);
    }
    public static void main(String args[])
    {
        Rearrange obj= new Rearrange();
        obj.readword();
        obj.convert();
        obj.display();
    }
}
