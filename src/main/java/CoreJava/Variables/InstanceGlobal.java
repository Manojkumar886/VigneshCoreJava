package CoreJava.Variables;

public class InstanceGlobal
{
    String myusername="Maddy123";
    static char my_Section='A';//static variable
    public void Method1()
    {

        float my_weight=60.9f;//Local Variable
        System.out.println("my weight is "+my_weight);
        System.out.println(myusername);//Global Variable declararion
        System.out.println("mychaacter value is "+my_Section);//static variable accessed everyplacess
    }
    public static void main(String[] args)
    {
        InstanceGlobal glo=new InstanceGlobal();
        glo.Method1();
        System.out.println(glo.myusername);
        int mycount=10;//instance variable
//        System.out.println(myusername); global variable not supported in main method
        System.out.println("mychaacter value is "+my_Section);//static variable is printed by every placess but declared only insdie a class outside a methods
        Method02();//static method will be accessed
    }
    static//static block-in the blk is run in first,then run a main block
    {
        System.out.println("Welcome to Everyone");
    }

    public static void Method02()
    {
        System.out.println("It is a Second method");
        int a=10;//local variable
        System.out.println("this is static method print an a value "+a);
    }

}
