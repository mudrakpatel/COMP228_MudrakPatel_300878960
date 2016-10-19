package Ex1;
//import statements

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mudrak on 10/15/2016.
 */
public class InsuranceTest {
    public static String insuranceType;
    public static double insuranceCost;
    public static List<Insurance> myInsuranceList = new ArrayList<Insurance>();
    public static Scanner inputScanner = new Scanner(System.in);

    /**
     * @method main
     * @void
     */
    public static void main(String[] args) {
        programLooper();
    }

    /**
     * @method programLooper
     * @void
     */
    public static void programLooper() {
        takeInput();
    }//end of programLooper method

    /**
     * @method takeInput
     * @void
     */
    public static void takeInput() {
        for (; ; ) {
            System.out.printf("Insurance type:\n->Health\t->Life\n");
            insuranceType = inputScanner.nextLine().toUpperCase();
            switch (insuranceType) {
                case "HEALTH":
                case "LIFE":
                    System.out.printf("Enter cost of the insurance");
                    insuranceCost = inputScanner.nextDouble();
                    if (insuranceCost < 0.0) {
                        insuranceCost = 0.0;
                        Health healthInsurance1 = new Health("Health Insurance", insuranceCost);
                        Life lifeInsurance1 = new Life("Life Insurance", insuranceCost);
                        myInsuranceList.add(healthInsurance1);
                        myInsuranceList.add(lifeInsurance1);
                        //Polymorphism part
                        for (Insurance eachInsurance : myInsuranceList) {
                            eachInsurance.displayInfo();
                        }
                    } else {
                        Health healthInsurance1 = new Health("Health Insurance", insuranceCost);
                        Life lifeInsurance1 = new Life("Life Insurance", insuranceCost);
                        myInsuranceList.add(healthInsurance1);
                        myInsuranceList.add(lifeInsurance1);
                        //Polymorphism part
                        for (Insurance eachInsurance : myInsuranceList) {
                            eachInsurance.displayInfo();
                        }
                    }
                    break;
                default:
                    System.out.printf("Enter a valid input...\n");
                    takeInput();
                    break;
            }

        }
    }
}   //end of class declaration