package Ex2;

import java.util.Scanner;

/**
 * Created by Mudrak on 10/15/2016.
 */
public class StudentTestClass {
    //global variables
   public static Scanner inputScanner = new Scanner(System.in);;
    public static String studentStatus;
    public static String studentName;
    /**
     * @method main
     * @void
     * */
    public static void main(String[] args) {
        while(true){
            programLooper();
        }
    }
    /**
     * @method programLooper
     * @void
     * */
    public static void programLooper(){
        System.out.printf("Please enter your name: ");
        studentName = inputScanner.nextLine();
        System.out.printf("Please enter your student status\na)Full time\nb)Part time\n");
        studentStatus = inputScanner.nextLine();
        if(studentStatus.equalsIgnoreCase("a")){
            FullTimeStudent myFullTimeStudent = new FullTimeStudent(studentName,true);
            myFullTimeStudent.tution();
        } else if(studentStatus.equalsIgnoreCase("b")){
            PartTimeStudent myPartTimeStudent = new PartTimeStudent(studentName,true);
            myPartTimeStudent.tution();
        } else {
               System.out.printf("Please enter valid inputs ... \n");
        }
    }
}
