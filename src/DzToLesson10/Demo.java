package DzToLesson10;

import java.util.Date;

/**
 * Created by Skorodielov on 17.06.2017.
 */
public class Demo {
    public static void main(String[] args) {

       Customer customer = new Customer("Вера", "Одесса", "Женский");
       Order order1 = new ElectronicsOrder("плата", new Date(), "Одесса", 1200, customer, 12);
       Order order2 = new ElectronicsOrder("Experia Z", new Date(), "Киев", 9600, customer, 12);

       Order order3 = new FurnitureOrder("hfuvbvuh", new Date(), "Львов", 750, customer, "348756");
       Order order4 = new FurnitureOrder("o8yrubu", new Date(), "Киев", 500, customer, "99999956");

       order1.validateOrder();
       order1.calculatePrice();
       order1.confirmShipping();

       order2.validateOrder();
       order2.calculatePrice();
       order2.confirmShipping();

       order3.validateOrder();
       order3.calculatePrice();
       order3.confirmShipping();

       order4.validateOrder();
       order4.calculatePrice();
       order4.confirmShipping();

    }
}
