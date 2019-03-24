package a2;

public class InhouseDelivery implements HomeDeliveryService{
    public void getDeliverDetail(DeliveryDetail deliveryDetail) {
        System.out.println("Pizza parlour’s in-house delivery person");
        System.out.println(deliveryDetail);
    }

    public void getDeliveryDetailInJSON(String deliveryDetailInJSON) {
        //do nothing
    }

    public void getDeliveryDetailInCSV(String deliveryDetailInCSV) {
        //do nothing
    }
}
