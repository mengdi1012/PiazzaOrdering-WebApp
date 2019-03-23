package a2;

public class Delivery implements  DeliveryService {
    DeliveryAdapter deliveryAdapter;

    public void requestDeliveryService(DeliveryDetail detail, DeliveryType type) {
        if(type == DeliveryType.pickup){
            System.out.println("Already choose Pickup from store!");
        }else{
            deliveryAdapter = new DeliveryAdapter(type);
            deliveryAdapter.requestDeliveryService(detail, type);
        }
    }
}
