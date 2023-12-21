import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        int sq=num*num;
        int m;
        int neon=0;
        while(sq>0)
        {
            m=sq%10;
            neon=neon+m;
            sq=sq/10;
            
        }
        if(num==neon)
        {
            System.out.println(num+" is a Neon number. ");
        }
        else
        {
            System.out.println(num+" is not a Neon number. ");
        }
    }
}
