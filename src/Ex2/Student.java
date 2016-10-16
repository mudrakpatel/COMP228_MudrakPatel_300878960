package Ex2;

/**
 * Created by Mudrak on 10/15/2016.
 */
public abstract class Student {
    //Properties
    public String name;
    public boolean isFullTime;
    //Methods and constructors
    public Student(String name, boolean isFullTime){
        this.name = name;
        this.isFullTime = isFullTime;
    }
    /**
     * @method tutuion
     * @abstract
     * */
    public abstract void tution();
    /**
     * @method toString
     * @abstract
     * */
    public abstract void displayDetails();
}
