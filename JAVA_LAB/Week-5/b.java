import java.util.Scanner;
class Week5b
{
    public static void main(String a[])
    {
        Scanner ss =new Scanner(System.in);
        System.out.println("Enter radius and height:");
        int rad = ss.nextInt();
        int hei = ss.nextInt();
        Figure3d p = new Figure3d(rad,hei);
        Cylinder m = new Cylinder(rad,hei);
        Cone r = new Cone(rad,hei);
        Sphere s = new Sphere(rad,hei);
        System.out.print("Enter \n1 for Cylinder \n2 for Cone \n3 for Sphere \n4 for Triangle = ");
        int i = ss.nextInt();
        if(i==1)
        {
            System.out.println("Volume is "+m.Volume());
        }
        else if(i==2)
        {
            System.out.println("Volume is "+r.Volume());  
        }
        else if(i==3)
        {
            System.out.println("Volume is "+s.Volume());
        }
        else
        {
            p.Volume();
        }
    }
}
class Figure3d
{
    double d1;
    double d2;
    Figure3d(double a,double b)
    {
        d1 = a;
        d2 = b;
    }
    double Volume()
    {
        System.out.println("Volume for figure isn't possible.");
        return 0;
    }
}
class Cylinder extends Figure3d
{
    Cylinder(double a,double b)
    {
      super(a,b);
    }
    double Volume()
    {
        System.out.println("Volume of cylinder is:");
        return ((3.1414)*(d1*d1)*d2);
    }
}
class Cone extends Figure3d
{
    Cone(double a,double b)
    {
        super(a,b);
    }
    double Volume()
    {
    System.out.println("Volume of cone is:");
    return ((0.33)*(3.1414)*(d1*d1)*d2);
    }
}
class Sphere extends Figure3d
{
    Sphere(double a,double b)
    {
        super(a,b);
    }
    double Volume()
    {
    System.out.println("Volume of sphere is:");
    return ((1.333)*(3.1414)*(d1*d1*d1));
    }
}