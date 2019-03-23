package a2;

public interface HomeDeliveryService {
    public void getDeliverDetail(String address, String orderDetail, String orderNumber);
    public void getDeliverDetailFromCSV(String fileName);
    public void getDeliverDetailFromJson(String fileName);
}
