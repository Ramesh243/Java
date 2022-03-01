class Week10b
{
    public static void main(String args[]) throws InterruptedException
    {
        A a = new A();
        B b = new B(a);
        C c = new C(a);
        b.start();
        c.start();
    }
}
class A
{
    synchronized void print(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class B extends Thread
{
    A a;
    B(A a)
    {
        this.a = a;
    }
    public void run()
    {
        a.print(15);
    }
}
class C extends Thread
{
    A a;
    C(A a)
    {
        this.a = a;
    }
    public void run()
    {
        a.print(25);
    }
}