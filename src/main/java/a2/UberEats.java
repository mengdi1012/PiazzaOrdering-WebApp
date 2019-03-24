package a2;

public class UberEats implements  HomeDeliveryService{

    public void getDeliverDetail(DeliveryDetail deliveryDetail) {
        //do nothing
    }

    public void getDeliveryDetailInJSON(String deliveryDetailInJSON) {
        System.out.println("Uber Eats - get delivery detail in JSON: " + deliveryDetailInJSON);
    }

    public void getDeliveryDetailInCSV(String deliveryDetailInCSV) {
        //do nothing
    }
}
