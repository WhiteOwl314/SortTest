package interfaceex;

public class Customer implements Buy, Sell {


    @Override
    public void buy() {
        System.out.println("Customer buy");
    }



    @Override
    public void sell() {
        System.out.println("customer sell");

    }

    @Override
    public void order() {

        System.out.println("customer order");
    }

    public void sayHello(){
        System.out.println();
    }
}
