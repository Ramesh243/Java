class Week10a2
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }
}
class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<6;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}
class C implements Runnable
{
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}