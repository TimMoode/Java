import java.util.Scanner;

public class SammysNoObjects {
    //global variables
    static Scanner scannyMcScanner = new Scanner(System.in);

    public static void main(String[] args){
        //local variables
        String iName, iPhone;
        int iMinutes, iHours, extraMinutes;
        double totalCost;
        iName = inputName();
        iPhone = inputPhone();
        iMinutes = inputMinutes();
        iHours = calcHours(iMinutes);
        extraMinutes = calcExMin(iMinutes);
        totalCost = calcCost(iHours, extraMinutes);
        output(iHours, extraMinutes, totalCost);
    }


    public static String inputName() {
        String iName;
        System.out.println("Please Enter Your Name");
        iName = scannyMcScanner.nextLine();
        return iName;
    }

    public static String inputPhone() {
        String iPhone;
        System.out.println("Please Enter Phone Number");
        iPhone = scannyMcScanner.nextLine();
        return iPhone;
    }

    public static int inputMinutes() {
        int iMinutes;
        System.out.println("Please Enter Minutes of Rental");
        String iData = scannyMcScanner.nextLine();
        iMinutes = Integer.parseInt(iData);
        return iMinutes;
    }

    public static int calcHours(int iMinutes) {
        return iMinutes / 60;
    }

    public static int calcExMin(int iMinutes) {
        return iMinutes % 60;
    }

    public static double calcCost(int iHours, int extraMinutes) {
        return (iHours * 40) + extraMinutes;
    }

    public static void output(int iHours, int extraMinutes, double cost) {
        System.out.println("Hours: " + iHours + "\nMinutes: " + extraMinutes + "\nTotal Cost: " + cost);
    }
}
