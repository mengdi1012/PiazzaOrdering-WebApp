package a2;

public enum DeliveryType {
    pickup("Pickup from store"), inhouse("own"), ubereats("Uber Eats"), foodora("Foodora");

    private final String type;
    private DeliveryType(String type)
    {
        this.type=type;
    }

    @Override
    public String toString()
    {
        return type;
    }

    public static String getAllDeliveryTypes(){
        StringBuffer sb = new StringBuffer();
        for(DeliveryType type: DeliveryType.values()){
            sb.append("[" + type.toString() + "]");
            sb.append(" ");
        }
        return sb.toString();
    }

    public static DeliveryType getDevelieryType(String inputDevelieryType) throws Exception {
        for(DeliveryType type: DeliveryType.values()){
            if(type.toString().equalsIgnoreCase(inputDevelieryType)){
                return type;
            }
        }
        throw new Exception("Delivery type not found: " + inputDevelieryType);
    }
}
