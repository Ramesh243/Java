import java.util.*;
class Week7b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array List: ");
        ArrayList a = new ArrayList(n);
        for(int i=0;i<=n;i++)
        {
            String s = sc.nextLine();
            a.add(s);
        }
        System.out.print("The Array List is:");
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
        System.out.print("\nEnter any number from 1 to "+n+" = ");
        int d = sc.nextInt();
        a.remove(d);
        System.out.print("The Array List after removing element at index "+d+" is:");
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
    }
}