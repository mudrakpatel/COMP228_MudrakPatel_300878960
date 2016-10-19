package Ex3;

import javax.swing.*;

/**
 * Created by Mudrak on 10/18/2016.
 */
public class PersonalMortgage extends Mortgage {
    //Methods and constructors
    //Constructor
    public PersonalMortgage(String CustomerName, int MortgageNumber, double MortgageAmount, double InterestRate, String MortgageTerm) {
        super(CustomerName, MortgageNumber, MortgageAmount, 2.0, MortgageTerm);
    }

    /**
     * @method getMortgageInfo
     * @void
     * @override from parent
     */
    @Override
    public void getMortgageInfo() {
        System.out.printf("=================================================================================\n" +
                        "<<Customer name: %3s>>\n" +
                        "<<Bank name: %3s>>\n" +
                        "<<Mortgage number: %2d>>\n" +
                        "<<Mortgage amount: %.2f>>\n" +
                        "<<Interest rate: %.2f>>\n" +
                        "<<Mortgage term: %3s>>\n" +
                        "=================================================================================\n",
                super.customerName, MortgageConstants.bankName, super.mortgageNumber, super.mortgageAmount, super.interestRate, super.mortgageTerm);
    }
}
