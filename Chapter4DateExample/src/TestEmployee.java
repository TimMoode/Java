import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
public class TestEmployee {

    public static void main(String[] args) {
        Employee repOne = new Employee();
        String name, phone, birthYear, birthMonth, birthDay;
        LocalDate bDate;

        name = JOptionPane.showInputDialog(null, "Enter your name: ");
        repOne.setEmpName(name);

        phone = JOptionPane.showInputDialog(null, "Enter your Phone Number: ");
        repOne.setEmpNum(phone);

        birthYear = JOptionPane.showInputDialog(null, "Enter your birth Year: ");
        birthMonth = JOptionPane.showInputDialog(null, "Enter your birth month: ");
        birthDay = JOptionPane.showInputDialog(null, "Enter your Birth Day: ");

        bDate = LocalDate.of(Integer.parseInt(birthYear), Integer.parseInt(birthMonth), Integer.parseInt(birthDay));
        repOne.setEmpBirthDate(bDate);

        LocalDate today = LocalDate.now();
        Period span = Period.between(repOne.getEmpBirthDate(), today);
        int age = span.getYears();

        System.out.println("Today is " + today.getDayOfWeek());
        System.out.println("Name: " + repOne.getEmpName() + "\nPhone: " + repOne.getEmpNum() +
                "\nBirth Date: " + repOne.getEmpBirthDate() + "\nAge: " + age);
    }
}
