package interfaceex;

public class CustomerTest {

    public static void main(String[] args){

        Customer customer = new Customer();

        customer.buy();
        customer.order();
        customer.sell();
        customer.sayHello();

        Buy buyer = new Customer();
        buyer.buy();
    }

}
