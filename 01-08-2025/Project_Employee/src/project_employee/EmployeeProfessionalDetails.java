package project_employee;

public class EmployeeProfessionalDetails {
    private String employee_Name;
    private String employee_Id;
    private String company;
    private String company_Mail;
    private String location;

    public EmployeeProfessionalDetails(String employee_Name, String employee_Id, String company, String company_Mail, String location) {
        this.employee_Name = employee_Name;
        this.employee_Id = employee_Id;
        this.company = company;
        this.company_Mail = company_Mail;
        this.location = location;
    }

    @Override
    public String toString() {
        return "EmployeeProfessionalDetails{" +
                "employee_Name='" + employee_Name + '\'' +
                ", employee_Id='" + employee_Id + '\'' +
                ", company='" + company + '\'' +
                ", company_Mail='" + company_Mail + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
