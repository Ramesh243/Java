import java.util.*;
class Week6b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        Vector <Object> v = new Vector<> ();
        System.out.print("Enter any integer = ");
        int w = sc.nextInt();
        Integer i = Integer.valueOf(w);
        System.out.print("Enter any Floating Point number = ");
        float x = sc.nextFloat();
        Float f = Float.valueOf(x);
        System.out.print("Enter any Double Value number = ");
        double y = sc.nextDouble();
        Double d = Double.valueOf(y);
        System.out.print("Enter any Character = ");
        char z = sc.next().charAt(0);
        Character c = Character.valueOf(z);
        v.add(i);
        v.add(f);
        v.add(d);
        v.add(c);
        for(int a = 0; a<v.size(); a++)
        {
            System.out.println(v.get(a));
        }
    }
}