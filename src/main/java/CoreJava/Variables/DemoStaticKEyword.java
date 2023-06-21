package CoreJava.Variables;

public class DemoStaticKEyword
{
    static String myfavFlower="Jasmine";//static variable
    static//static block
    {
        System.out.println("Welcome");
    }

    public static void main(String[] args)
    {
        System.out.println("My favoriate Flower name is :"+myfavFlower+" /t thi svalue is declared in main method");//static variable access everywhere
        staticmethod();
    }

    public static void staticmethod()
    {
        System.out.println("this is static method");
    }

    public void Flowers()//method
    {
//        static int myage=21;//not declared a static variable
        int a=10;//local
        System.out.println("my count is :"+count);//global
        System.out.println("My favoriate Flower name is :"+myfavFlower);//static variable access everywhere
    }
    int count=2;

}
