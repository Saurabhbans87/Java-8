/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package predicate.pub;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomerAuth {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Ravindra",18,true));
        customerList.add(new Customer("Arun",19,true));
        customerList.add(new Customer("Mahesh",17,false));
        customerList.add(new Customer("Mohan",20,false));
        Predicate<Customer> customerPredicate = customer -> customer.getCouple().equals(Boolean.TRUE)&&customer.getAge()>=18;
        System.out.println("Allowed customer are : " );
        for (Customer customer:customerList) {
            if(customerPredicate.test(customer)) {
                System.out.println(customer);
            }
        }
        System.out.println("Not allowed customer are : " );
        Predicate<Customer> customerPredicate1 = customer -> !customer.isCouple && customer.getAge()>=18;
        List<Customer> notAllowedCustomer = customerList.stream().filter(customerPredicate1).collect(Collectors.toList());
        System.out.println(notAllowedCustomer);

    }
}
