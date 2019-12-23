public class calci {

    public static void main(String[] args) 
{       
    System.out.println(Calculator.powerDouble(1250.55, 85));
    System.out.println(Calculator.powerInt(75,55));

 }

}
class Calculator
{
    static double powerInt(int number1,int number2)
    {
        return Math.pow(number1,number2);
    }
static double powerDouble(double number1,int number2)
{
    return Math.pow(number1,number2);
}
}
