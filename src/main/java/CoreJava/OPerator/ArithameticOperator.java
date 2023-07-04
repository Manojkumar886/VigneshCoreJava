package CoreJava.OPerator;

public class ArithameticOperator
{
    public void ArithameticExecution()
    {
//        +,-,*,/,%

        String myfirstname="Manoj";
        String Lastname="kumar";
        String fullname=myfirstname+Lastname;//arithametic operator
        System.out.println(fullname);
        char initial='M';
        int mvalue=initial;//widening
        System.out.println("my M letter value (asci)"+mvalue);
        mvalue*=23;//assignment Operatir
        System.out.println("current m value"+mvalue);
    }

    public void Assignment()
    {
        float ab=98.9f;
        ab+=1.1;//assignment operator
        System.out.println(ab);

    }
    public static void main(String[] args)
    {
        int a=10;
        a+=10;//assi
        System.out.println(a);
        ArithameticOperator object=new ArithameticOperator();
        object.ArithameticExecution();
        object.Assignment();
    }
}
