package a2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    private static OrderManager manager;
    private int number;
    private Map<Integer, Order> orders;

    private OrderManager() {
        this.number = 0;
        this.orders = new HashMap<Integer, Order>();
    }

    public static OrderManager getOrderManager(){
        if(manager == null){
           manager = new OrderManager();
        }
        return manager;
    }

    public OrderBuilder getOrderBuilder(){
        OrderBuilder builder = new OrderBuilder(this.number);
        return builder;
    }

    public void createNewOrder(Order newOrder){
        this.orders.put(this.number, newOrder);
    }

    public void deleteOrder(Order newOrder){
        this.orders.put(this.number, newOrder);
    }
}
