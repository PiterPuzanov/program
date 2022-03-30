package ru.piter.program.REST.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.piter.program.REST.DAO.OrderDAO;
import ru.piter.program.REST.models.Order;

import javax.swing.plaf.basic.BasicButtonUI;

@Controller
@RequestMapping("/orders")

public class OrderController {
    OrderDAO orderDAO;
    @Autowired
    public OrderController(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("orders", orderDAO.index());
        return "restviews/index";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("orderDAO",orderDAO.show(id));
        return "restviews/show";
    }

}
