import java.util.Scanner;
class Factorial
{
     public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=a;i++)
        {
             fact=fact*i;
        }
        System.out.println("The factorial of "+a+" is "+fact);
}
}