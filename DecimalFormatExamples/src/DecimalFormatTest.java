import javax.swing.*;
import java.text.*;

public class DecimalFormatTest {
    public static void main(String[] args) {
        String pattern = "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        String iData, oSalary;
        String oGPA  = "0";
        Double iSalary;

        iData = JOptionPane.showInputDialog(null, "Enter your desired salary:", "Salary Entry",
                3);


         iSalary = Double.parseDouble(iData);

         oSalary = moneyFormat.format(iSalary);
         System.out.println(oSalary);
         System.out.printf("%11s%10s%4s\n", "Salary", " ", "GPA");
         System.out.printf("%11s%10s%4s", oSalary , " ", oGPA);

    }
}