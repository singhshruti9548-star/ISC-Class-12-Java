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
        str = sc.next();
        len = str.length();
    }
    char caseconvert(char ch)
    {
            if(ch>= 65 && ch <= 90)// implicit type promotion(char to int)
            {
            char w = Character.toLowerCase(ch);// case conversion by 
            return w;                          //Wrapper class
            }
            else
            if(ch>= 'a' && ch <= 'z')
            {
            char x= (char) (ch-32);// case conversion via type Casting
            return x;
            } 
            return ch;
        
    }
    void recchange(int pos)
    {
        char ch;
        if(pos<0)
        return;
        else
        {
            ch= str.charAt(pos);
            ch= caseconvert(ch);
            newstr = ch+ newstr;
        }
        recchange(pos-1);
    }
    void display()
    {
        System.out.println(" the original word =" + str);
        System.out.println(" the new  word ="+ newstr);
    }
    public static void main(String args[])
    {
        Change obj = new Change();
        obj.inputword();
        obj.recchange(obj.len-1);
        obj.display();
    }
}


    
    
      
            


    
