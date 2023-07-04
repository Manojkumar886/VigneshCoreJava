package CoreJava.OPerator;

public class LogicalOperator
{
    public static void main(String[] args)
    {
        Logical();
    }

    public static  void Logical()
    {
//        && -AND Operator ,|| OR Operator , ! NOT OPerator
//        ! Exclamation Mark ,@ AT ,#  Hash,$ doller ,% Module,^ wedge ,& Ampersand ,-Hyphen,_ underscore,*Asterisk
//        : colon , ;semicolon

        char section ='A';
        char section1='a';

//        && rules ( T && T =T )(T&&F=F)(both condition is true output is true
//        || rules (T || T =T) (T || F =T) (F||F =F)
//        ! T output is F  ,F output is T (opposite Action)

        System.out.println(section!=section1 && section1=='a');// T && T  =T

        System.out.println( "Manoj"=="Manoj" || 456>=1345 );  //T || F =T


        System.out.println(!(section1!=section));// !(t) =false

    }
}
