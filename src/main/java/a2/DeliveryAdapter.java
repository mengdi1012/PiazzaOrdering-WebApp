package a2;

public class DeliveryAdapter implements DeliveryService{
    HomeDeliveryService homeDeliveryService;


    public DeliveryAdapter(DeliveryType type) {
        if(type == DeliveryType.inhouse){
            homeDeliveryService = new InhouseDelivery();
        }else if(type == DeliveryType.ubereats){
            homeDeliveryService = new UberEats();
        }else if(type == DeliveryType.foodora){
            homeDeliveryService = new Foodora();
        }
    }


    public void requestDeliveryService(DeliveryDetail detail, DeliveryType type) {
        if(type == DeliveryType.inhouse){
            homeDeliveryService.getDeliverDetail(detail.getAddress(), detail.getOrderDetails(), detail.getOrderNumber());
        }else if(type == DeliveryType.ubereats){
            //save detail into a json format file called DeliveryDetail.json
            homeDeliveryService.getDeliverDetailFromJson("DeliveryDetail.json");
        }else if(type == DeliveryType.foodora){
            //save detail into a csv format file called DeliveryDetail.json
            homeDeliveryService.getDeliverDetailFromCSV("DeliveryDetail.csv");
        }
    }
}
