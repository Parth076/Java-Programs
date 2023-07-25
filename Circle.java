import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float rad=input.nextFloat();
        double area=3.14*(rad*rad);
        System.out.println("The circumference of the circle is "+area);
    }
}