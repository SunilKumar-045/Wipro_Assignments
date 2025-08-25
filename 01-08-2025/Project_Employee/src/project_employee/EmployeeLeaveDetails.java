package project_employee;

public class EmployeeLeaveDetails {
    private int total_Leaves;
    private int monthly_leaves;
    private int sick_leaves;
    private int used_leaves;
    private int remained_leaves;

    public EmployeeLeaveDetails(int total_Leaves, int monthly_leaves, int sick_leaves, int used_leaves, int remained_leaves) {
        this.total_Leaves = total_Leaves;
        this.monthly_leaves = monthly_leaves;
        this.sick_leaves = sick_leaves;
        this.used_leaves = used_leaves;
        this.remained_leaves = remained_leaves;
    }

    @Override
    public String toString() {
        return "EmployeeLeaveDetails{" +
                "total_Leaves=" + total_Leaves +
                ", monthly_leaves=" + monthly_leaves +
                ", sick_leaves=" + sick_leaves +
                ", used_leaves=" + used_leaves +
                ", remained_leaves=" + remained_leaves +
                '}';
    }
}
