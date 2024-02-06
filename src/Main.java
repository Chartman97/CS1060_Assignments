import java.util.Scanner;

// This file has a repository with GitHub
public class Main {
    public static void main(String[] args) {
        final double kelvin, celsius, fahrenheit;
        Scanner in = new Scanner(System.in);

        // Get user to input data
        // With a little friendly banter
        System.out.println("\n\nHello! My name is \"The Temperature Conversion Machine\"!");
        System.out.println("My only function is to convert Fahrenheit to Celsius & Kelvin");
        System.out.print("Lets do some conversions! Input Value here -->");
        fahrenheit = in.nextDouble();

        // Convert Fahrenheit to Celsius & Kelvin
        celsius = (double) ((( 5.0 / 9.0 ) * (fahrenheit - 32)));
        kelvin = (double) (celsius + 273.15);

        // Output
        System.out.println("Boom");
        System.out.println( fahrenheit + " Degrees Fahrenheit is:");
        System.out.printf("Celsius = %.2f \nKelvin = %.2f\n", celsius, kelvin);

        System.out.print("");
    }
}