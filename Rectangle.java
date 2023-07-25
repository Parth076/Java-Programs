import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        float a=input.nextFloat();
        System.out.println("Enter the breadth of rectangle:");
        float b=input.nextFloat();
        float area=a*b;
        System.out.println("The area of the rectangle is "+area);


    }
}