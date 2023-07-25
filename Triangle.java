import java.util.Scanner;
class Traingle
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
          System.out.println("Enter the length of triangle:");
        float a=input.nextFloat();
        System.out.println("Enter the breadth of triangle:");
        float b=input.nextFloat();
        double area=0.5*(a*b);
        System.out.println("The area of the triangle is "+area);

    }
}