package a2;

public class DeliveryServiceAdapter implements DeliveryService{
    HomeDeliveryService homeDeliveryService;


    public DeliveryServiceAdapter(DeliveryType type) {
        if(type == DeliveryType.inhouse){
            homeDeliveryService = new InhouseDelivery();
        }else if(type == DeliveryType.ubereats){
            homeDeliveryService = new UberEats();
        }else if(type == DeliveryType.foodora){
            homeDeliveryService = new Foodora();
        }
    }


    public void requestDeliveryService(DeliveryDetail deliveryDetail, DeliveryType type) {
        if(type == DeliveryType.inhouse){
            homeDeliveryService.getDeliverDetail(deliveryDetail);
        }else if(type == DeliveryType.ubereats){
            String deliveryDetailInJSON = convertToJSON(deliveryDetail);
            homeDeliveryService.getDeliveryDetailInJSON(deliveryDetailInJSON);
        }else if(type == DeliveryType.foodora){
            String deliveryDetailInCSV = convertToCSV(deliveryDetail);
            homeDeliveryService.getDeliveryDetailInCSV(deliveryDetailInCSV);
        }
    }

    private String convertToJSON(DeliveryDetail deliveryDetail){
        String address = deliveryDetail.getAddress();
        String orderDetail = deliveryDetail.getOrderDetails();
        String orderNumber = deliveryDetail.getOrderNumber();
        return String.format("\n{\nAddress:%s, \nOrder Details: %s, \nOrder Number: %s\n}", address, orderDetail, orderNumber);
    }

    private String convertToCSV(DeliveryDetail deliveryDetail){
        String address = deliveryDetail.getAddress();
        String orderDetail = deliveryDetail.getOrderDetails();
        String orderNumber = deliveryDetail.getOrderNumber();
        return String.format("%s,%s,%s", address, orderDetail, orderNumber);
    }
}
