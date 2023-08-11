
final class myFinalClass 
{
    void myMethod() 
    {
        System.out.println("We are in the final class we just created");
    }
}

class subClass extends myFinalClass
{
    void myMethod() 
    {
        System.out.println("We are in the subclass");
    }
}
class practical21
{
    public static void main(String arg[])
    {
        myFinalClass fc = new subClass();
        fc.myMethod();
    }
}
