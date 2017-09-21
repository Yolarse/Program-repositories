import java.util.Scanner;

public class Main {
    public static void main (String args []) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your car's MPG rating as a positive integer:");
        int MPG = input.nextInt();

        if (MPG > 0) {
            System.out.println("Enter your car's tank capacity in gallons as a positive decimal number:");
            double tankCapacity = input.nextDouble();

            if (tankCapacity > 0.0) {
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%):");
                double tankFilled = input.nextDouble();

                if (tankFilled >= 0.0 && tankFilled <= 100.0) {
                    double rawRange = (MPG * tankCapacity * (tankFilled * 0.01));
                    rawRange = (int)rawRange;

                    if (rawRange <= 25.0) {
                        System.out.println("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!" );
                    }
                    else {
                        System.out.println("Keep driving! Your current estimated range is: " + rawRange + " miles!");

                    }
                }
                else {
                    System.out.println("Error: Percentage must be a decimal number in the range of 0-100");
                }
            }
            else {
                System.out.println("Error: Only positive decimal numbers are accepted for tank capacity.");
            }
        }
        else {
            System.out.println("Error: Only positive integers are accepted for MPG");

        }

    }

}
