import java.util.Scanner;
class Strong
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        int strong=0;
        int fact=1;
        int i;
        int m;
        int store=a;
        while(a>0)
        {
            m=a%10;
            for(i=1;i<=m;i++)
            {
                fact=fact*i;
            }
            strong=strong+fact;
            a=a/10;
            fact=1;
        }
        if(store==strong)
        {
            System.out.println(store+" is a Strong number.");
        }
        else
        {
            System.out.println(store+" is not a Strong number.");
        }
    }
}    