import java.util.*;
class Week7c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        HashMap<Integer,Employee> h = new HashMap<Integer,Employee>();
        Employee E1 = new Employee();
        E1.ID(101);
        E1.Name("Mahesh");
        E1.Salary(556644.0);
        Employee E2 = new Employee();
        E2.ID(102);
        E2.Name("Uday");
        E2.Salary(523456.0);
        Employee E3 = new Employee();
        E3.ID(103);
        E3.Name("Akshay");
        E3.Salary(5421356.0);
        h.put(101, E1);
        h.put(102, E2);
        h.put(103, E3);
        for(int i:h.keySet())
        {
            System.out.println("ID: "+i+"\tName: "+(h.get(i).getName())+"\tSalary: "+(h.get(i).getSalary()));
        }
    }
}
class Employee
{
    int id;
    String name;
    Double salary;
    void ID(int id)
    {
        this.id  =  id;
    }
    void Name(String name)
    {
        this.name  =  name;
    }
    void Salary(Double salary)
    {
        this.salary  =  salary;
    }
    int getID()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    Double getSalary()
    {
        return salary;
    }
}