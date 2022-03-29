package ru.piter.program.REST.model;

public class Order{
    private int id;
    private String consumer;
    private int productAmount;
    private int totalCost;

    public Order(int id, String consumer, int productAmount, int totalCost) {
        this.id = id;
        this.consumer = consumer;
        this.productAmount = productAmount;
        this.totalCost = totalCost;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}