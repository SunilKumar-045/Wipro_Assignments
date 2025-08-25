package list;

import java.util.list;

public class CustomerDetails {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<Customer> customerdetails = new ArrayList<>();
        customerdetails.add(new Customer("A45","Sunil",8186938910L,"Hyderabad"));
        customerdetails.add(new Customer("Y44","Yogi",978410574L,"Patancheru"));
        customerdetails.add(new Customer("S40","Akhil",7894562002L,"Tirupathi"));
        customerdetails.add(new Customer("S57","Shiva",9573605866L,"Sangareddy"));
        customerdetails.add(new Customer("K25","Kedarnath",9652456975L,"Hitech-city"));
        customerdetails.add(new Customer("D55","Divakar",7561237892L,"Chennai"));
        customerdetails.add(new Customer("C003","Chinna",956237531,"Hyderabad"));

//        Collections.sort(customerdetails);

        customerdetails.remove(3);
        System.out.println("----------After Removing------------");
        Iterator<Customer> iterator = customerdetails.iterator();
        while (iterator.hasNext()){
            Customer cust = iterator.next();
            System.out.println(cust);
        }


        System.out.println("Enter the customer id to search in the list");
        String id = s.nextLine();
        Iterator<Customer> iterator1 = customerdetails.iterator();
        boolean idstatus = false;
//        while(iterator1.hasNext()){
//            Customer cust =iterator1.next();
//
//            if(cust.getCustomer_id().equals(id)){
//                idstatus = true;
//                System.out.println(cust);
//
//            }
//        }

        for (Customer cust : customerdetails) {
            if (cust.getCustomer_id() == id) {
                System.out.println("Found: " + cust);
                idstatus = true;
                break;
            }
        }

        if (!idstatus){
            System.out.println("Customer not found in the list");
        }
    }
}
