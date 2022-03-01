import java.util.Scanner;
class Box
{
    double width,height,depth;
    Box(double a, double b, double c)
    {
        System.out.println("Construction of Box");
        width = a;
        height = b;
        depth = c;
    }
    double volume()
    {
        return width*height*depth;
    }
    public static void main(String o[])
    {
        double x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Width of Box = ");
        x = s.nextDouble();
        System.out.print("Enter the Height of Box = ");
        y = s.nextDouble();
        System.out.print("Enter the Depth of Box = ");
        z = s.nextDouble();
        Box q = new Box(x,y,z);
        double w = q.volume();
        System.out.print("The Volume of Box is = "+w);
    }
}