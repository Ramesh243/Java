import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost",3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        System.out.print("Enter the radius of Circle = ");
        double radius = sc.nextDouble();
        dout.writeUTF(""+radius);
        dout.flush();
        double area = Double.parseDouble(din.readUTF());
        System.out.println("The Area of Circle with radius "+radius+" is = "+area);
        dout.close();
        s.close();
    }
}