import java.util.*;
class Change
{
    String str, newstr;
    int len;
    Change()
    {
        str= " ";
        newstr= " ";
        len = 0;
    }
    void inputword()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println(" enter a word");
        word= sc.next();
        
    }
    
}import java.util.*;
class Change
{
    String str, newstr;
    int len;
    Change()
    {
        str= " ";
        newstr= " ";
        len = 0;
    }
    void inputword()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println(" enter a word");
        str = sc.next();
        len = str.length();
    }
    char caseconvert(char ch)
    {
        for(int i=0; i<len; i++ )
        {
            ch= str.charAt(i);
            if(ch>= 'A' && ch <= 'Z')
            {
            char w = Character.toLowerCase(ch);
            return w;
            }
            else
            if(ch>= 'a' && ch <= 'z')
            {
            char x= Character.toUpperCase(ch);
            return x;
            }
        }
    }
    void recchange()
    {
        
    }

