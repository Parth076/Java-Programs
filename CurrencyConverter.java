import java.util.Scanner;
class CurrencyConverter
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount in dollars:");
        int dollar=input.nextInt();
        int rupee=dollar*82;
        System.out.println(dollar+" Dollars is equal to "+rupee+" Rupees");
          System.out.println("Enter the amount in rupees:");
        int r=input.nextInt();
        float d=r/82;
        System.out.println(r+" Rupees is equal to "+d+" Dollars");

    }
}