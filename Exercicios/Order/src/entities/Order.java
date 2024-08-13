package entities;

import enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter dateFormatComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itemList = new ArrayList<>();

    public Order() {
    }

    public Order(Client client, LocalDateTime moment, OrderStatus status) {
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

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void addItem(OrderItem item) {
        itemList.add(item);
    }

    public void removeItem(OrderItem item) {
        itemList.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : itemList) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento da Ordem: " + moment.format(dateFormatComplete) + "\n");
        sb.append("Status da Ordem: " + status + "\n");
        sb.append("Cliente: " + client + "\n");
        sb.append("Itens da Ordem:\n");
        for (OrderItem item : itemList) {
            sb.append(item + "\n");
        }
        sb.append("Valor Total: R$");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
