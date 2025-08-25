package order;

public class OrderImplementation {

	public static void main(String[] args) {
		Order pporder = new PhysicalProductOrder("A-045");
		Order dporder = new DigitalProductOrder("B-057");
		Order sorder = new ServiceOrder("C-044");

		// PhysicalProductOrder
		pporder.process_order();
		pporder.print_order_summary();
		System.out.println();

		// DigitalProductOrder
		dporder.process_order();
		dporder.print_order_summary();
		System.out.println();
		
		// ServiceOrder
		sorder.process_order();
		sorder.print_order_summary();
		System.out.println();

	}

}
