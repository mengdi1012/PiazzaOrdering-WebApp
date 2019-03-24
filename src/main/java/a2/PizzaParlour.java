package a2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaParlour {
    public static void main(String[] args) throws Exception {

        OrderManager orderManager = OrderManager.getOrderManager();
        Menu menu = Menu.getMenuInstance();
//        System.out.println(menu.getPrice("medium Pepperoni"));

        while (true) {
            System.out.println("Welcome to 301 Pizza!: ");
            System.out.println("Please choose your service 1-new order or 2-current order");
            Scanner scanner = new Scanner(System.in);
            // order type
            String serviceType = scanner.nextLine();
            if(serviceType.contains("1")){
                System.out.println("Would you like to order in, or make a delivery order?: (type 'order in' or 'delivery')");
                scanner = new Scanner(System.in);
                // order type
                String orderType = scanner.nextLine();
                System.out.println("Here is our menu: " + menu);
                List<Pizza> pizzas = new ArrayList<Pizza>();
                while (true) {
                    try {
                        System.out.println("Please choose one of the following type of piazza or type # if enough: " + PizzaType.getAllTypes());
                        scanner = new Scanner(System.in);
                        String inputPizzaType = scanner.nextLine();
                        if (inputPizzaType.equals("#")) {
                            break;
                        } else {
                            PizzaType pizzaType = PizzaType.getType(inputPizzaType);
                            String pizzaTypeName = pizzaType.toString();
                            if (pizzaType.equals(PizzaType.CUSTOM)) {
                                System.out.println("Please choose one of the following CUSTOM pizzas: " + PizzaType.getAllCustomType());
                                scanner = new Scanner(System.in);
                                pizzaTypeName = scanner.nextLine();
                            }
                            System.out.println("Please choose one of the following size: " + PizzaSize.getAllSize());
                            scanner = new Scanner(System.in);
                            String inputPizzaSize = scanner.nextLine();
                            PizzaSize pizzaSize = PizzaSize.getSizes(inputPizzaSize);
                            List<Topping> toppings = new ArrayList<Topping>();
                            while (true) {
                                System.out.println("Please choose one of the following toppings or type # if enough " + Topping.getAllToppings());
                                scanner = new Scanner(System.in);
                                String inputTopping = scanner.nextLine();
                                if (inputTopping.equals("#")) {
                                    break;
                                } else {
                                    try {
                                        Topping topping = Topping.getTopping(inputTopping);
                                        toppings.add(topping);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        System.out.println("Let's try again");
                                    }
                                }
                            }
                            Pizza newPizza = new PizzaBuilder().type(pizzaTypeName).size(pizzaSize).toppings(toppings).build();
                            pizzas.add(newPizza);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Let's try again");
                    }
                }
                List<Drink> drinks = new ArrayList<Drink>();
                while (true) {
                    try {
                        System.out.println("Please choose one of the following drinks or type # if enough " + Drink.getAllDrinks());
                        scanner = new Scanner(System.in);
                        String inputDrink = scanner.nextLine();
                        if (inputDrink.equals("#")) {
                            break;
                        } else {
                            Drink drink = Drink.getDrink(inputDrink);
                            drinks.add(drink);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Let's try again");
                    }
                }
                Order newOrder = orderManager.getOrderBuilder().pizzas(pizzas).drinks(drinks).build();
                orderManager.createNewOrder(newOrder);
                System.out.println("Here is the detail of your order: " + newOrder);
                Pricer pricer = new Pricer(menu);
                Float totalPrice = pricer.getTotalPrice(newOrder);
                System.out.println("The total price is " + totalPrice.toString());
                if (!orderType.contains("delivery")) {
                    System.out.println("Enjoy your meal~");
                } else {
                    while (true) {
                        try {
                            System.out.println("Please choose one of the following delivery method" + DeliveryType.getAllDeliveryTypes());
                            scanner = new Scanner(System.in);
                            String inputDeliveryType = scanner.nextLine();
                            DeliveryType deliveryType = DeliveryType.getDevelieryType(inputDeliveryType);
                            Delivery delivery = new Delivery();
                            System.out.println("Please enter your address");
                            scanner = new Scanner(System.in);
                            String address = scanner.nextLine();
                            DeliveryDetail deliveryDetail = new DeliveryDetail(address, newOrder.toString(), Integer.toString(newOrder.getOrderNumber()));
                            delivery.requestDeliveryService(deliveryDetail, deliveryType);
                            System.out.println("Thank you, we will delivery your order to you");
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("Let's try again");
                        }

                    }
                }
                System.out.println("Order finished! press 1 to back to main page, other keys to exit");
                scanner = new Scanner(System.in);
                String command = scanner.nextLine();
                if (!command.equalsIgnoreCase("1")) {
                    scanner.close();
                    break;
                }
            }else{
                System.out.println("Please type your order number");
                scanner = new Scanner(System.in);
                int orderNumber = Integer.valueOf(scanner.nextLine().trim());
                try {
                    Order order = orderManager.getOrder(orderNumber);
                    System.out.println("Here is the detail of your order: " + order);
                    System.out.println("Do you want cancel it? yes or no");
                    scanner = new Scanner(System.in);
                    String respond = scanner.nextLine();
                    if (respond.toLowerCase().contains("y")) {
                        orderManager.deleteOrder(orderNumber);
                        System.out.println("Your order is cancelled! press 1 to back to main page, other keys to exit");
                    } else {
                        System.out.println("Press 1 to back to main page, other keys to exit");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Let's try again");
                }
            }
        }
    }
}