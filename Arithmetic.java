import java.util.*;
class Arithmetic
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=input.nextInt();
        System.out.println("Enter 2nd number:");
        int b=input.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("The sum of "+a+" and "+b+" = "+add);
        System.out.println("The difference between "+a+" and "+b+" = "+sub);
        System.out.println("The product of "+a+" and "+b+" = "+mul);
        System.out.println("The quotient of "+a+" and "+b+" = "+div);
        System.out.println("The remainder of "+a+" and "+b+" = "+mod);


    } 
}