import java.util.Scanner;
class Pallindrome
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        int m;
        int store=n;
        int p=0;
        while(n>0)
        {
            m=n%10;
            p=p*10+m;
            n=n/10;
        }
        if(store==p)
        {
            System.out.println(store+" is a Pallindrome number. ");

        }
        else{
             System.out.println(store+" is not a Pallindrome number. ");
        }
    }
}