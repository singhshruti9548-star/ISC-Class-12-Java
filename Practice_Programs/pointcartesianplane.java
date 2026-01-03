import java.util.*;
class Point
{
    int x,y;
    Point()
    {
        x=0;
        y= 0;
    }
    void readpoint()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x co-ordinate");
        x= sc.nextInt();
        System.out.println("enter y co-ordinate");
        y= sc.nextInt();
    }
    Point midpoint(Point A, Point B)
    {
     Point C= new Point();
      C.x = (A.x+B.x)/2;
      C.y= (A.y+B.y)/2;
        return C;
    } 
    void displaypoint()
    {
        System.out.println("the coordinates of the mid point are ="+x+","+y);
    }
    public static void main(String args[])
    {
        Point A= new Point();
        Point B= new Point();
        Point C= new Point();
        System.out.println("the first point");
        A.readpoint();
        System.out.println("the second point ");
        B.readpoint();
        C = C.midpoint(A,B);
        A.displaypoint();
         B.displaypoint();
          C.displaypoint();
    }
}
