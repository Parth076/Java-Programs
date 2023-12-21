import java.util.Scanner;
class Armstrong 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        int store=num;
        int m;
        int arm=0;
        while(num>0)
        {
            m=num%10;
            arm=arm+(m*m*m);
            num=num/10;
        }
        if(store==arm)
        {
            System.out.println(store+" is an Armstrong number. ");
        }
        else
        {
            System.out.println(store+" is not an Armstrong number. ");

        }
    }
}