package Ex1;

/**
 * Created by Mudrak on 10/15/2016.
 */
public class Life extends Insurance {
    //Methods and constructors
    //constructor
    public Life(String type, double monthlyCost){
        super(type, monthlyCost);
    }
    /**
     * @method setInsuranceCost
     * @void
     */
    @Override
    public void setInsuranceCost(double MonthlyCost) {
        if(MonthlyCost<0.0){
            throw new IllegalArgumentException("Monthly cost must be > or = $0\n");
        } else {
            monthlyCost = MonthlyCost;
        }
    }

    /**
     * @method displayInfo
     * @void
     */
    @Override
    public void displayInfo() {
        System.out.printf("<<Insurance type: %3s>>\n<<Insurance cost: %.2f>>\n",super.getType(),super.getMonthlyCost());
    }
}
