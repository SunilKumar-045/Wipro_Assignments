package project_employee;

public class EmployeePersonalDetails {
    private String name;
    private String Date_Of_Birth;
    private String personal_Mail;
    private String location;
    private long phone_Number;

    public EmployeePersonalDetails(String name, String date_Of_Birth, String personal_Mail, String location, long phone_Number) {
        this.name = name;
        Date_Of_Birth = date_Of_Birth;
        this.personal_Mail = personal_Mail;
        this.location = location;
        this.phone_Number = phone_Number;
    }

    @Override
    public String toString() {
        return "EmployeePersonalDetails{" +
                "name='" + name + '\'' +
                ", Date_Of_Birth='" + Date_Of_Birth + '\'' +
                ", personal_Mail='" + personal_Mail + '\'' +
                ", location='" + location + '\'' +
                ", phone_Number=" + phone_Number +
                '}';
    }
}
