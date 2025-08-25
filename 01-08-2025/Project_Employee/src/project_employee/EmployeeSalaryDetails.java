package project_employee;

public class EmployeeSalaryDetails {
    private double ctc;
    private double basic_Salary;
    private double home_Allowances;
    private double monthly_Allowances;
    private double medical_Allowances;


    public EmployeeSalaryDetails(double ctc, double basic_Salary, double home_Allowances, double monthly_Allowances, double medical_Allowances) {
        this.ctc = ctc;
        this.basic_Salary = basic_Salary;
        this.home_Allowances = home_Allowances;
        this.monthly_Allowances = monthly_Allowances;
        this.medical_Allowances = medical_Allowances;
    }

    @Override
    public String toString() {
        return "EmployeeSalaryDetails{" +
                "ctc=" + ctc +
                ", basic_Salary=" + basic_Salary +
                ", home_Allowances=" + home_Allowances +
                ", monthly_Allowances=" + monthly_Allowances +
                ", medical_Allowances=" + medical_Allowances +
                '}';
    }
}
