package pro_package;

public class Bike {

	private String name;
	private int milage;
	private int make_year;

	public Bike(String name, int milage, int make_year) {
		this.name = name;
		this.milage = milage;
		this.make_year = make_year;
	}

	public Bike() {
		System.out.println("Bike for Trial.....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public int getMake_year() {
		return make_year;
	}

	public void setMake_year(int make_year) {
		this.make_year = make_year;
	}

	public void display() {
		System.out.println("Bike Name:     " + name);
		System.out.println("Bike milage:   " + milage);
		System.out.println("Make year:     " + make_year);
	}

//	@Override
	public String toString() {
		return "Bike [name=" + name + ", milage=" + milage + ", make_year=" + make_year + "]";
	}

}
