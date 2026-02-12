package enumEstudo.app;

import enumEstudo.entities.Order;
import enumEstudo.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Order order = new Order(1090, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        //conversao de string pra enum:
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
