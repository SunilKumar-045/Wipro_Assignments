package list;

public class Employee {

    private int id;
    private String name;
    private String department;

    public Employee(int id,String name,String department){
        this.id = id;
        this.department=department;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public String toString() {
        return "Employee{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                '}';
    }
}
