import java.util.Scanner;
class Week5a
{
    public static void main(String o[])
    {
        Scanner s = new Scanner(System.in);
        Cost d = new Cost();
        System.out.print("Enter the Type of the Vehicle: ");
        String A = s.nextLine();
        System.out.print("Enter the Name of the Brand: ");
        String B = s.nextLine();
        System.out.print("Enter the Cost of the Vehicle: ");
        int C = s.nextInt();
        d.Vehicle(A);
        d.Brand(B);
        d.Cost(C);
    }
}
class Vehicle
{
    void Vehicle(String a)
    {
        System.out.println("Type of the Vehicle: "+a);
    }
}
class Brand extends Vehicle
{
    void Brand(String b)
    {
        System.out.println("Brand Name: "+b);
    }
}
class Cost extends Brand
{
    void Cost(int c)
    {
        System.out.println("Cost of the Vehicle = "+c);
    }
}