package list;

public class Customer {
    private String customer_id;
    private String customer_name;
    private long contact_no;
    private String location;

    public Customer(String customer_id, String customer_name, long contact_no, String location) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.contact_no = contact_no;
        this.location = location;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public long getContact_no() {
        return contact_no;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return "Customer{" + "Id=" + customer_id + ", Name='" + customer_name
                + '\'' + ", Contact ='" + contact_no + '\'' + ", Location ='" + location+'}';
    }
}
