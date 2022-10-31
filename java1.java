package javalap1;
import java.io.*;
// import java.lang.*;
class Rect
{
    int l,b;
    void setval()throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("\n enter Lenght of a Rectangle");
        l=Integer.parseInt(br.readLine());
        System.out.println("\n Enter Breadth of Rectangle");
        b=Integer.parseInt(br.readLine());
    }
    int area()
    {
        return(l*b);
    };
};

    class CalRec 
    {
        public static void main(String args[])throws IOException
        {
            Rect rect=new Rect();
            System.out.println("\n\n CLASS AND OBJECTS");
            rect.setval();
            System.out.println("Area of Rectangle is:"+rect.area());
        }
    };