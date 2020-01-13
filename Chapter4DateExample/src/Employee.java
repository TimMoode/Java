import java.time.LocalDate;

public class Employee {
    private String empNum;
    private String empName;
    private LocalDate empBirthDate;

    /**
     * Default Constructor
     */
    public Employee() {
        empNum = "5";
        empName = "Steven Spelled Incorrectly";
        empBirthDate = LocalDate.of(2020, 01, 01);
    }

    /**
     *
     * @param empNum
     * @param empName
     * @param empBirthDate
     */
    public Employee(String empNum, String empName, LocalDate empBirthDate) {
        this.empNum = empNum;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }
}
