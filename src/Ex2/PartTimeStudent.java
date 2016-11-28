package Ex2;

import java.util.Scanner;

/**
 * Created by Mudrak on 10/15/2016.
 */
public class PartTimeStudent extends  Student {
    public PartTimeStudent(String name, boolean isFullTime) {
        super(name, isFullTime);
    }

    @Override
    public void tution() {
        displayDetails();
    }

    @Override
    public void displayDetails() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.printf("Please enter your credit hours: ");
        double creditHours = inputScanner.nextDouble();
        double fees = creditHours * 100;
        System.out.printf("<<Student name: %3s>>\n<<Fees : %.4f>>\n",name,fees);
    }
}
