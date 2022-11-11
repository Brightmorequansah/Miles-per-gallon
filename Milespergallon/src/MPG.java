import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner more= new Scanner(System.in);

        double milesDriven, gallonGas, mpg;



        System.out.println("Enter the number of miles driven");
        milesDriven = more.nextDouble();

        System.out.println("Enter the number of gallons used");
        gallonGas= more.nextDouble();

        mpg= milesDriven/ gallonGas;
        System.out.println("Your car's miles per gallon is   "   + mpg);


    }

}
