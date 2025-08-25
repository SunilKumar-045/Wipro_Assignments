package emp;

public class Emp_Implementation {

	public static void main(String[] args) {
		//First 5 Employee using constructors
		Employee emp1 = new Employee(045,"Sunil","IT",40000.0);
		Employee emp2 = new Employee(055,"Kedarnath","Quality",50000.0);
		Employee emp3 = new Employee(075,"Sachin","HR",30000.0);
		Employee emp4 = new Employee(044,"Tarun","Finance",80000.0);
		Employee emp5 = new Employee(005,"Nani","Sales",60000.0);
		
		//Next 5 Employee Details using getters and setters
		Employee emp6 = new Employee();
		emp6.setId(057);
		emp6.setName("Shiva");
		emp6.setDepartment("CyberSecurity");
		emp6.setSalary(55000.0);
		
		Employee emp7 = new Employee();
		emp7.setId(010);
		emp7.setName("Sridhar");
		emp7.setDepartment("IT");
		emp7.setSalary(55000.0);
		
		Employee emp8 = new Employee();
		emp8.setId(056);
		emp8.setName("Nithin");
		emp8.setDepartment("R&D");
		emp8.setSalary(30000.0);
		
		Employee emp9 = new Employee();
		emp9.setId(023);
		emp9.setName("Yogi");
		emp9.setDepartment("Marketing");
		emp9.setSalary(45000.0);
		
		Employee emp10 = new Employee();
		emp10.setId(015);
		emp10.setName("Shathi");
		emp10.setDepartment("Sales");
		emp10.setSalary(55000.0);
		
		System.out.println("==========Employee Details===============");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println(emp6);
		System.out.println(emp7);
		System.out.println(emp8);
		System.out.println(emp9);
		
		System.out.println("==========Employee Details using getter()===============");
		System.out.println(emp10.getId());
		System.out.println(emp10.getName());
		System.out.println(emp10.getDepartment());
		System.out.println(emp10.getSalary());
		
	}

}
