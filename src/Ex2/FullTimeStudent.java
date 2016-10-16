package Ex2;

import java.util.Scanner;

/**
 * Created by Mudrak on 10/15/2016.
 */
public class FullTimeStudent extends Student {
    public FullTimeStudent(String name, boolean isFullTime) {
        super(name, isFullTime);
    }

    @Override
    public void tution() {
        displayDetails();
    }

    @Override
    public void displayDetails() {
        System.out.printf("<<Student name: %3s>>\n<<Your fees: $2000.00>>\n",name);
    }
}
