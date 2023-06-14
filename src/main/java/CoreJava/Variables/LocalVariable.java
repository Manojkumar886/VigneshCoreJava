package CoreJava.Variables;

public class LocalVariable
{
    public void DemoLocal()
    {
        int mycount=10;//Local Variable
        System.out.println("my Flower Count is "+mycount);
    }
    public void DemoLocal1()
    {
        String userid="Maddy123";
        System.out.println("my user id  value :"+userid);
    }

    public static void main(String[] args)
    {
//        object created by a class..
//        classname objectname(userdefined)=new classname();
        LocalVariable pen=new LocalVariable();
        pen.DemoLocal();
        pen.DemoLocal1();


    }

}
