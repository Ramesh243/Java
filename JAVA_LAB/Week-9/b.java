import java.util.*;
class Week9b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the age of the person = ");
        int age = sc.nextInt();
        try 
        {
            Validate(age);
        } 
        catch (InvalidAgeException exp) 
        {
            System.out.println(exp);
        }
    }
    static void Validate(int n) throws InvalidAgeException
    {
        if (n<=18)
        {
            throw new InvalidAgeException("INELIGIBLE FOR VOTING");
        } 
        else 
        {
            System.out.print("ELIGIBLE FOR VOTING");
        }
    }
}
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String s) 
    {
        super(s);
    }
}