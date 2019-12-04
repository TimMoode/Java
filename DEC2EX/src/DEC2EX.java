// Authors: Alec, Austin
import javax.swing.*;
import java.text.DecimalFormat;

public class DEC2EX {
    //just made them global
    static String pattern = "$###,###.00";
    static String iData, oTotal, oTax, oCharge, oTip;
    static Double iCharge, cTip, cTax, cTotal;
    static DecimalFormat moneyFormat = new DecimalFormat(pattern);
    public static void main(String[] args) {
        init();
        input();
        calcs();
        output();
    }

    public static void init() {

    }

    public static void input() {
        iData = JOptionPane.showInputDialog(null,"Enter the food cost.", "Food Cost", 3);
        iCharge = Double.parseDouble(iData);
    }

    public static void calcs() {
        cTip = .15 * iCharge;
        cTax = iCharge * .07;
        cTotal = cTip + cTax + iCharge;
    }

    public static void output() {
        //we output stuff here
        oTip = moneyFormat.format(cTip);
        oTax = moneyFormat.format(cTax);
        oTotal = moneyFormat.format(cTotal);
        oCharge = moneyFormat.format(iCharge);
        System.out.println("Charge: " + oCharge);
        System.out.println("Your Tip is: " + oTip);
        System.out.println("Sales Tax is: " + oTax);
        System.out.println("Total is: " + oTotal);
    }
}
