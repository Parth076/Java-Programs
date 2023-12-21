import java.util.Scanner;
class TemperatureConverter
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        float f=input.nextFloat();
        float c=(f-32)*5/9;
        System.out.println(f+" Fahrenheit is equal to "+c+" Celsius ");
        System.out.println("Enter temperature in Celsius:");
        float celsius=input.nextFloat();
        float fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+" Celsius is equal to "+fahrenheit+" Fahrenheit ");
    }
}