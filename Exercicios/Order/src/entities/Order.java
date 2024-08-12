package entities;

import enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itemList = new ArrayList<>();

    public Order() {
    }

    public Order(Client client, LocalDate moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public void addItem(OrderItem item) {

    }

    public void removeItem(OrderItem item) {

    }

    public Double total() {
        return
    }
}
