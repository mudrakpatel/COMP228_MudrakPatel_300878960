package Ex1;

/**
 * Created by Mudrak on 10/15/2016.
 */
public abstract class Insurance {
    //Properties
    public String type;
    public double monthlyCost;
    //Methods and constructors
    public Insurance(String Type, double MonthlyCost){
        type = Type;
        if(MonthlyCost < 0.0){
            throw new IllegalArgumentException("Monthly cost must be > or = $0\n");
        } else {
            monthlyCost = MonthlyCost;
        }
    }
    //getters
    public String getType() {
        return type;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }
    /**
     * @method setInsuranceCost
     * @void
     * */
    public abstract void setInsuranceCost(double MonthlyCost);
    /**
     * @method displayInfo
     * @void
     * */
    public abstract void displayInfo();

}
