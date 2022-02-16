import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
}
