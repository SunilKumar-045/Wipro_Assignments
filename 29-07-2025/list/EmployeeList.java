package list;

import java.util.*;
public class EmployeeList {
    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        //Adding Employees
        employeeList.add(new Employee(45,"Sunil","IT"));
        employeeList.add(new Employee(57,"Shiva","CyberSecurity"));
        employeeList.add(new Employee(44,"Yogi","AIML"));

        System.out.println("-------------------All Employees-----------------------");
        for(Employee emp:employeeList){
            System.out.println(emp);
        }

        System.out.println("---------Search Employee---------------");
        System.out.println("Enter the id to search....");
        int eid = s.nextInt();
        boolean status = false;
        for(Employee emp:employeeList){
            if(eid==emp.getId()){
                System.out.println(emp);
                status = true;
                break;
            }
        }
        if(!status){
            System.out.println("Employee not found..");
        }

        System.out.println("----------Remove Employee------------");
        System.out.println("Enter the id to remove....");
        int rid = s.nextInt();
        Employee remployee = null;
        for(Employee emp:employeeList){
            if(rid==emp.getId()){
                remployee=emp;
            }
        }
        if(remployee!=null){
            employeeList.remove(remployee);
            System.out.println("Employee remove successfully....");
        }else{
            System.out.println("Employee not found...");
        }

        System.out.println("--------Update Employee List-----------");
        for(Employee emp:employeeList){
            System.out.println(emp);
        }

        System.out.println(employeeList.toString());





    }
}
