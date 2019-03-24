package a2;

public class UberEats implements  HomeDeliveryService{

    public void getDeliverDetail(String address, String orderDetail, String orderNumber) {
        //do nothing
    }

    public void getDeliverDetailFromCSV(String fileName) {
        //do nothing
    }

    public void getDeliverDetailFromJson(String fileName) {
        System.out.println("Ubereats - get delivery detail from JSON file: " + fileName);
    }
}
