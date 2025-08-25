package project_employee;

public class EmployeeProjectDetails {
    private int projects_Undertaken;
    private String working_Project;
    private String previous_Project;
    private String personal_Project;

    public EmployeeProjectDetails(int projects_Undertaken, String working_Project, String previous_Project, String personal_Project) {
        this.projects_Undertaken = projects_Undertaken;
        this.working_Project = working_Project;
        this.previous_Project = previous_Project;
        this.personal_Project = personal_Project;
    }

    @Override
    public String toString() {
        return "EmployeeProjectDetails{" +
                "projects_Undertaken=" + projects_Undertaken +
                ", working_Project='" + working_Project + '\'' +
                ", previous_Project='" + previous_Project + '\'' +
                ", personal_Project='" + personal_Project + '\'' +
                '}';
    }
}
