package a2;

public class InhouseDelivery implements HomeDeliveryService{
    public void getDeliverDetail(String address, String orderDetail, String orderNumber) {
        System.out.println("Pizza parlour delivery - get delivery address, order detail, order number");
    }

    public void getDeliverDetailFromCSV(String fileName) {
        //do nothing
    }

    public void getDeliverDetailFromJson(String fileName) {
        //do nothing
    }
}
