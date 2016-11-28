package Ex3;

/**
 * Created by Mudrak on 10/18/2016.
 */
public abstract class Mortgage implements MortgageConstants {
    //Declaring properties
    public String customerName;
    public int mortgageNumber;
    public double mortgageAmount;
    public double interestRate;
    public String mortgageTerm;

    //Methods and constructors
    public Mortgage(String CustomerName, int MortgageNumber, double MortgageAmount, double InterestRate, String MortgageTerm) {
        customerName = CustomerName;
        mortgageNumber = MortgageNumber;
        if (MortgageAmount <= 300000) {
            mortgageAmount = MortgageAmount;
        } else {
            mortgageAmount = 10000;
        }
        interestRate = InterestRate;
        if (MortgageTerm.equalsIgnoreCase("One Year")) {
            mortgageTerm = shortTerm;
        } else if (MortgageTerm.equalsIgnoreCase("Three Year")) {
            mortgageTerm = mediumTerm;
        } else if (MortgageTerm.equalsIgnoreCase("Five Year")) {
            mortgageTerm = longTerm;
        } else {
            mortgageTerm = shortTerm;
        }
    }

    /**
     * @method getMortgageInfo
     * @void
     * @abstract
     */
    public abstract void getMortgageInfo();
}
