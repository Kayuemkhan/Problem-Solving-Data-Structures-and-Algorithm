package OOP;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
 class Counter {
    int count = 0;

     public void incrementObject(Counter c) {
         c.count = c.count + 1;
     }

     public void reassignObject(Counter c) {
         c = new Counter();
         c.count = 100;
     }
}

class RunProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.0);
        Product p2 = new Product("Laptop", 1000.0);
        Product p3 = p1;

        System.out.println(p1 == p2);    // Line A
        System.out.println(p1 == p3);    // Line B
        System.out.println(p1.equals(p2)); // Line C

        int num = 5;

        Counter counter = new Counter();

        counter.incrementObject(counter);
        System.out.println(counter.count);  // Line 2


    }
    public static int incrementPrimitive(int x) {
        x = x + 1;
        return x;
    }
}
