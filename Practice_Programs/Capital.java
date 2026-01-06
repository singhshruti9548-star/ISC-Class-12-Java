import java.util.*;
class Capital
{
    String sent;
    int freq;
    Capital()
    {
        sent = " ";
        freq=0;
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        sent = sc.nextLine();
        
    }
    boolean isCap(String w)
    {
        char ch = ' ';
            String arr[] = w.split(" ");
            for (int i=0; i< arr.length ; i++)
         {
            ch = arr[i].charAt(0);
            if(ch>='A'&& ch<= 'Z')
         freq++;
         }
         
         
         if(freq >0)
         
          return true;
          else 
          return false;
          
         
    }
    void display()
    {
        System.out.println(" the original sentence = "+sent);
         isCap(sent);
          
       System.out.println("the freq of capital letters is ="+freq); 
    }
public static void main(String args[])
{
    Capital obj= new Capital();
    obj.input();
    obj.display();
}
}
