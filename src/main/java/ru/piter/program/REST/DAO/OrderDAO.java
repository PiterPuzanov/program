package ru.piter.program.REST.DAO;

import org.springframework.stereotype.Component;
import ru.piter.program.REST.models.Order;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDAO {
    private static int COUT;
     List<Order> orders;
    {
        orders = new ArrayList<>();
        orders.add(new Order(COUT++,"hui", 2,3));
        orders.add(new Order(COUT++,"huadxai", 5,7));
    }

    public List<Order> index(){
        return  orders;
    }

    public Object show(int id){

        return orders.stream().filter(order -> order.getId()==id).findAny().orElse(null);
    }
    public void save(Order order){
        order.setId(3);
        orders.add(order);
    }
}