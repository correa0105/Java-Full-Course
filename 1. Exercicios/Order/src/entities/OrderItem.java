package entities;

public class OrderItem {
    private Integer quantity;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return getProduct().getPrice() * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", R$"
                + String.format("%.2f", getProduct().getPrice())
                + ", Quantidade: "
                + quantity
                + ", Valor Total: R$"
                + String.format("%.2f", subTotal());
    }
}
