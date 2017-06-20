package DzToLesson7;

import DzToLesson6.Order;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Skorodielov on 08.06.2017.
 */
public class DemoHomeWork {

    static Order createOrder(){
        Date data = new Date();
        Order order = new Order(100, data, false, null, "Dnepr", "Ukraine", "Buy");
        return order;
    }

    static Order createOrderAndCallMethods(){
        Date data = new Date();
        Order order = new Order(100, data, true, data, "Kiev", "Ukraine", "SomeValue");
        order.confirmOrder();
        order.checkPrice();
        order.isValidType();
        return order;

    }

    public static void main(String[] args) {


    }
}
