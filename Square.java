import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the side of square:");
        float a=input.nextFloat();
        float sq=a*a;
        System.out.println("The area of  the square is "+sq);

    }
}