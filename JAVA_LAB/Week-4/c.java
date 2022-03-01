import java.util.*;
class Week4c
{
    public static void main(String o[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any String = ");
        String a = s.nextLine();
        System.out.print("Enter any String = ");
        String b = s.nextLine();
        if(a.length() == b.length())
        {
            char x[] = a.toCharArray();
            char y[] = b.toCharArray();
            System.out.println(Arrays.toString(x));
            System.out.println(Arrays.toString(y));
            Arrays.sort(x);
            Arrays.sort(y);
            if(Arrays.equals(x,y))
            {
                System.out.println("Strings are ANAGRAMS");
            }
            else
            {
                System.out.println("Strings are NOT ANAGRAMS");
            }
        }
        else
        {
            System.out.println("The Strings are NOT ANAGRAMS");
        }
    }
}