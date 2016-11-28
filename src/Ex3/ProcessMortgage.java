package Ex3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mudrak on 10/18/2016.
 */
public class ProcessMortgage {
    public static void main(String[] args) {
        //required variables
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Mortgage> myMortgages = new ArrayList<>();
        //temporary variables
        String mortgageType;
        String customerName;
        int mortgageNumber;
        double mortgageAmount;
        String mortgageTerm;

        //Ask user for mortgage type
        for (int loopCounter = 0; loopCounter < 3; loopCounter++) {
            //Determining the type of mortgage entered by the user
            System.out.printf("Enter your mortgage type: \nPersonal\tBusiness\n");
            mortgageType = inputScanner.nextLine();
            //Ask for mortgage details
            System.out.printf("Enter your name: \n");
            customerName = inputScanner.nextLine();
            System.out.printf("Enter your mortgage number: \n");
            mortgageNumber = inputScanner.nextInt();
            System.out.printf("Enter your mortgage amount: \n");
            mortgageAmount = inputScanner.nextDouble();
            System.out.printf("Enter your mortgage term: \nOne year\tThree year\tFive year\n");
            mortgageTerm = inputScanner.nextLine();
            inputScanner.nextLine();

            //Check if mortgage type is business
            //If mortgage type is business, then create BusinessMortgage object
            if (mortgageType.equalsIgnoreCase("business")) {
                //Create a BusinessMortgage object and add it to the myMortgages array list
                BusinessMortgage myBusinessMortgage = new BusinessMortgage(customerName, mortgageNumber, mortgageAmount, 1.0, mortgageTerm);
                myMortgages.add(myBusinessMortgage);
            }
            //check if mortgage type is personal
            //If mortgage type is personal, then create PersonalMortgage object
            else if (mortgageType.equalsIgnoreCase("personal")) {
                //Create a BusinessMortgage object and add it to the myMortgages array list
                PersonalMortgage myPersonalMortgage = new PersonalMortgage(customerName, mortgageNumber, mortgageAmount, 2.0, mortgageTerm);
                myMortgages.add(myPersonalMortgage);
            }
            //Check whether mortgage type is not empty
            if (mortgageType.isEmpty()) {
                System.out.printf("Please enter a mortgage type...\n");
            }
            //Otherwise display this message
//                else {
//                    System.out.printf("Please enter a valid mortgage type...\n");
//                }
        }
        //Use a loop to create Mortgage objects and display mortgage details
        for (Mortgage eachMortgage : myMortgages) {
            eachMortgage.getMortgageInfo();
        }
    }
}
