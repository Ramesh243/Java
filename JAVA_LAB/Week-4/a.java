import java.util.*;
class Week4a
{
    public static void main (String q[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String a = s.nextLine();
        int b = a.length();
        System.out.println("The length of the String = "+b);
        System.out.print("Enter the number of groups = ");
        int n = s.nextInt();
        int c = (b/n);
        int low,up;
        low = 0;
        up = c;
        Week4a.sub(a,c,b,low,up);
    }
    static void sub(String x,int c,int b,int low,int up)
    {
        String y = x.substring(low,up);
        char z[] = y.toCharArray();
        Arrays.sort(z);
        System.out.println(z);
        low = up;
        up = up+c;
        Week4a.sub(x,c,b,low,up);
    }
}