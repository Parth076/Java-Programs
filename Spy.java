import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    { 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        int store=a;
        int mod;
        int sum=0,product=1;
        while(a>0)
        {
            mod=a%10;
            sum=sum+mod;
            product=product*mod;
            a=a/10;
        }
        if(sum==product)
        {
            System.out.println(store+" is a Spy number. ");
        }
        else
        {
            System.out.println(store+" is a not Spy number. ");
        }
    }
}