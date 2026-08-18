class Customer {
    String name;
    String location;

    Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void sendOrder() {
        System.out.println(name + " sent an order.");
    }

    void receiveOrder() {
        System.out.println(name + " received the order.");
    }
}

class Order {
    String date;
    String number;

    Order(String date, String number) {
        this.date = date;
        this.number = number;
    }

    void confirm() {
        System.out.println("Order " + number + " is confirmed.");
    }

    void close() {
        System.out.println("Order " + number + " is closed.");
    }
}

class SpecialOrder extends Order {

    SpecialOrder(String date, String number) {
        super(date, number);
    }

    void dispatch() {
        System.out.println("Special order " + number + " is dispatched.");
    }
}

class NormalOrder extends Order {

    NormalOrder(String date, String number) {
        super(date, number);
    }

    void dispatch() {
        System.out.println("Normal order " + number + " is dispatched.");
    }

    void receive() {
        System.out.println("Normal order " + number + " is received.");
    }
}

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tharun", "Hyderabad");

        SpecialOrder special = new SpecialOrder("16-08-2026", "S001");

        NormalOrder normal = new NormalOrder("16-08-2026", "N001");

        System.out.println("CUSTOMER DETAILS");
        System.out.println("Name     : " + customer.name);
        System.out.println("Location : " + customer.location);

        System.out.println("\nSPECIAL ORDER");
        customer.sendOrder();
        special.confirm();
        special.dispatch();
        special.close();
        customer.receiveOrder();

        System.out.println("\nNORMAL ORDER");
        customer.sendOrder();
        normal.confirm();
        normal.dispatch();
        normal.receive();
        normal.close();
        customer.receiveOrder();
    }
}
