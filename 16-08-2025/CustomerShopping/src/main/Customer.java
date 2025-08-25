package main;

public class Customer {
    private int custId;
    private String custName;
    private String custContact;
    private String custGender;
    private String custAddr;
    private String city;
    private String zipcode;

    // Constructor
    public Customer(int custId, String custName, String custContact,
                    String custGender, String custAddr, String city, String zipcode) {
        this.custId = custId;
        this.custName = custName;
        this.custContact = custContact;
        this.custGender = custGender;
        this.custAddr = custAddr;
        this.city = city;
        this.zipcode = zipcode;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustContact(String custContact) {
        this.custContact = custContact;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // Getters & Setters
    public int getCustId() { return custId; }
    public String getCustName() { return custName; }
    public String getCustContact() { return custContact; }
    public String getCustGender() { return custGender; }
    public String getCustAddr() { return custAddr; }
    public String getCity() { return city; }
    public String getZipcode() { return zipcode; }
}
