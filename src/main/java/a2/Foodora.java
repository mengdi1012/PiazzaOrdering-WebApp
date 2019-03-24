package a2;

public class Foodora implements  HomeDeliveryService{

    public void getDeliverDetail(DeliveryDetail deliveryDetail) {
        //do nothing
    }

    public void getDeliveryDetailInJSON(String deliveryDetailInJSON) {
        //do nothing
    }

    public void getDeliveryDetailInCSV(String deliveryDetailInCSV) {
        System.out.println("Foodora - get delivery detail in CSV: " + deliveryDetailInCSV);
    }
}
