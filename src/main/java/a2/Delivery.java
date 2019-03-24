package a2;

public class Delivery implements  DeliveryService {
    DeliveryServiceAdapter deliveryAdapter;

    public void requestDeliveryService(DeliveryDetail detail, DeliveryType type) {
        if(type == DeliveryType.pickup){
            System.out.println("Already choose Pickup from store!");
        }else{
            deliveryAdapter = new DeliveryServiceAdapter(type);
            deliveryAdapter.requestDeliveryService(detail, type);
        }
    }
}
