package a2;

public class Foodora implements  HomeDeliveryService{

    public void getDeliverDetail(String address, String orderDetail, String orderNumber) {
        //do nothing
    }

    public void getDeliverDetailFromCSV(String fileName) {
        System.out.println("Foodora - get delivery detail from csv file: " + fileName);
    }

    public void getDeliverDetailFromJson(String fileName) {
        //do nothing
    }
}
