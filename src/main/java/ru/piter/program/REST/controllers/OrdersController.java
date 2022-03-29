package ru.piter.program.REST.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.piter.program.REST.DAO.OrderDAO;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    private final OrderDAO orderDAO;
    @Autowired
    public OrdersController(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @GetMapping()
    public String showAllOrders(Model model){
        return "orders/allorders";
    }

    @GetMapping("/{id}")
    public String showOrderDetails(@PathVariable("id") int id, Model model){
        return "orders/orderdetail";
    }

}
