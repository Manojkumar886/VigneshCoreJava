package CoreJava.OPerator;

public class ComparisonOperator
{
//    >  greaterthen ,< lessthen ,>= greaterthen equal ,<=lessthenequal, == equal to ,!=not equal

    public static void main(String[] args)
    {
        String Alpha="Boards";
        String Beta="boards";

        System.out.println(Alpha==Beta);//false
        System.out.println(Alpha!=Beta);//true

        short Avalue=897;
        int BValue=978;
        int CValue=978;
        System.out.println(Avalue>=BValue);// 897>=978  -false
        System.out.println(BValue<Avalue);// 978 < 897   -false

        System.out.println(BValue>CValue);//978>978 `-false
        System.out.println(BValue<=CValue); //978<=978  -true


        System.out.println(45.6>=41.2);//true
    }
}
