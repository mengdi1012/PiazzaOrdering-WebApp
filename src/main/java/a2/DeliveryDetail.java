package a2;

public class DeliveryDetail {
    private String address;
    private String orderDetails;
    private String orderNumber;

    public DeliveryDetail(String address, String orderDetails, String orderNumber) {
        this.address = address;
        this.orderDetails = orderDetails;
        this.orderNumber = orderNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
}
